package br.com.senacsp.projetointegrador.controller;

import java.sql.SQLException;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

import br.com.senacsp.projetointegrador.model.dto.AddressDTO;
import br.com.senacsp.projetointegrador.model.exception.ApplicationException;
import br.com.senacsp.projetointegrador.model.service.AddressService;
import br.com.senacsp.projetointegrador.model.service.ViaCEP;
import br.com.senacsp.projetointegrador.model.validations.AddressValidations;
import br.com.senacsp.projetointegrador.frame.internal.address.*;

public class AddressController {
    
	private AddressService addressService;
	
	public AddressController() {
		this.addressService = new AddressService();
	}
	
    public void findAll(JDesktopPane desktop){
       try {
    	   FindAll findAll = new FindAll(this.addressService.findAll());
           desktop.add(findAll);
           findAll.setVisible(true);
		} catch (SQLException sqlException) {
			JOptionPane.showMessageDialog(desktop, sqlException.getMessage(), "Address Exception", JOptionPane.ERROR_MESSAGE);
		}
    }
    
    public void findOne(JDesktopPane desktop){
    	String CEP = AddressValidations.handleCEPValidation("check");
        
        if(CEP != null){
        	try {
        		FindOne findOne = new FindOne(this.addressService.findAddressByCEP(CEP));
            	desktop.add(findOne);
            	findOne.setVisible(true);
        	} catch (SQLException e) {
        		JOptionPane.showMessageDialog(desktop, e.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);
			} catch (ApplicationException e) {
        		JOptionPane.showMessageDialog(desktop, e.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);
			}
        	
        } else
        	JOptionPane.showMessageDialog(null, "Address not found", "Address Action", JOptionPane.ERROR_MESSAGE);
    }
    
    public void create(JDesktopPane desktop){
        Create create = new Create();
        desktop.add(create);
        create.setVisible(true);
    }
    
    
    public void delete(){
        String CEP = AddressValidations.handleCEPValidation("update");
        
        if(CEP != null){
        	if(this.addressService.deleteByCEP(CEP))
        		JOptionPane.showMessageDialog(null, "Deleted!!!", "Address Action", JOptionPane.INFORMATION_MESSAGE);
        	else
                JOptionPane.showMessageDialog(null, "Address not found in database", "Address Action", JOptionPane.ERROR_MESSAGE);
        } else
            JOptionPane.showMessageDialog(null, "Address not found", "Address Action", JOptionPane.ERROR_MESSAGE);
    }
}
