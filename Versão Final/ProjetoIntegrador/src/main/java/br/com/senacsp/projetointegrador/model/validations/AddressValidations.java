package br.com.senacsp.projetointegrador.model.validations;

import javax.swing.JOptionPane;

import br.com.senacsp.projetointegrador.model.dto.AddressDTO;
import br.com.senacsp.projetointegrador.model.service.ViaCEP;

public class AddressValidations {
	
	public static String handleCEPValidation(String message) {
		String CEP = JOptionPane.showInputDialog(null, "Enter the CEP of the Address you want to " + message, "Address Action", JOptionPane.QUESTION_MESSAGE);
        AddressDTO addressDTO = ViaCEP.getCep(CEP);
        
        if(addressDTO != null)
        	return CEP;
        
        return null;
        
	}
}
