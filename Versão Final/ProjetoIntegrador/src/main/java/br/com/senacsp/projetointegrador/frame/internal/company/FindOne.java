package br.com.senacsp.projetointegrador.frame.internal.company;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import br.com.senacsp.projetointegrador.model.dto.CompanyEmployeeDTO;

public class FindOne extends javax.swing.JInternalFrame {

    public FindOne(List<CompanyEmployeeDTO> companyEmployees) {
        initComponents();
        this.initTable(companyEmployees);
    }
    
    private void initTable(List<CompanyEmployeeDTO> companyEmployees) {
    	this.clearTable();
		
    	DefaultTableModel tabelaPessoas = (DefaultTableModel) jTable1.getModel();
    	
    	for(CompanyEmployeeDTO companyEmployee : companyEmployees) {
    		Object[] dados = {companyEmployee.getCompany(), companyEmployee.getEmployee()};
            tabelaPessoas.addRow(dados);
    	}
	}
    

	private void clearTable() {
		DefaultTableModel employeeTable = (DefaultTableModel) jTable1.getModel();
        
        Integer number = employeeTable.getRowCount();
        
        if(number > 0){
            for(int i = 0; i < number; i++){
            	employeeTable.removeRow(0);
            }
        }
	}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Find One");
        setToolTipText("System screen that finds an employee");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Company Employees");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"default", "default"}
            },
            new String [] {
                "Company", "Employee"
            }
        ));
        jTable1.setToolTipText("Employee list");
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
