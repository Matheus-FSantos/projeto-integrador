package br.com.senacsp.projetointegrador.model.configuration;

import java.sql.*;

/**
 * <h1 align='center'>Company.class</h1>
 * <hr>
 * <p>
 * Classe do sistema que controla tudo relacionado a conexão com o banco de dados
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
public class Connection {
	
	private DatabaseConfiguration dataBaseConfiguration;

	/**
	 * <h1 align='center'>Construtor</h1>
	 * <hr>
	 * <p>Método construtor padrão que:</p>
	 * <em>
	 * <ul>
	 * <li>Instancia a classe 'DatabaseConfiguration.class'</li>
	 * </ul>
	 * </em>
	 * @version 1.1
	 * @since 1.0
	 * @author Matheus Ferreira Santos
	 * @category Constructor
	*/
	public Connection() {
		this.dataBaseConfiguration = new DatabaseConfiguration();
	}

	/**
	 * <h1 align='center'>Construtor</h1>
	 * <hr>
	 * <p>Método construtor padrão que:</p>
	 * <em>
	 * <ul>
	 * <li>Retorna uma conexão do banco de dados (java.sql.Connection)</li>
	 * </ul>
	 * </em>
	 * @version 1.1
	 * @since 1.0
	 * @return java.sql.Connection
	 * @author Matheus Ferreira Santos
	 * @category Method
	*/
	public java.sql.Connection getConnection() throws SQLException {
		java.sql.Connection connection = null;

		connection = DriverManager.getConnection(this.dataBaseConfiguration.getUrl(), this.dataBaseConfiguration.getUser(), this.dataBaseConfiguration.getPassword());
		return connection;
	}

	/**
	 * <h1 align='center'>Construtor</h1>
	 * <hr>
	 * <p>Método construtor padrão que:</p>
	 * <em>
	 * <ul>
	 * <li>Fecha uma conexão do banco de dados (java.sql.Connection)</li>
	 * </ul>
	 * </em>
	 * @version 1.1
	 * @since 1.0
	 * @return void
	 * @author Matheus Ferreira Santos
	 * @category Method
	*/
	public void close(java.sql.Connection connection) throws SQLException {
		connection.close();
	}

	public DatabaseConfiguration getDataBaseConfiguration() {
		return dataBaseConfiguration;
	}

	public void setDataBaseConfiguration(DatabaseConfiguration dataBaseConfiguration) {
		this.dataBaseConfiguration = dataBaseConfiguration;
	}

}

