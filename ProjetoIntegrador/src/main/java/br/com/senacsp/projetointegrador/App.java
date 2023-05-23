package br.com.senacsp.projetointegrador;

import java.sql.SQLException;
import java.util.List;

import br.com.senacsp.projetointegrador.model.domain.Employee;
import br.com.senacsp.projetointegrador.model.service.EmployeeService;

public class App {

	public void init() {
		System.out.println("Olá web");
		List<Employee> employees = null;
		
		try {
			employees = new EmployeeService().findAll();
		} catch(SQLException sqlException) {
			System.out.println(sqlException.getMessage());
		}
		
		if(employees.isEmpty())
			return;
		
		employees.forEach(employee -> {
			System.out.println(employee);
		});
	}
	
}
