package br.com.senacsp.projetointegrador.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.senacsp.projetointegrador.model.configuration.Connection;
import br.com.senacsp.projetointegrador.model.domain.Address;
import br.com.senacsp.projetointegrador.model.domain.Company;
import br.com.senacsp.projetointegrador.model.dto.CompanyEmployeeDTO;
import br.com.senacsp.projetointegrador.model.exception.ApplicationException;

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
	
	public List<Company> findAll() throws SQLException {
		List<Company> companies = new ArrayList<Company>();
		
		this.setSQLQuery("SELECT * FROM company");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		ResultSet result = preparedStatement.executeQuery();
		
		while(result.next()) {
			companies.add(new Company(result.getString("company.id"), result.getString("company.name"), result.getString("company.cnpj"), this.companyAddressDAO.findCompanyAddressByCompanyId(result.getString("company.id")), result.getDate("company.createdAt"), result.getDate("company.updatedAt")));
		}
		
		return companies;
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
	
	private Object findByCNPJ(String CNPJ) throws SQLException {
		Company company = null;
		this.setSQLQuery("SELECT * FROM company WHERE company.CNPJ = ?");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, CNPJ);
		
		ResultSet result = preparedStatement.executeQuery();
		
		if(result.next()) {
			company = new Company(result.getString("company.id"), result.getString("company.name"), result.getString("company.CNPJ"), this.getCompanyAddressDAO().findCompanyAddressByCompanyId(result.getString("company.id")), result.getDate("company.createdAt"), result.getDate("company.updatedAt"));
		}
		
		result.close();
		preparedStatement.close();
		return company;
	}
	
	public List<CompanyEmployeeDTO> findOne(String companyName) throws SQLException, ApplicationException {
		if(this.findByName(companyName) == null)
			throw new ApplicationException("Company not found");
		
		return this.getCompanyAddressDAO().findEmployeesByCompanyName(companyName);
	}
	
	public Company save(String CEP, String name, String CNPJ, String number, String complement) throws SQLException, ApplicationException {
		Address address = new AddressDAO().findByAddressCEP(CEP);
		Company company = null;
		
		if(address != null)
			throw new ApplicationException("Address alredy exists");
		
		
		this.setSQLQuery("INSERT INTO company(id, name, CNPJ, createdAt, updatedAt) VALUES (UUID(), ?, ?, now(), now())");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, CNPJ);
		
		preparedStatement.executeUpdate();
		preparedStatement.close();
		
		company = this.findByName(name);
		
		this.getCompanyAddressDAO().innerCompanyWithAddress(company.getId(), address.getId(), number, complement);
		
		return company;
	}

	public void update(String id, String name, String CNPJ) throws SQLException, ApplicationException {
		Company company = this.findById(id);
		
		if(company == null)
			throw new ApplicationException("Company not found");
		
		if(this.findByName(name) != null && company.getName() != name)
			throw new ApplicationException("Company alredy exists");
		
		if(this.findByCNPJ(CNPJ) != null && company.getCNPJ() != CNPJ)
			throw new ApplicationException("Company alredy exists");
		
		this.setSQLQuery("UPDATE company SET company.name = ?, company.CNPJ = ?, company.updatedAt = now() WHERE company.id = ?");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, CNPJ);
		preparedStatement.setString(3, company.getId());
		
		preparedStatement.executeUpdate();
	}

	public void delete(String name) throws SQLException, ApplicationException {
		
		Company company = this.findByName(name);
		
		if(company == null)
			throw new ApplicationException("Company not found");
		
		this.setSQLQuery("DELETE FROM employee WHERE employee.company_id = ?");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, company.getId());
		
		preparedStatement.executeUpdate();
		preparedStatement.close();
		
		
		this.setSQLQuery("DELETE FROM company_address WHERE company_address.company_id = ?");
		preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, company.getId());

		preparedStatement.executeUpdate();
		preparedStatement.close();

		this.setSQLQuery("DELETE FROM company WHERE company.id = ?");
		preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, company.getId());

		preparedStatement.executeUpdate();
		preparedStatement.close();
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
