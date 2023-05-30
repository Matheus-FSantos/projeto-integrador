package br.com.senacsp.projetointegrador.controller;

import br.com.senacsp.projetointegrador.frame.internal.company.*;
import br.com.senacsp.projetointegrador.model.exception.ApplicationException;
import br.com.senacsp.projetointegrador.model.service.CompanyService;
import br.com.senacsp.projetointegrador.model.validations.CompanyValidations;

import java.sql.SQLException;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class CompanyController {
    
	private CompanyService companyService;
	
    public CompanyController(){
    	this.companyService = new CompanyService();
    }
    
    public void findAll(JDesktopPane desktop){
    	try {
    		FindAll findAll = new FindAll(companyService.findAll());
            desktop.add(findAll);
            findAll.setVisible(true);
    	} catch (SQLException sqlException) {
    		JOptionPane.showMessageDialog(desktop, sqlException.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);
		}
    }
    
    public void findOne(JDesktopPane desktop){
    	String companyName = CompanyValidations.handleValidationCompanyName(desktop, "check");
    	
    	if(companyName == null)
    		JOptionPane.showMessageDialog(desktop, "Inválid", "Company Actions", JOptionPane.ERROR_MESSAGE);
    	else {
	    	try {
	            FindOne findOne = new FindOne(companyService.findOne(companyName));
	            desktop.add(findOne);
	            findOne.setVisible(true);
			} catch (SQLException sqlException) {
				JOptionPane.showMessageDialog(desktop, sqlException.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);
			} catch (ApplicationException applicationException) {
				JOptionPane.showMessageDialog(desktop, applicationException.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);
			}
    	}
    }
    
    public void create(JDesktopPane desktop){
        Create create = new Create();
        desktop.add(create);
        create.setVisible(true);
    }
    
    public void update(JDesktopPane desktop){
    	String companyName = CompanyValidations.handleValidationCompanyName(desktop, "update");
    	
    	if(companyName == null)
    		JOptionPane.showMessageDialog(desktop, "Inválid", "Company Actions", JOptionPane.ERROR_MESSAGE);
    	else {
	    	
			try {
				Update update = new Update(this.companyService.findByName(companyName));
		        desktop.add(update);
		        update.setVisible(true);
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(desktop, e.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			} catch (ApplicationException e) {
				JOptionPane.showMessageDialog(desktop, e.getMessage(), "ApplicationException Exception", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
    	}
    }
    
    public void delete(){
    	String companyName = CompanyValidations.handleValidationCompanyName(null, "delete");
    	
    	if(companyName == null)
    		JOptionPane.showMessageDialog(null, "Invalid", "Company Actions", JOptionPane.ERROR_MESSAGE);
    	else {
	    	try {
	    		this.companyService.delete(companyName);
	    		JOptionPane.showMessageDialog(null, "Deleted!!!", "Company Actions", JOptionPane.INFORMATION_MESSAGE);
	    	} catch (SQLException sqlException) {
				JOptionPane.showMessageDialog(null, sqlException.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);
			} catch (ApplicationException applicationException) {
				JOptionPane.showMessageDialog(null, applicationException.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);
			}
    	}
    }
    
}
