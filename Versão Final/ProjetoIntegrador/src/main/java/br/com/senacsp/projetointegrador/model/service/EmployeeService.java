package br.com.senacsp.projetointegrador.model.service;

import java.sql.SQLException;

import java.util.List;

import javax.swing.JOptionPane;

import java.util.Date;

import br.com.senacsp.projetointegrador.model.dao.EmployeeDAO;
import br.com.senacsp.projetointegrador.model.domain.Employee;
import br.com.senacsp.projetointegrador.model.exception.ApplicationException;

/**
 * <h1 align='center'>EmployeeService.class</h1>
 * <hr>
 * <p>
 * Classe do sistema que irá, como todas as Services, acessar a classe DAO, que por sua vez acessará o banco,
 * e irá trabalhar com estruturas de dados para retornar os dados da forma que o sistema espera que seja retornado.
 * <em>
 * (Ela é instanciada e chamada atravez da classe App.class,
 * caso queira ver o seu "funcionamento", além dos codigos abaixo, entrar na classe citada,
 * provavelmente em atualizações futuras ela irá implementar a EmployeeDTO.class, *que já está em desenvolvimento para a versão 1.2 ou 2.0*)
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
public class EmployeeService {

	private EmployeeDAO employeeDAO;
	
	
	/**
	 * <h1 align='center'>Construtor</h1>
	 * <hr>
	 * <p>Método construtor da classe que terá as seguintes funcionalidades:</p>
	 * <em>
	 * <ul>
	 * <li>Intanciar a classe EmployeeDAO</li>
	 * </ul>
	 * </em> 
	 * @version 1.1
	 * @since 1.0
	 * @author Matheus Ferreira Santos
	 * @category Constructor
	*/
	public EmployeeService() {
		this.employeeDAO = new EmployeeDAO();
	}	
	
	/**
	 * <h1 align='center'>Find All Method</h1>
	 * <hr>
	 * <p>Método que acessará a classe EmployeeDAO.class para buscar todos os funcionarios cadastrados no sistema <em>(Volta os dados brutos, até então, não formatados pela DTO, *que será implementada na próxima versão*)</em></p> 
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Employee.class
	*/
	public List<Employee> findAll() throws SQLException {
		List<Employee> employees = this.getEmployeeDAO().findAll();
		
		if(employees.isEmpty())
			return null;
		
		return employees; 
	}
	
	/**
	 * <h1 align='center'>Find By Employee Id</h1>
	 * <hr>
	 * <p>Método que acessará a classe EmployeeDAO.class para buscar um funcionario pelo seu id de cadastro no sistema <em>(Volta os dados brutos, até então, não formatados pela DTO, *que será implementada na próxima versão*)</em></p>
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Employee.class 
	*/
	public Employee findById(String id) throws SQLException {
		Employee employee = this.getEmployeeDAO().findById(id);
		
		if(employee != null)
			return employee;
		
		return null;
	}

	/**
	 * <h1 align='center'>Find By Employee E-Mail</h1>
	 * <hr>
	 * <p>Método que acessará a classe EmployeeDAO.class para buscar um funcionario pelo seu email de cadastro no sistema <em>(Volta os dados brutos, até então, não formatados pela DTO, *que será implementada na próxima versão*)</em></p>
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Employee.class
	*/
	public Employee findByMail(String mail) throws SQLException, ApplicationException {
		Employee employee = this.getEmployeeDAO().findByMail(mail);
		
		if(employee != null)
			return employee;
		
		throw new ApplicationException("Employee not found");
	}
	
	/**
	 * <h1 align='center'>Save Method</h1>
	 * <hr>
	 * <p>
	 * Método que acessará a classe EmployeeDAO.class para salvar um novo funcionario no sistema
	 * </p>
	 * <p>
	 * <em>
	 * Ele retorna o mesmo usuário com todos os dados padrões do sistemas
	 * além dos dados que o cadastrante informou na hora do cadastro (Volta os dados brutos, até então, não formatados pela DTO, *que será implementada na próxima versão*)
	 * </em>
	 * </p>
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Employee.class
	*/
	public Employee save(String name, String mail, String RGF, String RG, String CPF, String companyName) throws SQLException, ApplicationException {
		return this.getEmployeeDAO().save(new Employee(null, name, mail, RGF, RG, CPF, new Date(), new Date()), companyName);
	}
	
	/**
	 * <h1 align='center'>Update Method</h1>
	 * <hr>
	 * <p>Método que acessará a classe EmployeeDAO.class para atualizar um funcionario existente no sistema</p>
	 * <p>
	 * <em>
	 * Ele retorna o mesmo usuário com todos os dados padrões do sistemas e seus dados antigos (não atualizados)
	 * além dos dados que o cadastrante informou na hora da atualização (Volta os dados brutos, até então, não formatados pela DTO, *que será implementada na próxima versão*)
	 * </em>
	 * </p>
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Employee.class
	*/
	public Employee update(String name, String mail, String RG, String CPF, String id) throws SQLException, ApplicationException {
		return this.getEmployeeDAO().update(name, mail, RG, CPF, id);
	}
	
	/**
	 * <h1 align='center'>Update Method</h1>
	 * <hr>
	 * <p>Método que acessará a classe EmployeeDAO.class para deletar funcionario existente no sistema</p>
	 * <em>
	 * <p>Ele retornará um boolean, onde:</p>
	 * <ul>
	 * <li><strong>TRUE</strong> é igual a "deletado"</li>
	 * <li><strong>FALSE</strong> é igual a "dado não encontrado"</li>
	 * </ul>
	 * </em>
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Boolean
	*/
	public void delete(String id) throws SQLException {
		Boolean isDeleted = this.getEmployeeDAO().delete(id);
		
		if(isDeleted)
			System.out.println("Deleted!!!");
		else
			System.out.println("Employee not found!!!");
	}
	
	public Boolean deleteByMail(String mail) {
		try {
			return this.getEmployeeDAO().deleteByMail(mail);
		} catch (SQLException sqlException) {
			return false;
		} catch (ApplicationException applicationException) {
			return false;
		}
		
		
	}
	
	
	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

}
