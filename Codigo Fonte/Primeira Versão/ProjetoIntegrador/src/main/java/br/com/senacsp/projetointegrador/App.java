package br.com.senacsp.projetointegrador;

import java.sql.SQLException;

import br.com.senacsp.projetointegrador.model.configuration.Connection;

public class App {

	public void init() {
		System.out.println("Olá web");
		
		try {
			new Connection().getConnection();
		} catch(SQLException exception) {
			System.out.println(exception.getMessage());
		}
	}
	
}
