# SERVER ỨNG DỤNG QUẢN LÝ THỜI GIAN UỐNG THUỐC (CƠ BẢN)

Là server được viết bằng java với framework là spring boot. Hiện tại server để quản lý service là user.

## Getting Started
<h1 align="center"> MEDICINE SERVER </h1>
<p align = "center">Server Quản lý quy trình uống thuốc.</p>

## Mục lục
- [Cách cài đặt](#install)
- [Cách khởi chạy](#run)
- [Cấu trúc](#lib)
- [Chạy thử](#demo)

## Cách Cài Đặt <a name = "install"></a>

### 💡 Bắt Buộc Cài Đặt
- Cài Đặt SDK Java: 
Kiểm tra xem đã cài đặt hay chưa: (mở cmd)
```
java -version
```
Nếu trên máy chưa cài đặt thì làm theo hướng dẫn sau [Java SDK](https://www.youtube.com/watch?v=IJ-PJbvJBGs).
- Cài Đặt Intellij : IDE hỗ trợ code và debug [Tải về Intellij thử nghiệm](https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows).

### Source Code
- Tải Về Source Code Từ Git Này Để Bắt Đầu Chạy Server.

## 💡 Cách Khởi Chạy <a name = "run"></a>
- Bước 1: Mở IDE Intellij và open souce code vừa tải về từ git.
- Bước 2: Chờ thanh góc phải màn hình load xong package.
- Bước 3: Bấm vào button có dạng start ở góc trên bên phải màn hình để bắt đầu.
- Bước 4: Test API với các engine hỗ trợ như chrome hoặc postman với đường dẫn là: http://localhost:8080/user
Chú ý: Nếu mọi người đang cùng xài chung mạng wifi thì dùng cmd tìm ip của máy:
```
ipconfig
```
Sau đó thay localhost thành ip của máy thì các máy khác sẽ có thể truy cập được ví dụ: http://192.168.1.27:8080/user
### Ứng Dụng Có Sử Dụng Các Thư Viện Hỗ Trợ
Được cài đặt theo gói pub get trong tệp pubspec.yaml
1. material-design: (có sẵn khi cài đặt gói).
2. assets image: (import hình ảnh để sử dụng cho dự án).
3. dev_dependencies: (hỗ trợ việc code web app).
4. fl_chart: ^0.12.0 (hỗ trợ vẽ line chart).
5. cupertino_icons: ^1.0.1 (để sử dụng icon của có sẵn của flutter).

## IDE sử dụng <a name = "ide"></a>
- Sử dụng visual studio code [Visual Studio code](https://code.visualstudio.com/)

### 💡 Test chương trình bằng web chrome
Bật phân quyền beta và cho web run web
```
 $ flutter channel beta
 $ flutter upgrade
 $ flutter config --enable-web
```

Chạy test ứng dụng trên chrome
```
$ cd MyApp
$ flutter run -d chrome
```
## Cấu trúc lib <a name="lib"></a>
### 💡 Lib
1. [DesktopScreen](#)
2. [Model](#)
3. [home](#)
4. [detail](#)

```main.dart```

### 💡 Screen View trên các device
Hiển thị trên 2 loại màn hình smartphone (width<800) và desktop (width>=800)
```
LayoutBuilder(
      builder: (context, constraints) {
        if (constraints.maxWidth < 800) {
          return HomeScreen();
        } else {
          return DesktopScreen(size: size);
        }
      },
    );
 ```
 
## Các PageView <a name="pageview"></a>
1. [Trang chủ](#home)
2. [Detail Tree](#detail)

### 💡 Trang Chủ <a name="home"></a>

This project is a starting point for a Flutter application.

A few resources to get you started if this is your first Flutter project:

- [Lab: Write your first Flutter app](https://flutter.dev/docs/get-started/codelab)
- [Cookbook: Useful Flutter samples](https://flutter.dev/docs/cookbook)

For help getting started with Flutter, view our
[online documentation](https://flutter.dev/docs), which offers tutorials,
samples, guidance on mobile development, and a full API reference.
