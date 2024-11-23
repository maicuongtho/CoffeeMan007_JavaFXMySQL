package vn.edu.tinhoc123.CoffeeMan007.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import vn.edu.tinhoc123.CoffeeMan007.models.entities.Employee;
import vn.edu.tinhoc123.CoffeeMan007.services.EmployeeService;

public class EmployeeController {
	@FXML
    private TextField nameField, positionField, salaryField, phoneField, emailField, usernameField,idCardNumberField;
    
    @FXML
    private PasswordField passwordField;
    
    @FXML
    private TableView<Employee> employeeTableView;
    @FXML
    private TableColumn<Employee, Integer> idColumn;
    @FXML
    private TableColumn<Employee, String> nameColumn, positionColumn, phoneColumn, emailColumn;
    @FXML
    private TableColumn<Employee, Double> salaryColumn;
    
    @FXML
    private Label errorMessageLabel;
    
   
    EmployeeService employeeService = new EmployeeService();
	
	
	// Phương thức để lưu thông tin nhân viên
    @FXML
    private void handleAddEmployee() {
        // Lưu thông tin nhân viên
    	
    	// lấy dữ liệu từ các trường thông tin
    	// lấy tên
    	String ten =nameField.getText();
    	// lấy chức vụg
    	String chucvu = positionField.getText();
    	Double luong  =  Double.parseDouble(salaryField.getText());
    	String sdt =phoneField.getText();
    	String mail = emailField.getText();
    	String unam = usernameField.getText();
    	String upass = passwordField.getText();
    	String cardID =idCardNumberField.getText();
    	
    	Employee nv = new Employee(ten, chucvu,  luong, 
    								sdt, mail,  true, 
    								unam, upass, cardID);
    	// gọi pt save của lớp EmplyeeService
    	boolean kq= employeeService.save(nv);
    	// kiểm tra kết quả, và thông báo (hộp thông báo)
    	if (kq==true)// thông báo thành công
    	{
    		showAlert("Thông báo", "Đã thêm xong", AlertType.INFORMATION );
    	}
    	else // thông báo không thêm được
    	{
    		showAlert("Thông báo", "Có lỗi khi thêm", AlertType.ERROR );
    	}
    	
    }
    
    // Phương thức hiển thị thông báo
    private void showAlert(String title, String message, AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    
    // Phương thức để cập nhật thông tin nhân viên
    @FXML
    private void handleEditEmployee() {
        // Cập nhật thông tin nhân viên
    }

    // Phương thức để xóa nhân viên
    @FXML
    private void handleDeleteEmployee() {
        // Xóa nhân viên
    }

}
