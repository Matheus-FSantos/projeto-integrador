package br.com.senacsp.projetointegrador.model.domain;

import java.io.Serializable;
import java.sql.Date;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String email;
	private String RGF;
	private String RG;
	private String CPF;
	
	private Date createdAt;
	private Date updatedAt;
	
	public Employee() {
		
	}
	
	public Employee(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public Employee(String id, String name, String email, String RGF, String RG, String CPF,Date createdAt, Date updatedAt) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.RGF = RGF;
		this.RG = RG;
		this.CPF = CPF;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", RGF=" + RGF + ", RG=" + RG + ", CPF="
				+ CPF + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getId() {
		return id;
	}
	
	public void updateId(String id) {
		this.setId(id);
	}

	private void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void updateName(String name) {
		this.setName(name);
	}

	private void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void updateEmail(String email) {
		this.setEmail(email);
	}
	
	private void setEmail(String email) {
		this.email = email;
	}

	public String getRGF() {
		return RGF;
	}
	
	public void updateRGF(String RGF) {
		this.setRGF(RGF);
	}

	private void setRGF(String RGF) {
		this.RGF = RGF;
	}

	public String getRG() {
		return RG;
	}
	
	public void updateRG(String RG) {
		this.setRG(RG);
	}

	private void setRG(String RG) {
		this.RG = RG;
	}

	public String getCPF() {
		return CPF;
	}
	
	public void updateCPF(String CPF) {
		this.setCPF(CPF);
	}

	private void setCPF(String cPF) {
		CPF = cPF;
	}

	public Date getCreatedAt() {
		return createdAt;
	}
	
	public void updateCreatedAt(Date createdAt) {
		this.setCreatedAt(createdAt);
	}

	private void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	public void updateUpdatedAt(Date updatedAt) {
		this.setUpdatedAt(updatedAt);
	}

	private void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
}
