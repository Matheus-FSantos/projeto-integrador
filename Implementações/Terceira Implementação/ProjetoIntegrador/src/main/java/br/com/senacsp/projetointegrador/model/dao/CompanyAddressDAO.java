package br.com.senacsp.projetointegrador.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.senacsp.projetointegrador.model.configuration.Connection;
import br.com.senacsp.projetointegrador.model.domain.Address;
import br.com.senacsp.projetointegrador.model.domain.Company;

/**
 * <h1 align='center'>CompanyDAO.class</h1>
 * <hr>
 * <p>
 * Classe do sistema que irá, como todas as DAOs, acessar o banco de dados
 * e irá fazer consultas previamente definidas em cádigo Java.
 * <br><br>
 * Essa classe basicamente irá fazer as consultas necessárias para descobrir coisas como:
 * <em>
 * <ul>
 * <li>Qual é o endereco da empresa XYZ?</li>
 * <li>Qual são as empresas que estão na rua XYZ?</li>
 * <li>Quantas empresas estão na rua XYZ?</li>
 * </ul>
 * </em>
 * <em>
 * (Ela é instanciada e chamada atravez da classe CompanyService.class,
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
*/public class CompanyAddressDAO {

	private String SQLQuery;
	private Connection connection;
	
	/**
	 * <h1 align='center'>Construtor</h1>
	 * <hr>
	 * <p>Método construtor da classe que terá as seguintes funcionalidades:</p>
	 * <em>
	 * <ul>
	 * <li>Intanciar a classe Connection (Não é a classe java.sql.Connection)</li>
	 * <li>Intanciar a classe Address.DAO</li>
	 * <li>Intanciar a classe Company.DAO</li>
	 * </ul>
	 * </em> 
	 * @version 1.1
	 * @since 1.0
	 * @author Matheus Ferreira Santos
	 * @category Constructor
	*/
	public CompanyAddressDAO() {
		this.SQLQuery = "";
		this.connection = new Connection();
	}
	
	public List<Company> findCompanysByAddressId() {
		return new ArrayList<Company>();
	}
	
	/**
	 * <h1 align='center'>Find Company Address By Company Id</h1>
	 * <hr>
	 * <p>Método para buscar os enderecos de uma empresa cadastrada no sistema pelo seu ID<em>(Volta os dados brutos, não formatados pela DTO)</em></p>
	 * @since 1.1
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Employee.class 
	*/
	public List<Address> findCompanyAddressByCompanyId(String company_id) throws SQLException {
		List<Address> companyAddress = new ArrayList<Address>();
		
		this.setSQLQuery("SELECT * FROM company_address WHERE company_address.company_id = ?");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, company_id);
		
		ResultSet result = preparedStatement.executeQuery();
		
		while(result.next())
			companyAddress.add(new AddressDAO().findById(result.getString("company_address.address_id")));
		
		result.close();
		preparedStatement.close();
		return companyAddress;
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
