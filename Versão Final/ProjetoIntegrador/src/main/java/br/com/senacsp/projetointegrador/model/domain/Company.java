package br.com.senacsp.projetointegrador.model.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <h1 align='center'>Company.class</h1>
 * <hr>
 * <p>
 * Classe de Dominio do sistema, ela que controla todos os dados reais das empresas que são cadastradas no sistema,
 * *seguindo a uml do projeto*
 * <em>
 * (Sujeito a alterações)
 * </em>
 * </p>
 * <br>
 * <p>GitHub do Projeto: <em>http://github.com/Matheus-FSantos/projeto-integrador</em></p>
 * <br>
 * @version 1.1
 * @since 1.0
 * @category Class
 * @author Matheus Ferreira Santos
*/
public class Company implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String name;
	private String CNPJ;
	
	private List<Address> address = new ArrayList<Address>();

	private Date createdAt;
	private Date updatedAt;

	/**
	 * <h1 align='center'>Construtor</h1>
	 * <hr>
	 * <p>Método construtor padrão da classe</p>
	 * @version 1.1
	 * @since 1.0
	 * @author Matheus Ferreira Santos
	 * @category Constructor
	*/
	public Company() {
		
	}
	
	/**
	 * <h1 align='center'>Construtor</h1>
	 * <hr>
	 * <p>Método construtor que recebe todos os argumentos da classe</p>
	 * @version 1.1
	 * @since 1.0
	 * @author Matheus Ferreira Santos
	 * @category Constructor
	*/
	public Company(String id, String name, String CNPJ, Date createdAt, Date updatedAt) {
		this.id = id;
		this.name = name;
		this.CNPJ = CNPJ;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	public Company(String id, String name, String CNPJ, List<Address> address, Date createdAt, Date updatedAt) {
		this.id = id;
		this.name = name;
		this.CNPJ = CNPJ;
		this.address = address;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	
	
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", CNPJ=" + CNPJ + ", address=" + address + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + "]";
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
		Company other = (Company) obj;
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

	public String getCNPJ() {
		return CNPJ;
	}

	public void updateCNPJ(String CNPJ) {
		this.setCNPJ(CNPJ);
	}
	
	private void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	public List<Address> getAddress() {
		return address;
	}
	
	public void updateAddress(List<Address> address) {
		this.setAddress(address);
	}

	private void setAddress(List<Address> address) {
		this.address = address;
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
