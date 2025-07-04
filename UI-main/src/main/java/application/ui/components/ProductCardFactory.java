package application.ui.components;

import application.model.Product;
import application.model.Review;
import application.ui.common.LabelFactory;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class ProductCardFactory {
    public static VBox createProductCard(Product product) {
        VBox card = new VBox(10);
        card.setAlignment(Pos.CENTER_LEFT);
        card.getStyleClass().add("product-card");

        // Ảnh
        ImageView iv = new ImageView();
        String raw = product.image_url != null ? product.image_url.trim() : "";
        if (raw.startsWith("//")) raw = "https:" + raw;
        try {
            HttpURLConnection hc = (HttpURLConnection) new URL(raw).openConnection();
            hc.setRequestProperty("User-Agent",
                    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36");
            if (hc.getResponseCode() == 200) {
                try (InputStream is = hc.getInputStream()) {
                    iv.setImage(new Image(is, 270, 180, true, true));
                }
            } else {
                throw new Exception("HTTP " + hc.getResponseCode());
            }
        } catch (Exception e) {
            iv.setImage(new Image("https://via.placeholder.com/270x180.png?text=No+Image", true));
        }

        // Model + Price
        Label name = new Label(product.model);
        name.getStyleClass().add("product-name");

        String rawPrice = product.price;
        String priceText;
        if (rawPrice != null && !rawPrice.isBlank()) {
            try {
                long v = Long.parseLong(rawPrice);
                NumberFormat fmt = NumberFormat.getInstance(new Locale("vi", "VN"));
                priceText = fmt.format(v) + "₫";
            } catch (Exception ex) {
                priceText = rawPrice + "₫";
            }
        } else {
            priceText = "Đang cập nhật";
        }
        Label price = new Label("Giá: " + priceText);
        price.getStyleClass().add("product-price");

        card.getChildren().addAll(iv, name, price);

        // Chi tiết
        Node[] details = LabelFactory.revealLabel(product);
        for (Node detail : details) {
            detail.getStyleClass().add("product-detail");
        }

        // Đánh giá
        VBox reviewBox = new VBox(5);
        reviewBox.setStyle("-fx-padding: 10; -fx-background-color: white;"); // nền trắng

        Label ttl = new Label("Đánh giá:");
        ttl.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: black;");
        reviewBox.getChildren().add(ttl);

        if (product.reviews != null && !product.reviews.isEmpty()) {
            for (Review r : product.reviews) {
                String txt = r.author + ": " +
                        ((r.comment == null || r.comment.isBlank())
                                ? "(Không có bình luận)"
                                : r.comment);
                Label l = new Label(txt);
                l.setWrapText(true); // ✅ xuống dòng nếu dài
                l.setStyle("-fx-text-fill: black; -fx-font-size: 13px; -fx-font-family: 'Arial';");
                reviewBox.getChildren().add(l);
            }
        } else {
            Label empty = new Label("Chưa có đánh giá.");
            empty.setStyle("-fx-text-fill: black;");
            reviewBox.getChildren().add(empty);
        }

        // Gom chi tiết vào 1 VBox detailBox
        VBox detailBox = new VBox(5);
        detailBox.getChildren().addAll(details);
        detailBox.getChildren().add(reviewBox);
        detailBox.setVisible(false);
        detailBox.setManaged(false);

        card.setOnMouseEntered(e -> showDetail(true, detailBox));
        card.setOnMouseExited(e -> showDetail(false, detailBox));

        card.getChildren().add(detailBox);
        return card;
    }

    private static void showDetail(boolean show, Node... nodes) {
        for (Node n : nodes) {
            n.setVisible(show);
            n.setManaged(show);
        }
    }
}