package br.com.senacsp.projetointegrador.model.service;

import java.sql.SQLException;
import java.util.List;

import br.com.senacsp.projetointegrador.model.dao.EmployeeDAO;
import br.com.senacsp.projetointegrador.model.domain.Employee;

public class EmployeeService {

	private EmployeeDAO employeeDAO;
	
	public EmployeeService() {
		this.employeeDAO = new EmployeeDAO();
	}	
	
	public List<Employee> findAll() throws SQLException {
		List<Employee> employees = this.getEmployeeDAO().findAll();
		
		if(employees.isEmpty())
			return null;
		
		return employees; 
	}

	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

}
