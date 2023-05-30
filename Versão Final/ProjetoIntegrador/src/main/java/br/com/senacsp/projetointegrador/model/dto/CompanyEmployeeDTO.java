package br.com.senacsp.projetointegrador.model.dto;

import java.io.Serializable;

public class CompanyEmployeeDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String company;
	private String employee;
	
	public CompanyEmployeeDTO(String company, String employee) {
		this.company = company;
		this.employee = employee;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}
		
}
