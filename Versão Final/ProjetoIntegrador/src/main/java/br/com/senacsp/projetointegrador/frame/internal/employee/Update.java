package br.com.senacsp.projetointegrador.frame.internal.employee;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.senacsp.projetointegrador.model.domain.Employee;
import br.com.senacsp.projetointegrador.model.exception.ApplicationException;
import br.com.senacsp.projetointegrador.model.service.EmployeeService;
import br.com.senacsp.projetointegrador.model.validations.EmployeeValidations;

public class Update extends javax.swing.JInternalFrame {

	private Employee frameEmployee;
	
    public Update(Employee employee) {
        frameEmployee = employee;
    	
    	initComponents();
        this.initFields(employee);
    }

    private void initFields(Employee employee) {
    	this.clearFields();
    	
    	this.inputEmail.setText(employee.getEmail());
		this.inputName.setText(employee.getName());
		this.jFormattedTextField6.setText(employee.getRG());
		this.jFormattedTextField7.setText(employee.getCPF());
	}
    
    private void clearFields() {
    	this.inputEmail.setText("");
		this.inputName.setText("");
		this.jFormattedTextField6.setText("");
		this.jFormattedTextField7.setText("");
    }

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        buttonUpdate = new javax.swing.JButton();

        setClosable(true);
        setTitle("Employee update");
        setToolTipText("system screen to update an employee");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        title.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Update Employee");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("E-Mail");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RG");

        jFormattedTextField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#########"))));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CPF");

        jFormattedTextField7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#########"))));

        buttonUpdate.setText("Update");
        buttonUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonUpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputName)
                    .addComponent(inputEmail)
                    .addComponent(jFormattedTextField7)
                    .addComponent(jFormattedTextField6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(buttonUpdate)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonUpdateMouseClicked
        try {
        	
			EmployeeValidations.handleValidateFields(this.inputName.getText(), this.inputEmail.getText(), this.jFormattedTextField6.getText(), this.jFormattedTextField7.getText());
			
        	new EmployeeService().update(
        			this.inputName.getText(),
        			this.inputEmail.getText(),
        			this.jFormattedTextField6.getText(),
        			this.jFormattedTextField7.getText(),
        			this.frameEmployee.getId()
        	);
        	
        	JOptionPane.showMessageDialog(this, "Updated!!!", "Employee Actions", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (SQLException sqlException) {
			JOptionPane.showMessageDialog(null, sqlException.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);
			this.dispose();
        } catch (ApplicationException applicationException) {
			JOptionPane.showMessageDialog(null, applicationException.getMessage(), "Application Exception", JOptionPane.ERROR_MESSAGE);
			this.dispose();
        }	
    	
    }//GEN-LAST:event_buttonUpdateMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputName;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
