🖥️ Seventeen's Store - Website Bán Máy Tính
Ứng dụng web JavaFX hỗ trợ bán máy tính, tích hợp chatbot AI và kết nối cơ sở dữ liệu.

📌 Tổng Quan Dự Án
Seventeen's Store là một dự án ứng dụng web được phát triển bằng Java, là bài tập học phần Lập trình Hướng Đối tượng (OOP). Ứng dụng mô phỏng một cửa hàng trực tuyến bán máy tính, giao diện thân thiện với người dùng, tích hợp chatbot sử dụng Gemini API và kết nối với cơ sở dữ liệu để quản lý sản phẩm.

IDE: IntelliJ IDEA (Community Edition)

✨ Tính Năng Nổi Bật
🔍 Duyệt sản phẩm: Hiển thị danh mục máy tính với thông tin chi tiết.

🎯 Tìm kiếm & lọc: Bộ lọc nâng cao giúp tìm sản phẩm theo nhu cầu cụ thể.

💬 Chatbot hỗ trợ: Tích hợp chatbot sử dụng Gemini API để hỗ trợ khách hàng.

🖼️ Giao diện đáp ứng: Xây dựng bằng JavaFX với thiết kế hiện đại.

🗄️ Kết nối CSDL: Truy xuất dữ liệu từ API nội bộ.

🛠️ Công Nghệ Sử Dụng
Công Nghệ	Vai Trò
Java 21	Ngôn ngữ lập trình chính
JavaFX 21	Giao diện người dùng đồ họa
Maven	Quản lý phụ thuộc và build project
Jackson 2.15.2	Xử lý JSON
OkHttp 4.10.0	Gửi yêu cầu HTTP
Gemini API	Hệ thống AI Chatbot
IntelliJ IDEA	Môi trường phát triển (IDE)

📁 Cấu Trúc Dự Án
css
Copy
Edit
UI-main [javafx-ui]
├── .idea
├── src
│   └── main
│       ├── java
│       │   └── application
│       │       ├── model
│       │       │   ├── ChatMessage.java
│       │       │   ├── Product.java
│       │       │   └── Review.java
│       │       ├── service
│       │       │   ├── ChatbotService.java
│       │       │   ├── GeminiService.java
│       │       │   ├── ProductClient.java
│       │       │   └── ProductService.java
│       │       └── ui
│       │           ├── common
│       │           │   └── LabelFactory.java
│       │           ├── components
│       │           │   ├── ChatbotPanelFactory.java
│       │           │   ├── ChatBubbleFactory.java
│       │           │   ├── NavBarFactory.java
│       │           │   ├── ProductCardFactory.java
│       │           │   └── SearchFormFactory.java
│       │           └── layout
│       │               └── Main.java
│       └── resources
│           └── style.css
└── pom.xml
🚀 Hướng Dẫn Cài Đặt
1. Clone Repository
bash
Copy
Edit
git clone https://github.com/your-repo/seventeens-store.git
cd seventeens-store
2. Cài Đặt Phụ Thuộc
Đảm bảo bạn đã cài đặt Maven

bash
Copy
Edit
mvn install
3. Thiết Lập Cơ Sở Dữ Liệu
Ứng dụng kết nối tới API tại:
http://localhost:8081/api/building

Đảm bảo API đang chạy trên máy cục bộ.

4. Cấu Hình API Key cho Gemini
API key mẫu được hard-code trong GeminiService.java:

lua
Copy
Edit
AIzaSyCOmuIjXZN--2VqFpbpiX1sKPKeL3U6fuk
Thay thế bằng API key hợp lệ của bạn nếu cần.

5. Chạy Ứng Dụng
Chạy bằng Maven:

bash
Copy
Edit
mvn javafx:run
Hoặc mở trong IntelliJ IDEA và chạy Main.java

📘 Cách Sử Dụng
Tính Năng	Hướng Dẫn Sử Dụng
🧭 Điều hướng	Sử dụng thanh điều hướng để quay về trang chủ
🔎 Tìm kiếm	Nhập từ khóa để tìm sản phẩm theo tên hoặc model
🧰 Bộ lọc	Nhấn "Filter" để lọc nâng cao
💬 Chatbot	Nhấn nút "💬 Chat" để tương tác với chatbot
ℹ️ Chi tiết sản phẩm	Di chuột qua sản phẩm để xem cấu hình và đánh giá

🤝 Đóng Góp
Chúng tôi hoan nghênh mọi đóng góp!

Fork repository

Tạo nhánh mới: feature/your-feature-name

Commit và push thay đổi

Tạo Pull Request với mô tả chi tiết

📄 Giấy Phép
Dự án được cấp phép theo MIT License.
