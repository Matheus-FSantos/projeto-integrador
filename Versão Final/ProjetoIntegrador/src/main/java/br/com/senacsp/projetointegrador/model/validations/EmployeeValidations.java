package br.com.senacsp.projetointegrador.model.validations;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

import br.com.senacsp.projetointegrador.model.exception.ApplicationException;

public class EmployeeValidations {

	public static String handleValidationEmail(JDesktopPane desktop, String message) {
		String email = "";

		try {
			
			email = JOptionPane.showInputDialog(desktop, "Enter the email of the employee you want to " + message, "Employee Actions", JOptionPane.QUESTION_MESSAGE);

			if(email.length() > 5)
				if(email.contains("@") && (email.contains(".com") || email.contains(".br") || email.contains(".com.br")))
					return email;
			
			return null;
		} catch (Exception e) {
			return null;
		}

	}

	public static void handleValidateFields(String name, String email, String RG, String CPF, String companyName) throws ApplicationException {
		if(name.length() < 4 || name.length() > 40)
			throw new ApplicationException("Invalid field");
		
		if(email.length() < 4 || email.length() > 60)
			throw new ApplicationException("Invalid field");
		
		if(RG.length() != 9)
			throw new ApplicationException("Invalid field");
		
		if(CPF.length() != 11)
			throw new ApplicationException("Invalid field");
		
		if(companyName.length() < 4 || companyName.length() > 60)
			throw new ApplicationException("Invalid field");	
	}
	
	public static void handleValidateFields(String name, String email, String RG, String CPF) throws ApplicationException {
		if(name.length() < 4 || name.length() > 40)
			throw new ApplicationException("Invalid field");
		
		if(email.length() < 4 || email.length() > 60)
			throw new ApplicationException("Invalid field");
		
		if(RG.length() != 9)
			throw new ApplicationException("Invalid field");
		
		if(CPF.length() != 11)
			throw new ApplicationException("Invalid field");	
	}
	
}
