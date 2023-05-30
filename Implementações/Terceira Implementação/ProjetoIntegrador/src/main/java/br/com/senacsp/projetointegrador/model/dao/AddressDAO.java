package br.com.senacsp.projetointegrador.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.senacsp.projetointegrador.model.configuration.Connection;
import br.com.senacsp.projetointegrador.model.domain.Address;

/**
 * <h1 align='center'>AddressDAO.class</h1>
 * <hr>
 * <p>
 * Classe do sistema que irá, como todas as DAOs, acessar o banco de dados
 * e irá fazer consultas previamente definidas em cádigo Java.
 * <em>
 * (Ela é instanciada e chamada atravez da classe AddressService.class,
 * caso queira ver o seu "funcionamento", além dos codigos abaixo, entrar na classe citada)
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
public class AddressDAO {

	private String SQLQuery;
	private Connection connection;
	
	/**
	 * <h1 align='center'>Construtor</h1>
	 * <hr>
	 * <p>Método construtor da classe que terá as seguintes funcionalidades:</p>
	 * <em>
	 * <ul>
	 * <li>Intanciar a classe Connection (Não é a classe java.sql.Connection)</li>
	 * </ul>
	 * </em> 
	 * @version 1.1
	 * @since 1.0
	 * @author Matheus Ferreira Santos
	 * @category Constructor
	*/
	public AddressDAO() {
		this.SQLQuery = "";
		this.connection = new Connection();
	}
	
	public Address findById(String id) throws SQLException {
		Address address = null;
		
		this.setSQLQuery("SELECT * FROM address WHERE address.id = ?");;
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, id);
		
		ResultSet result = preparedStatement.executeQuery();
		
		if(result.next())
			address = new Address(result.getString("address.id"), result.getString("address.address"), result.getString("address.state"), result.getString("address.uf"), result.getString("address.CEP"), result.getDate("address.createdAt"), result.getDate("address.updatedAt"));
		
		result.close();
		preparedStatement.close();
		return address;
	}
	
	public Address findByAddressName(String address_name) throws SQLException {
		Address address = null;
		
		this.setSQLQuery("SELECT * FROM address WHERE address.address = ?");;
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, address_name);
		
		ResultSet result = preparedStatement.executeQuery();
		
		if(result.next())
			address = new Address(result.getString("address.id"), result.getString("address.address"), result.getString("address.state"), result.getString("address.uf"), result.getString("address.CEP"), result.getDate("address.createdAt"), result.getDate("address.updatedAt"));
		
		result.close();
		preparedStatement.close();
		return address;
	}

	public String getSQLQuery() {
		return SQLQuery;
	}

	public void setSQLQuery(String sQLQuery) {
		SQLQuery = sQLQuery;
	}

	public Connection getConnection() {
		return connection;
	}

}
