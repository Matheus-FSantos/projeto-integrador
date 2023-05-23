package br.com.senacsp.projetointegrador.model.configuration;

import java.sql.*;

public class Connection {
	
	private DatabaseConfiguration dataBaseConfiguration;

	public Connection() {
		this.dataBaseConfiguration = new DatabaseConfiguration();
	}

	public java.sql.Connection getConnection() throws SQLException {
		java.sql.Connection connection = null;

		connection = DriverManager.getConnection(this.dataBaseConfiguration.getUrl(), this.dataBaseConfiguration.getUser(), this.dataBaseConfiguration.getPassword());
		return connection;
	}

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

