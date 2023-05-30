package br.com.senacsp.projetointegrador.model.service;

import java.sql.SQLException;

import br.com.senacsp.projetointegrador.model.dao.CompanyDAO;
import br.com.senacsp.projetointegrador.model.domain.Company;

/**
 * <h1 align='center'>CompanyService.class</h1>
 * <hr>
 * <p>
 * Classe do sistema que irá, como todas as Services, acessar a classe DAO, que por sua vez acessará o banco,
 * e irá trabalhar com estruturas de dados para retornar os dados da forma que o sistema espera que seja retornado.
 * <em>
 * (Ela é instanciada e chamada atravez da classe App.class,
 * caso queira ver o seu "funcionamento", além dos codigos abaixo, entrar na classe citada,
 * provavelmente em atualizações futuras ela irá implementar a CompanyDTO.class, *que já está em desenvolvimento para a versão 1.2 ou 2.0*)
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
public class CompanyService {

	private CompanyDAO companyDAO;
	
	/**
	 * <h1 align='center'>Construtor</h1>
	 * <hr>
	 * <p>Método construtor da classe que terá as seguintes funcionalidades:</p>
	 * <em>
	 * <ul>
	 * <li>Intanciar a classe CompanyDAO</li>
	 * </ul>
	 * </em> 
	 * @version 1.1
	 * @since 1.0
	 * @author Matheus Ferreira Santos
	 * @category Constructor
	*/
	public CompanyService() {
		this.companyDAO = new CompanyDAO();
	}
	
	/**
	 * <h1 align='center'>Find By Employee Id</h1>
	 * <hr>
	 * <p>Método que acessará a classe CategoryDAO.class para buscar uma empresa pelo seu id de cadastro no sistema <em>(Volta os dados brutos, até então, não formatados pela DTO, *que será implementada na próxima versão*)</em></p>
	 * @version 1.1
	 * @author Matheus Ferreira Santos
	 * @throws SQLException
	 * @category Method
	 * @return Employee.class 
	*/
	public Company findById(String id) throws SQLException {
		Company company = this.getCompanyDAO().findById(id);
		
		if(company == null)
			return null;
		
		return company;
	}

	public CompanyDAO getCompanyDAO() {
		return companyDAO;
	}
	
}
