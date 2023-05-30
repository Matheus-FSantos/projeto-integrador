package br.com.senacsp.projetointegrador.frame.internal.address;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.senacsp.projetointegrador.model.dto.AddressDTO;
import br.com.senacsp.projetointegrador.model.exception.ApplicationException;
import br.com.senacsp.projetointegrador.model.service.AddressService;
import br.com.senacsp.projetointegrador.model.service.CompanyService;
import br.com.senacsp.projetointegrador.model.service.ViaCEP;

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
        inputCEP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputState = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputUF = new javax.swing.JTextField();
        buttonSubmit = new javax.swing.JButton();

        setClosable(true);
        setTitle("Create employee");
        setToolTipText("System screen to create an employee");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        title.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("New Address");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CEP");

        inputCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                handleInputCEPChange(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Address");

        inputAddress.setEnabled(false);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("State");

        inputState.setEnabled(false);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("UF");

        inputUF.setEnabled(false);

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
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(inputState)
                    .addComponent(inputUF)
                    .addComponent(inputCEP))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
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
    	
    	try {
			new AddressService().save(this.inputAddress.getText(), this.inputState.getText(), this.inputUF.getText(), this.inputCEP.getText());
			JOptionPane.showMessageDialog(this, "Created!!!", "Address Actions", JOptionPane.INFORMATION_MESSAGE);
			this.dispose();
    	} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);	
			this.dispose();
    	} catch (ApplicationException e){
			JOptionPane.showMessageDialog(this, e.getMessage(), "Application Exception", JOptionPane.ERROR_MESSAGE);
			this.dispose();
    	}
        
    }//GEN-LAST:event_buttonSubmitMouseClicked

    private void handleInputCEPChange(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_handleInputCEPChange
        if(inputCEP.getText().length() >= 8){
            inputCEP.setText(inputCEP.getText().substring(0, 8));
            AddressDTO addressDTO = ViaCEP.getCep(inputCEP.getText()); 
            
            if(addressDTO != null){
                inputAddress.setText(addressDTO.getAddress());
                inputState.setText(addressDTO.getState());
                inputUF.setText(addressDTO.getUF());
            } else {
                JOptionPane.showMessageDialog(this, "CEP not exists", "Error", JOptionPane.ERROR_MESSAGE);
                inputCEP.setText("");
                inputAddress.setText("");
                inputState.setText("");
                inputUF.setText("");
            }
        } else {
            inputAddress.setText("Loading...");
            inputState.setText("Loading...");
            inputUF.setText("Loading...");
        }
    }//GEN-LAST:event_handleInputCEPChange

    private AddressDTO CEPValidation(){
        AddressDTO addressDTO = null;
        
        if(inputCEP.getText().length() == 8){
            addressDTO = ViaCEP.getCep(inputCEP.getText()); 
            
            if(addressDTO != null){
                inputAddress.setText(addressDTO.getAddress());
                inputState.setText(addressDTO.getState());
                inputUF.setText(addressDTO.getUF());
            }
        } else {
            JOptionPane.showMessageDialog(this, "CEP not exists", "Error", JOptionPane.ERROR_MESSAGE);
            inputCEP.setText("");
            inputAddress.setText("");
            inputState.setText("");
            inputUF.setText("");
                
        }
        
        return addressDTO;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JTextField inputAddress;
    private javax.swing.JTextField inputCEP;
    private javax.swing.JTextField inputState;
    private javax.swing.JTextField inputUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
