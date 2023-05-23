package br.com.senacsp.projetointegrador.model.configuration;

public class DatabaseConfiguration {

	private String url;
	private String user;
	private String password;
	
	public DatabaseConfiguration() {
		this.url = "jdbc:mysql://localhost:3306/CRUD?useTimezone=true&serverTimezone=UTC";
		this.user =  "root";
		this.password = "P@$$w0rd";
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
