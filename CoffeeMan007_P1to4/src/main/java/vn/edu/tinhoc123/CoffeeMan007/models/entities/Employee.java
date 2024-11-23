package vn.edu.tinhoc123.CoffeeMan007.models.entities;

public class Employee {
	private int id;                // Mã nhân viên
	private String name;           // Tên nhân viên
	private String position;       // Chức vụ (nhân viên, quản lý, ...)
	private double salary;         // Lương
	private String phoneNumber;    // Số điện thoại liên lạc
	private String email;          // Email liên lạc
	private boolean isActive;      // Trạng thái (đang làm việc hay đã nghỉ việc)
	private String username;       // Tên đăng nhập
	private String password;       // Mật khẩu (có thể mã hóa)
	private String idCardNumber;   // Số căn cước công dân
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIdCardNumber() {
		return idCardNumber;
	}
	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}
	
	/**
	 * 
	 */
	public Employee() {
		super();
	}
	/**
	 * @param name
	 * @param position
	 * @param salary
	 * @param phoneNumber
	 * @param email
	 * @param isActive
	 * @param username
	 * @param password
	 * @param idCardNumber
	 */
	public Employee(String name, String position, double salary, String phoneNumber, String email, boolean isActive,
			String username, String password, String idCardNumber) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.isActive = isActive;
		this.username = username;
		this.password = password;
		this.idCardNumber = idCardNumber;
	}
	
	// Hàm tạo
	
	
	//Getter/Setter
	 
}

