package br.com.senacsp.projetointegrador.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.senacsp.projetointegrador.model.configuration.Connection;
import br.com.senacsp.projetointegrador.model.domain.Address;
import br.com.senacsp.projetointegrador.model.exception.ApplicationException;

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
	
	public List<Address> findAll() throws SQLException {
		List<Address> address = new ArrayList<Address>();
		
		this.setSQLQuery("SELECT * FROM address;");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		
		ResultSet result = preparedStatement.executeQuery();
		
		while(result.next()) {
			address.add(new Address(result.getString("address.id"), result.getString("address.address"), result.getString("address.state"), result.getString("address.uf"), result.getString("address.CEP"), result.getDate("address.createdAt"), result.getDate("address.updatedAt")));
		}
		
		result.close();
		preparedStatement.close();
		return address;
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
	
	public Address findByAddressCEP(String CEP) throws SQLException, ApplicationException {
		Address address = null;

		this.setSQLQuery("SELECT * FROM address WHERE address.CEP = ?");;
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, CEP);
		
		ResultSet result = preparedStatement.executeQuery();
		
		if(result.next())
			address = new Address(result.getString("address.id"), result.getString("address.address"), result.getString("address.state"), result.getString("address.uf"), result.getString("address.CEP"), result.getDate("address.createdAt"), result.getDate("address.updatedAt"));
		
		result.close();
		preparedStatement.close();
		return address;
	}
	
	public Address save(String address, String state, String UF, String CEP) throws SQLException, ApplicationException {
		Address addressObject = this.findByAddressCEP(CEP);
		
		if(addressObject != null)
			throw new ApplicationException("Address alredy Exists");
		
		this.setSQLQuery("INSERT INTO address(id, address, state, uf, CEP, createdAt, updatedAt) VALUES (UUID(), ?, ?, ?, ?, now(), now());");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		
		preparedStatement.setString(1, address);
		preparedStatement.setString(2, state);
		preparedStatement.setString(3, UF);
		preparedStatement.setString(4, CEP);
		
		preparedStatement.executeUpdate();
		
		return this.findByAddressCEP(CEP);
	}
	
	public Boolean deleteByCEP(String CEP) throws SQLException, ApplicationException {
		
		if(this.findByAddressCEP(CEP) != null) {
			
			this.setSQLQuery("DELETE FROM address WHERE address.CEP = ?");
			PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
			preparedStatement.setString(1, CEP);
			Integer result = preparedStatement.executeUpdate();
			preparedStatement.close();
			
			if(result > 0)
				return true;
			else
				throw new ApplicationException("Address not found!!!");
		} else
			throw new ApplicationException("Address not found!!!");
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
