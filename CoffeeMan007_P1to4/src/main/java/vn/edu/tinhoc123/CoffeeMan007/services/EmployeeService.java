package vn.edu.tinhoc123.CoffeeMan007.services;

import vn.edu.tinhoc123.CoffeeMan007.models.entities.Employee;
import vn.edu.tinhoc123.CoffeeMan007.repositories.EmployeeRepositoryImpl;

public class EmployeeService {
	EmployeeRepositoryImpl employeeRep;
	
	public EmployeeService() {
		employeeRep= new EmployeeRepositoryImpl();
	}

	public boolean save(Employee employee) {
		// Xử lý khác ở đây
		return 	employeeRep.save(employee);
	}
}
