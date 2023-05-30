package br.com.senacsp.projetointegrador.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.senacsp.projetointegrador.model.configuration.Connection;
import br.com.senacsp.projetointegrador.model.domain.Company;

/**
 * <h1 align='center'>CompanyDAO.class</h1>
 * <hr>
 * <p>
 * Classe do sistema que irá, como todas as DAOs, acessar o banco de dados
 * e irá fazer consultas previamente definidas em cádigo Java.
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
*/
public class CompanyDAO {
	
	private String SQLQuery;
	private Connection connection;
	private CompanyAddressDAO companyAddressDAO;
	
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
	public CompanyDAO() {
		this.SQLQuery = "";
		this.connection = new Connection();
		this.companyAddressDAO = new CompanyAddressDAO();
	}

	/**
	 * <h1 align='center'>Find By Company Id</h1>
	 * <hr>
	 * <p>Método para buscar uma empresa pelo seu id de cadastro no sistema <em>(Volta os dados brutos, não formatados pela DTO)</em></p>
	 * @since 1.1
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Employee.class 
	*/
	public Company findById(String id) throws SQLException {
		Company company = null;
		this.setSQLQuery("SELECT * FROM company WHERE company.id = ?");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, id);
		
		ResultSet result = preparedStatement.executeQuery();
		
		if(result.next()) {
			company = new Company(result.getString("company.id"), result.getString("company.name"), result.getString("company.CNPJ"), this.getCompanyAddressDAO().findCompanyAddressByCompanyId(result.getString("company.id")), result.getDate("company.createdAt"), result.getDate("company.updatedAt"));
		}
		
		result.close();
		preparedStatement.close();
		return company;
	}
	
	/**
	 * <h1 align='center'>Find By Company Id</h1>
	 * <hr>
	 * <p>Método para buscar uma empresa pelo seu nome de cadastro no sistema <em>(Volta os dados brutos, não formatados pela DTO)</em></p>
	 * @since 1.1
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Employee.class 
	*/
	public Company findByName(String name) throws SQLException {
		Company company = null;
		this.setSQLQuery("SELECT * FROM company WHERE company.name = ?");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, name);
		
		ResultSet result = preparedStatement.executeQuery();
		
		if(result.next()) {
			company = new Company(result.getString("company.id"), result.getString("company.name"), result.getString("company.CNPJ"), this.getCompanyAddressDAO().findCompanyAddressByCompanyId(result.getString("company.id")), result.getDate("company.createdAt"), result.getDate("company.updatedAt"));
		}
		
		result.close();
		preparedStatement.close();
		return company;
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
	
	public CompanyAddressDAO getCompanyAddressDAO() {
		return companyAddressDAO;
	}
	
}
