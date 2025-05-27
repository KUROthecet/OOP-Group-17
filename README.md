# OOP-Group-17

Seventeen's Store - Website Bán Máy Tính
Tổng Quan Dự Án
Dự án này là một ứng dụng web dựa trên Java, được phát triển như một bài tập cho môn Lập trình Hướng Đối tượng (OOP). Đây là một cửa hàng trực tuyến bán máy tính, với giao diện thân thiện, tích hợp chatbot sử dụng Gemini API để hỗ trợ khách hàng và kết nối với cơ sở dữ liệu để quản lý sản phẩm. Dự án được xây dựng bằng phiên bản miễn phí của IntelliJ IDEA.
Tính Năng

Duyệt Sản Phẩm: Người dùng có thể xem danh mục máy tính với thông tin chi tiết về cấu hình.
Tìm Kiếm và Lọc: Tìm kiếm nâng cao và bộ lọc để tìm sản phẩm theo nhu cầu cụ thể.
Chatbot Hỗ Trợ: Chatbot tích hợp sử dụng Gemini API để trả lời câu hỏi của người dùng.
Giao Diện Đáp Ứng: Giao diện hiện đại và thân thiện, được xây dựng bằng JavaFX.
Kết Nối Cơ Sở Dữ Liệu: Lấy dữ liệu sản phẩm từ API cơ sở dữ liệu cục bộ.

Công Nghệ Sử Dụng

Java 21: Ngôn ngữ lập trình chính.
JavaFX 21: Dùng để xây dựng giao diện người dùng đồ họa.
Maven: Quản lý phụ thuộc và tự động hóa quá trình xây dựng.
Jackson 2.15.2: Xử lý serialization và deserialization JSON.
OkHttp 4.10.0: Thực hiện các yêu cầu HTTP.
Gemini API: Cung cấp chức năng cho chatbot.
IntelliJ IDEA (Phiên bản miễn phí): IDE dùng để phát triển dự án.

Cấu Trúc Dự Án
Dự án tuân theo cấu trúc tiêu chuẩn của Maven với các thư mục và tệp chính như sau:

src/main/java/application: Chứa mã nguồn Java.
model: Các mô hình dữ liệu cho tin nhắn chat, sản phẩm và đánh giá.
service: Các lớp dịch vụ xử lý logic chatbot, tích hợp Gemini API và lấy dữ liệu sản phẩm.
ui: Các thành phần giao diện người dùng và bố cục.


src/main/resources: Chứa tài nguyên như tệp CSS.
pom.xml: Tệp cấu hình Maven.

Cấu Trúc Thư Mục Chi Tiết
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

Hướng Dẫn Cài Đặt
Để cài đặt và chạy dự án trên máy cục bộ, làm theo các bước sau:

Sao Chép Repository:
git clone https://github.com/your-repo/seventeens-store.git
cd seventeens-store


Cài Đặt Phụ Thuộc:Đảm bảo bạn đã cài đặt Maven. Chạy lệnh sau để cài đặt các phụ thuộc:
mvn install


Thiết Lập Cơ Sở Dữ Liệu:

Ứng dụng kết nối với API cơ sở dữ liệu cục bộ tại http://localhost:8081/api/building.
Đảm bảo máy chủ cơ sở dữ liệu đang chạy và có thể truy cập được.


Cấu Hình API Key:

Chatbot sử dụng Gemini API, yêu cầu một API key.
API key hiện được hardcode trong GeminiService.java là AIzaSyCOmuIjXZN--2VqFpbpiX1sKPKeL3U6fuk. Đảm bảo key này hợp lệ hoặc thay bằng key của bạn.


Chạy Ứng Dụng:

Sử dụng Maven để chạy ứng dụng:mvn javafx:run


Hoặc mở dự án trong IntelliJ IDEA và chạy lớp Main.



Cách Sử Dụng

Điều Hướng: Sử dụng thanh điều hướng để quay lại trang chủ.
Tìm Kiếm: Nhập từ khóa vào trường tìm kiếm để tìm sản phẩm theo model.
Lọc: Nhấn nút "Filter" để mở bảng lọc và áp dụng các bộ lọc nâng cao.
Chatbot: Nhấn nút "💬 Chat" để trò chuyện với chatbot và nhận hỗ trợ.
Chi Tiết Sản Phẩm: Di chuột qua thẻ sản phẩm để xem thông số chi tiết và đánh giá.

Hướng Dẫn Đóng Góp
Chúng tôi hoan nghênh mọi đóng góp! Vui lòng làm theo các bước sau:

Fork repository.
Tạo một nhánh mới cho tính năng hoặc sửa lỗi của bạn.
Commit các thay đổi và đẩy lên fork của bạn.
Mở một pull request với mô tả chi tiết về thay đổi của bạn.

Giấy Phép
Dự án này được cấp phép theo Giấy phép MIT. Xem tệp LICENSE để biết thêm chi tiết.
