package br.com.senacsp.projetointegrador.model.exception;

public class ApplicationException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private final String message;
	
	public ApplicationException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
	
}
