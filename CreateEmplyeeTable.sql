CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,          	-- Mã nhân viên tự tăng
    name VARCHAR(255) NOT NULL,                 	-- Tên nhân viên
    position VARCHAR(255) NOT NULL,             	-- Chức vụ
    salary DOUBLE NOT NULL,                     	-- Lương nhân viên
    phone_number VARCHAR(15),                   	-- Số điện thoại
    email VARCHAR(255),                         	-- Email nhân viên
    is_active BOOLEAN DEFAULT TRUE,             	-- Trạng thái nhân viên (còn làm việc hay không)
    username VARCHAR(255) UNIQUE NOT NULL,      	-- Tên đăng nhập
    password VARCHAR(255) NOT NULL,             	-- Mật khẩu
    id_card_number VARCHAR(20),                 	-- Số căn cước công dân
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Thời gian tạo nhân viên
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP -- Thời gian cập nhật nhân viên
);
