package vn.edu.tinhoc123.CoffeeMan007.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import vn.edu.tinhoc123.CoffeeMan007.models.entities.Employee;
import vn.edu.tinhoc123.CoffeeMan007.utils.DatabaseConnection;

public class EmployeeRepositoryImpl implements EmployeeRepository {
	Connection conn;
	 
	public Connection getConn() {
		return conn;
	}

	public EmployeeRepositoryImpl() {
		super();
		this.conn = DatabaseConnection.getConnection("coffeemandb","root", "") ;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> findById(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean save(Employee employee) {
		//Chuẩn bị câu SQL
		String sqlThem = "INSERT INTO employees (name, position, salary, phone_number, email, is_active, username, password, id_card_number) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement lenh = conn.prepareStatement(sqlThem);
			// Truyền tham số  (cột, giá trị)
			lenh.setString(1, employee.getName() );
			lenh.setString(2, employee.getPosition() );
			lenh.setDouble(3, employee.getSalary()  );
			lenh.setString(4, employee.getPhoneNumber() );
			lenh.setString(5, employee.getEmail() );
			lenh.setBoolean(6, employee.isActive() );
			lenh.setString(7, employee.getUsername() );
			lenh.setString(8, employee.getPassword() );
			lenh.setString(9, employee.getIdCardNumber() );
			
			// Thự thi lệnh
			int n = lenh.executeUpdate(); 
			if (n>0) return true;
			else return false;
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> findByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	

	

}
