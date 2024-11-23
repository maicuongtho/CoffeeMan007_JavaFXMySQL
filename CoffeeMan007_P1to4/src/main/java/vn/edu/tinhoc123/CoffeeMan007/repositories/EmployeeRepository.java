package vn.edu.tinhoc123.CoffeeMan007.repositories;

import java.util.List;
import java.util.Optional;

import vn.edu.tinhoc123.CoffeeMan007.models.entities.Employee;

public interface EmployeeRepository {
	
	public List<Employee> findAll();
	
	Optional<Employee> findById(int id);

	boolean save(Employee employee);
	
	boolean update(Employee employee);
	
	boolean delete(int id);
	
	List<Employee> findByName(String name);
	
	Optional<Employee> findByUsernameAndPassword(String username, String password);
}
