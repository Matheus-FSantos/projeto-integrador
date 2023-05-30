package br.com.senacsp.projetointegrador.controller;

import javax.swing.JOptionPane;

import java.sql.SQLException;

import javax.swing.JDesktopPane;

import br.com.senacsp.projetointegrador.frame.internal.employee.Create;
import br.com.senacsp.projetointegrador.frame.internal.employee.Update;
import br.com.senacsp.projetointegrador.model.exception.ApplicationException;
import br.com.senacsp.projetointegrador.model.service.EmployeeService;
import br.com.senacsp.projetointegrador.model.validations.EmployeeValidations;
import br.com.senacsp.projetointegrador.frame.internal.employee.FindAll;
import br.com.senacsp.projetointegrador.frame.internal.employee.FindOne;

public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController () {
		this.employeeService = new EmployeeService();
	}

	public void findAll(JDesktopPane desktop) {
		try {
			FindAll employeeFindAll = new FindAll(employeeService.findAll());
			desktop.add(employeeFindAll);
			employeeFindAll.setVisible(true);
		} catch (SQLException sqlException) {
			JOptionPane.showMessageDialog(desktop, sqlException.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void findOne(JDesktopPane desktop) {
		String email = EmployeeValidations.handleValidationEmail(desktop, "check");
		if (email == null)
			JOptionPane.showMessageDialog(null, "Invalid", "Employee Actions", JOptionPane.ERROR_MESSAGE);
		else {
			try {
				FindOne employeeFindOne = new FindOne(employeeService.findByMail(email));
				desktop.add(employeeFindOne);
				employeeFindOne.setVisible(true);
			} catch (SQLException sqlException) {
				JOptionPane.showMessageDialog(desktop, sqlException.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);
			} catch (ApplicationException applicationException) {
				JOptionPane.showMessageDialog(desktop, applicationException.getMessage(), "Application Exception", JOptionPane.ERROR_MESSAGE);
			}			
		}
	}

	public void create(JDesktopPane desktop) {
		Create employeeCreate = new Create();
		desktop.add(employeeCreate);
		employeeCreate.setVisible(true);
	}

	public void update(JDesktopPane desktop) {
		String email = EmployeeValidations.handleValidationEmail(desktop, "update");
		
		if (email == null)
			JOptionPane.showMessageDialog(null, "Invalid", "Employee Actions", JOptionPane.ERROR_MESSAGE);
		else {
			try {
				Update employeeUpdate = new Update(employeeService.findByMail(email));
				desktop.add(employeeUpdate);
				employeeUpdate.setVisible(true);
			} catch (SQLException sqlException) {
				JOptionPane.showMessageDialog(desktop, sqlException.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);
			} catch (ApplicationException applicationException) {
				JOptionPane.showMessageDialog(desktop, applicationException.getMessage(), "Application Exception", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public void delete() {
		String email = EmployeeValidations.handleValidationEmail(null, "delete");
		if (email == null)
			JOptionPane.showMessageDialog(null, "Invalid", "Employee Actions", JOptionPane.ERROR_MESSAGE);
		else {
			if(this.employeeService.deleteByMail(email))
				JOptionPane.showMessageDialog(null, "Deleted!!!", "Employee Actions", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "Inválid", "Employee Actions", JOptionPane.ERROR_MESSAGE);
		}
	}

}
