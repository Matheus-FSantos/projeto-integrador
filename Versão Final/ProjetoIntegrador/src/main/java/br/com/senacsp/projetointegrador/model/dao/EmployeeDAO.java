package br.com.senacsp.projetointegrador.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import java.util.ArrayList;
import java.util.List;

import br.com.senacsp.projetointegrador.model.configuration.Connection;
import br.com.senacsp.projetointegrador.model.domain.Company;
import br.com.senacsp.projetointegrador.model.domain.Employee;
import br.com.senacsp.projetointegrador.model.exception.ApplicationException;

/**
 * <h1 align='center'>EmployeeDAO.class</h1>
 * <hr>
 * <p>
 * Classe do sistema que irá, como todas as DAOs, acessar o banco de dados
 * e irá fazer consultas previamente definidas em cádigo Java.
 * <em>
 * (Ela é instanciada e chamada atravez da classe EmployeeService.class,
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
public class EmployeeDAO {
	
	private String SQLQuery;
	private Connection connection;
	private CompanyDAO companyDAO;
	
	/**
	 * <h1 align='center'>Construtor</h1>
	 * <hr>
	 * <p>Método construtor da classe que terá as seguintes funcionalidades:</p>
	 * <em>
	 * <ul>
	 * <li>Intanciar a classe Connection (Não é a classe java.sql.Connection)</li>
	 * <li>Intanciar a classe CompanyDAO, que será utilizado para algumas consultas de find all(by id/by name)</li>
	 * </ul>
	 * </em> 
	 * @version 1.1
	 * @since 1.0
	 * @author Matheus Ferreira Santos
	 * @category Constructor
	*/
	public EmployeeDAO() {
		this.SQLQuery = "";
		this.connection = new Connection();
		this.companyDAO = new CompanyDAO();
	}

	/**
	 * <h1 align='center'>Find All Method</h1>
	 * <hr>
	 * <p>Método para buscar todos os funcionarios cadastrados no sistema <em>(Volta os dados brutos, até então, não formatados pela DTO)</em></p> 
	 * @since 1.0
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Employee.class
	*/
	public List<Employee> findAll() throws SQLException{
		List<Employee> employees = new ArrayList<Employee>();
		this.setSQLQuery("SELECT * FROM employee");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		ResultSet result = preparedStatement.executeQuery();
		
		while(result.next()) {
			employees.add(new Employee(result.getString("id"), result.getString("name"), result.getString("email"), result.getString("RGF"), result.getString("RG"), result.getString("CPF"), this.getCompanyDAO().findById(result.getString("company_id")), result.getDate("createdAt"), result.getDate("updatedAt")));
		}
		
		result.close();
		preparedStatement.close();
		return employees;
	}
	
	/**
	 * <h1 align='center'>Find By Employee Id</h1>
	 * <hr>
	 * <p>Método para buscar um funcionario pelo seu id de cadastro no sistema <em>(Volta os dados brutos, não formatados pela DTO)</em></p>
	 * @since 1.0
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Employee.class 
	*/
	public Employee findById(String id) throws SQLException {
		Employee employee = null;
		
		this.setSQLQuery("SELECT * FROM employee WHERE employee.id= ?");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, id);
		ResultSet result = preparedStatement.executeQuery();
		
		if(result.next())
			employee = new Employee(result.getString("id"), result.getString("name"), result.getString("email"), result.getString("RGF"), result.getString("RG"), result.getString("CPF"), this.getCompanyDAO().findById(result.getString("company_id")) , result.getDate("createdAt"), result.getDate("updatedAt"));
		
		result.close();
		preparedStatement.close();
		return employee;
	}
	
	/**
	 * <h1 align='center'>Find By Employee E-Mail</h1>
	 * <hr>
	 * <p>Método para buscar um funcionario pelo seu email de cadastro no sistema <em>(Volta os dados brutos, não formatados pela DTO)</em></p>
	 * @since 1.1
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Employee.class
	*/
	public Employee findByMail(String mail) throws SQLException {
		Employee employee = null;
		this.setSQLQuery("SELECT * FROM employee WHERE employee.email= ?");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, mail);
		
		ResultSet result = preparedStatement.executeQuery();
		
		if(result.next())
			employee = new Employee(result.getString("id"), result.getString("name"), result.getString("email"), result.getString("RGF"), result.getString("RG"), result.getString("CPF"), this.getCompanyDAO().findById(result.getString("company_id")) , result.getDate("createdAt"), result.getDate("updatedAt"));
		
		result.close();
		preparedStatement.close();
		
		if(employee != null)
			return employee;
		
		return null;
	}
	
	/**
	 * <h1 align='center'>Find By Employee CPF</h1>
	 * <hr>
	 * <p>Método para buscar um funcionario pelo seu CPF de cadastro no sistema <em>(Volta os dados brutos, não formatados pela DTO)</em></p>
	 * @since 1.1
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Employee.class
	*/
	private Employee findByCPF(String cpf) throws SQLException, ApplicationException {
		Employee employee = null;
		
		this.setSQLQuery("SELECT * FROM employee WHERE employee.cpf= ?");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, cpf);
		
		ResultSet result = preparedStatement.executeQuery();
		
		if(result.next())
			employee = new Employee(result.getString("id"), result.getString("name"), result.getString("email"), result.getString("RGF"), result.getString("RG"), result.getString("CPF"), this.getCompanyDAO().findById(result.getString("company_id")) , result.getDate("createdAt"), result.getDate("updatedAt"));
		
		result.close();
		preparedStatement.close();
		
		if(employee != null)
			return employee;
		
		return null;
	}
	
	/**
	 * <h1 align='center'>Save Method</h1>
	 * <hr>
	 * <p>
	 * Método para salvar um novo funcionario no sistema
	 * </p>
	 * <p>
	 * <em>
	 * Ele retorna o mesmo usuário com todos os dados padrões do sistemas
	 * além dos dados que o cadastrante informou na hora do cadastro (Volta os dados brutos, não formatados pela DTO)
	 * </em>
	 * </p>
	 * @since 1.1
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Employee.class
	*/
	public Employee save(Employee employee, String name) throws SQLException, ApplicationException {
		Company company = this.getCompanyDAO().findByName(name);
		if(company == null)
			throw new ApplicationException("Company not found");
		
		if(this.findByMail(employee.getEmail()) != null)
			throw new ApplicationException("User alredy exists");
		
		if(this.findByCPF(employee.getCPF()) != null)
			throw new ApplicationException("User alredy exists");
		
		this.setSQLQuery("INSERT INTO employee (id, company_id, name, email, RGF, RG, CPF, createdAt, updatedAt) VALUES (UUID(), ?, ?, ?, ?, ?, ?, now(), now())");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		
		preparedStatement.setString(1, company.getId());
		preparedStatement.setString(2, employee.getName());
		preparedStatement.setString(3, employee.getEmail());
		preparedStatement.setString(4, employee.getRGF());
		preparedStatement.setString(5, employee.getRG());
		preparedStatement.setString(6, employee.getCPF());
		
		preparedStatement.executeUpdate();
		
		preparedStatement.close();
		employee = this.findByMail(employee.getEmail());
		return employee;
	}

	/**
	 * <h1 align='center'>Update Method</h1>
	 * <hr>
	 * <p>Método para atualizar um funcionario existente no sistema</p>
	 * <p>
	 * <em>
	 * Ele retorna o mesmo usuário com todos os dados padrões do sistemas e seus dados antigos (não atualizados)
	 * além dos dados que o cadastrante informou na hora da atualização (Volta os dados brutos, não formatados pela DTO)
	 * </em>
	 * </p>
	 * @since 1.1
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Employee.class
	*/
	public Employee update(String name, String mail, String RG, String CPF, String id) throws SQLException, ApplicationException {
		Employee employee = this.findById(id);
		
		if(employee == null)
			throw new ApplicationException("Employee not found");
		
		if(this.findByMail(mail) != null && employee.getEmail() != mail)
			throw new ApplicationException("Employee alredy exists");
		
		
		if(this.findByCPF(CPF) != null && employee.getCPF() != CPF)
			throw new ApplicationException("Employee alredy exists");
		
		
		this.setSQLQuery("UPDATE employee SET employee.name = ?, employee.email = ?, employee.RG = ?, employee.CPF = ?, employee.updatedAt = now() WHERE employee.id = ?");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, mail);
		preparedStatement.setString(3, RG);
		preparedStatement.setString(4, CPF);
		preparedStatement.setString(5, id);
		
		employee.updateName(name);
		employee.updateEmail(mail);
		employee.updateRG(RG);
		employee.updateCPF(CPF);
		
		if(preparedStatement.executeUpdate() > 0)
			return employee;
		
		throw new ApplicationException("Employee not found");
	}
	
	/**
	 * <h1 align='center'>Delete by mail Method</h1>
	 * <hr>
	 * <p>Método para deletar funcionario existente no sistema</p>
	 * <em>
	 * <p>Ele retornará um boolean, onde:</p>
	 * <ul>
	 * <li><strong>TRUE</strong> é igual a "deletado"</li>
	 * <li><strong>FALSE</strong> é igual a "dado não encontrado"</li>
	 * </ul>
	 * </em>
	 * @since 1.1
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Boolean
	*/
	public Boolean delete(String id) throws SQLException {
		this.setSQLQuery("DELETE FROM employee WHERE employee.id = ?");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, id);
		Integer result = preparedStatement.executeUpdate();
		preparedStatement.close();

		if(result > 0)
			return true;
		
		return false;
	}
	
	/**
	 * <h1 align='center'>Delete by mail Method</h1>
	 * <hr>
	 * <p>Método para deletar funcionario existente no sistema através do seu email</p>
	 * <em>
	 * <p>Ele retornará um boolean, onde:</p>
	 * <ul>
	 * <li><strong>TRUE</strong> é igual a "deletado"</li>
	 * <li><strong>FALSE</strong> é igual a "dado não encontrado"</li>
	 * </ul>
	 * </em>
	 * @since 1.1
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Boolean
	*/
	public Boolean deleteByMail(String email) throws SQLException, ApplicationException {
		if(this.findByMail(email) == null)
			throw new ApplicationException("Employee not found");
		
		this.setSQLQuery("DELETE FROM employee WHERE employee.email = ?");
		PreparedStatement preparedStatement = this.getConnection().getConnection().prepareStatement(this.getSQLQuery());
		preparedStatement.setString(1, email);
		Integer result = preparedStatement.executeUpdate();
		preparedStatement.close();

		if(result > 0)
			return true;

		throw new ApplicationException("Employee not found");
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
	
	public CompanyDAO getCompanyDAO() {
		return companyDAO;
	}
	
}
