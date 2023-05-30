package br.com.senacsp.projetointegrador.frame.internal.employee;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.senacsp.projetointegrador.model.exception.ApplicationException;
import br.com.senacsp.projetointegrador.model.service.EmployeeService;
import br.com.senacsp.projetointegrador.model.validations.EmployeeValidations;

public class Create extends javax.swing.JInternalFrame {

    public Create() {
        initComponents();
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
        inputRG = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        inputCPF = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        inputCompany = new javax.swing.JTextField();
        buttonSubmit = new javax.swing.JButton();

        setClosable(true);
        setTitle("Create employee");
        setToolTipText("System screen to create an employee");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        title.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("New Employee");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("E-Mail");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RG");

        inputRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#########"))));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CPF");

        inputCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#########"))));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Company Name");

        buttonSubmit.setText("Submit");
        buttonSubmit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSubmitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputCompany)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputName)
                    .addComponent(inputEmail)
                    .addComponent(inputCPF)
                    .addComponent(inputRG))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(inputRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(buttonSubmit)
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

    private void buttonSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSubmitMouseClicked
        
    	String name = inputName.getText();
        String email = inputEmail.getText();
        String RGF = this.initRGF();
        String RG = inputRG.getText();
        String CPF = inputCPF.getText();
        String companyName = inputCompany.getText();
        
        try {
            
        	EmployeeValidations.handleValidateFields(name, email, RG, CPF, companyName); //validação dos campos
			
            new EmployeeService().save(name, email, RGF, RG, CPF, companyName);
	        JOptionPane.showMessageDialog(this, "Created!!!", "Employee Actions", JOptionPane.INFORMATION_MESSAGE);
	        this.dispose();
        } catch (SQLException sqlException) {
        	JOptionPane.showMessageDialog(this, sqlException.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);
        	this.dispose();
		} catch (ApplicationException appException) {
        	JOptionPane.showMessageDialog(this, appException.getMessage(), "Application Exception", JOptionPane.ERROR_MESSAGE);
			this.dispose();
		}
        
    }//GEN-LAST:event_buttonSubmitMouseClicked

    public String initRGF() {
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&*";
        String rgf = "";
        
        Integer random = 0;
        String caracter = "";
        
        for(Integer i = 0; i < 6; i++){
            random = (int)(Math.random() * caracteres.length() + 0);
            caracter = caracteres.substring(random, random + 1);
            rgf += caracter;
        }
        
        return rgf;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JFormattedTextField inputCPF;
    private javax.swing.JTextField inputCompany;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputName;
    private javax.swing.JFormattedTextField inputRG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
