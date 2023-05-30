package br.com.senacsp.projetointegrador.model.configuration;

/**
 * <h1 align='center'>Company.class</h1>
 * <hr>
 * <p>
 * Classe do sistema que controla os dados de acesso do banco de dados usado no sistema
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
public class DatabaseConfiguration {

	private String url;
	private String user;
	private String password;
	
	/**
	 * <h1 align='center'>Construtor</h1>
	 * <hr>
	 * <p>Método construtor padrão que:</p>
	 * <em>
	 * <ul>
	 * <li>Instancia uma URL para o banco de dados</li>
	 * <li>Instancia uma Senha para o banco de dados</li>
	 * <li>Instancia um Usuário para o banco de dados</li>
	 * </ul>
	 * </em>
	 * @version 1.1
	 * @since 1.0
	 * @author Matheus Ferreira Santos
	 * @category Constructor
	*/
	public DatabaseConfiguration() {
		this.url = "jdbc:mysql://localhost:3306/CRUD?useTimezone=true&serverTimezone=UTC";
		this.user =  "root";
		this.password = "d94ed3838";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
