package br.com.senacsp.projetointegrador.model.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <h1 align='center'>Address.class</h1>
 * <hr>
 * <p>
 * Classe de Dominio do sistema, ela que controla todos os dados reais de todos os endereços de empresas que são cadastradas no sistema,
 * *seguindo a uml do projeto*
 * <em>
 * (Sujeito a alterações)
 * </em>
 * </p>
 * <br>
 * <p>GitHub do Projeto: <em>http://github.com/Matheus-FSantos/projeto-integrador</em></p>
 * <br>
 * @version 2.0
 * @since 2.0
 * @category Class
 * @author Matheus Ferreira Santos
*/
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String address;
	private String state;
	private String UF;
	private String CEP;

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
	public Address() {
		super();
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
	public Address(String id, String address, String state, String UF, String CEP, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.address = address;
		this.state = state;
		this.UF = UF;
		this.CEP = CEP;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + ", state=" + state + ", UF=" + UF + ", CEP=" + CEP
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
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
		Address other = (Address) obj;
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

	public String getAddress() {
		return address;
	}
	
	public void updateAddress(String address) {
		this.setAddress(address);
	}

	private void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}
	
	public void updateState(String state) {
		this.setState(state);
	}

	private void setState(String state) {
		this.state = state;
	}

	public String getUF() {
		return UF;
	}
	
	public void updateUF(String UF) {
		this.setUF(UF);
	}

	private void setUF(String UF) {
		this.UF = UF;
	}

	public String getCEP() {
		return CEP;
	}
	
	public void updateCEP(String CEP) {
		this.setCEP(CEP);
	}

	private void setCEP(String CEP) {
		this.CEP = CEP;
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
