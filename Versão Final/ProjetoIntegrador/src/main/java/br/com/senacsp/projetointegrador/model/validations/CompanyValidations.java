package br.com.senacsp.projetointegrador.model.validations;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

import br.com.senacsp.projetointegrador.model.exception.ApplicationException;

public class CompanyValidations {

	public static String handleValidationCompanyName(JDesktopPane desktop, String message) {
		String companyName = "";

		try {
			
			companyName = JOptionPane.showInputDialog(desktop, "Enter the name of the company you want to " + message, "Employee Actions", JOptionPane.QUESTION_MESSAGE);

			if(companyName.length() > 4)
				return companyName;
			
			return null;
		} catch (Exception e) {
			return null;
		}

	}
	
	public static void handleValidateFields(String CEP, String name, String CNPJ, String number, String complement) throws ApplicationException {
		
		if(CEP.length() != 8)
			throw new ApplicationException("Invalid field");
		
		if(name.length() < 4 || name.length() > 40)
			throw new ApplicationException("Invalid field");
		
		if(CNPJ.length() != 14)
			throw new ApplicationException("Invalid field");
		
		if(number.length() == 0 || number.length() > 20)
			throw new ApplicationException("Invalid field");
		
		if(complement.length() < 4 || complement.length() > 60)
			throw new ApplicationException("Invalid field");
	}
	
	public static void handleValidateFields(String name, String CNPJ) throws ApplicationException {
		if(name.length() < 4 || name.length() > 40)
			throw new ApplicationException("Invalid field");
		
		if(CNPJ.length() != 14)
			throw new ApplicationException("Invalid field");
	}
	
}
