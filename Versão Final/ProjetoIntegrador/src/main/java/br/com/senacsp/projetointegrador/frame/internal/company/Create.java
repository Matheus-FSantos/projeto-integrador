package br.com.senacsp.projetointegrador.frame.internal.company;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.senacsp.projetointegrador.model.exception.ApplicationException;
import br.com.senacsp.projetointegrador.model.service.CompanyService;
import br.com.senacsp.projetointegrador.model.validations.CompanyValidations;

public class Create extends javax.swing.JInternalFrame {

	public Create() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel4 = new javax.swing.JLabel();
		new javax.swing.JTextField();
		jPanel1 = new javax.swing.JPanel();
		title = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		inputCEP = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		inputName = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		inputCNPJ = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		inputNumber = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		inputComplement = new javax.swing.JTextField();
		buttonSubmit = new javax.swing.JButton();

		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel4.setText("CNPJ");

		setClosable(true);
		setTitle("Create employee");
		setToolTipText("System screen to create an employee");

		jPanel1.setBackground(new java.awt.Color(204, 204, 204));

		title.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
		title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		title.setText("New Company");

		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("CEP");

		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("Name");

		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("CNPJ");

		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel5.setText("Number");

		jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel6.setText("Complement");

		buttonSubmit.setText("Submit");
		buttonSubmit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		buttonSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				buttonSubmitMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
										javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup()
												.addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(96, 96, 96))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(inputName).addComponent(inputCNPJ).addComponent(inputCEP)
												.addComponent(inputNumber).addComponent(inputComplement)
												.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 171,
														javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(107, 107, 107)))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(inputCEP, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(25, 25, 25).addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(27, 27, 27).addComponent(jLabel3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(inputCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(25, 25, 25).addComponent(jLabel5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(inputNumber, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(25, 25, 25).addComponent(jLabel6)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(inputComplement, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
						.addComponent(buttonSubmit).addGap(25, 25, 25)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void buttonSubmitMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonSubmitMouseClicked
		try {

			CompanyValidations.handleValidateFields(this.inputCEP.getText(), this.inputName.getText(), this.inputCNPJ.getText(), this.inputNumber.getText(), this.inputComplement.getText());
			
			new CompanyService().save(this.inputCEP.getText(), this.inputName.getText(), this.inputCNPJ.getText(),
					this.inputNumber.getText(), this.inputComplement.getText());

			JOptionPane.showMessageDialog(this, "Created!!!", "Company Actions", JOptionPane.INFORMATION_MESSAGE);
			this.dispose();
		} catch (SQLException sqlException) {
			JOptionPane.showMessageDialog(this, sqlException.getMessage(), "Company Actions", JOptionPane.INFORMATION_MESSAGE);
			this.dispose();
		} catch (ApplicationException applicationException) {
			JOptionPane.showMessageDialog(this, applicationException.getMessage(), "Company Actions", JOptionPane.INFORMATION_MESSAGE);
			this.dispose();
		}

	}// GEN-LAST:event_buttonSubmitMouseClicked

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton buttonSubmit;
	private javax.swing.JTextField inputCEP;
	private javax.swing.JTextField inputCNPJ;
	private javax.swing.JTextField inputComplement;
	private javax.swing.JTextField inputName;
	private javax.swing.JTextField inputNumber;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel title;
	// End of variables declaration//GEN-END:variables
}
