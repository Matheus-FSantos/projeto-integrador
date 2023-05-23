package br.com.senacsp.projetointegrador.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import java.util.ArrayList;
import java.util.List;

import br.com.senacsp.projetointegrador.model.configuration.Connection;

import br.com.senacsp.projetointegrador.model.domain.Employee;

public class EmployeeDAO {
	
	private String SQLQuery;
	private Connection connection;
	
	public EmployeeDAO() {
		this.SQLQuery = "";
		this.connection = new Connection();
	}

	public List<Employee> findAll() throws SQLException{
		List<Employee> employees = new ArrayList<Employee>();
		this.setSQLQuery("SELECT * FROM employee");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		ResultSet result = preparedStatement.executeQuery();
		
		while(result.next()) {
			employees.add(new Employee(result.getString("id"), result.getString("name"), result.getString("email"), result.getString("RGF"), result.getString("RG"), result.getString("CPF"), result.getDate("createdAt"), result.getDate("updatedAt")));
		}
		
		return employees;
	}
	
	public String getSQLQuery() {
		return this.SQLQuery;
	}
	
	public void setSQLQuery(String SQLQuery) {
		this.SQLQuery = SQLQuery;
	}
	
	public Connection getConnection() {
		return this.connection;
	}
	
}
