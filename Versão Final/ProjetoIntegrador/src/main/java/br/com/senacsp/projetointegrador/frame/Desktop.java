package br.com.senacsp.projetointegrador.frame;

import br.com.senacsp.projetointegrador.controller.*;

public class Desktop extends javax.swing.JFrame {
    
    private EmployeeController employeeController;
    private CompanyController companyController;
    private AddressController addressController;
	
    public Desktop() {
        initComponents();
        
        this.employeeController = new EmployeeController();
        this.companyController = new CompanyController();
        this.addressController = new AddressController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        titleEmployeeActions = new javax.swing.JLabel();
        employeeFindAll = new javax.swing.JButton();
        employeeFindById = new javax.swing.JButton();
        employeeCreate = new javax.swing.JButton();
        employeeUpdate = new javax.swing.JButton();
        employeeDelete = new javax.swing.JButton();
        titleCompanyActions = new javax.swing.JLabel();
        companyFindAll = new javax.swing.JButton();
        companyFindById = new javax.swing.JButton();
        companyCreate = new javax.swing.JButton();
        companyUpdate = new javax.swing.JButton();
        companyDelete = new javax.swing.JButton();
        titleAddressActions = new javax.swing.JLabel();
        addressFindAll = new javax.swing.JButton();
        addressFindById = new javax.swing.JButton();
        addressCreate = new javax.swing.JButton();
        addressDelete = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        systemMenu = new javax.swing.JMenu();
        systemMenuExit = new javax.swing.JMenuItem();
        employeeMenu = new javax.swing.JMenu();
        employeeMenuFindAll = new javax.swing.JMenuItem();
        employeeMenuCreate = new javax.swing.JMenuItem();
        employeeMenuUpdate = new javax.swing.JMenuItem();
        employeeMenuDelete = new javax.swing.JMenuItem();
        companyMenu = new javax.swing.JMenu();
        companyMenuFindAll = new javax.swing.JMenuItem();
        companyMenuCreate = new javax.swing.JMenuItem();
        companyMenuUpdate = new javax.swing.JMenuItem();
        companyMenuDelete = new javax.swing.JMenuItem();
        addressMenu = new javax.swing.JMenu();
        addressMenuFindAll = new javax.swing.JMenuItem();
        addressMenuCreate = new javax.swing.JMenuItem();
        addressMenuDelete = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desktop");
        setResizable(false);

        titleEmployeeActions.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        titleEmployeeActions.setForeground(new java.awt.Color(255, 255, 255));
        titleEmployeeActions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleEmployeeActions.setText("Employee Actions");

        employeeFindAll.setText("Find All");
        employeeFindAll.setMaximumSize(new java.awt.Dimension(94, 70));
        employeeFindAll.setMinimumSize(new java.awt.Dimension(94, 70));
        employeeFindAll.setPreferredSize(new java.awt.Dimension(94, 70));
        employeeFindAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                handleEmployeeFindAllButton(evt);
            }
        });

        employeeFindById.setText("Find One");
        employeeFindById.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleEmployeeFindByMailButton(evt);
            }
        });

        employeeCreate.setText("Create");
        employeeCreate.setMaximumSize(new java.awt.Dimension(94, 70));
        employeeCreate.setMinimumSize(new java.awt.Dimension(94, 70));
        employeeCreate.setPreferredSize(new java.awt.Dimension(94, 70));
        employeeCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleEmployeeCreate(evt);
            }
        });

        employeeUpdate.setText("Update");
        employeeUpdate.setMaximumSize(new java.awt.Dimension(94, 70));
        employeeUpdate.setMinimumSize(new java.awt.Dimension(94, 70));
        employeeUpdate.setPreferredSize(new java.awt.Dimension(94, 70));
        employeeUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleEmployeeUpdate(evt);
            }
        });

        employeeDelete.setText("Delete");
        employeeDelete.setMaximumSize(new java.awt.Dimension(94, 70));
        employeeDelete.setMinimumSize(new java.awt.Dimension(94, 70));
        employeeDelete.setPreferredSize(new java.awt.Dimension(94, 70));
        employeeDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleEmployeeDelete(evt);
            }
        });

        titleCompanyActions.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        titleCompanyActions.setForeground(new java.awt.Color(255, 255, 255));
        titleCompanyActions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleCompanyActions.setText("Company Actions");

        companyFindAll.setText("Find All");
        companyFindAll.setMaximumSize(new java.awt.Dimension(94, 70));
        companyFindAll.setMinimumSize(new java.awt.Dimension(94, 70));
        companyFindAll.setPreferredSize(new java.awt.Dimension(94, 70));
        companyFindAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleCompanyFindAll(evt);
            }
        });

        companyFindById.setText("Find One");
        companyFindById.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleCompanyFindOne(evt);
            }
        });

        companyCreate.setText("Create");
        companyCreate.setMaximumSize(new java.awt.Dimension(94, 70));
        companyCreate.setMinimumSize(new java.awt.Dimension(94, 70));
        companyCreate.setPreferredSize(new java.awt.Dimension(94, 70));
        companyCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleCompanyCreate(evt);
            }
        });

        companyUpdate.setText("Update");
        companyUpdate.setMaximumSize(new java.awt.Dimension(94, 70));
        companyUpdate.setMinimumSize(new java.awt.Dimension(94, 70));
        companyUpdate.setPreferredSize(new java.awt.Dimension(94, 70));
        companyUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleCompanyUpdate(evt);
            }
        });

        companyDelete.setText("Delete");
        companyDelete.setMaximumSize(new java.awt.Dimension(94, 70));
        companyDelete.setMinimumSize(new java.awt.Dimension(94, 70));
        companyDelete.setPreferredSize(new java.awt.Dimension(94, 70));
        companyDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleCompanyDelete(evt);
            }
        });

        titleAddressActions.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        titleAddressActions.setForeground(new java.awt.Color(255, 255, 255));
        titleAddressActions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleAddressActions.setText("Address Actions");

        addressFindAll.setText("Find All");
        addressFindAll.setMaximumSize(new java.awt.Dimension(94, 70));
        addressFindAll.setMinimumSize(new java.awt.Dimension(94, 70));
        addressFindAll.setPreferredSize(new java.awt.Dimension(94, 70));
        addressFindAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleAddressFindAll(evt);
            }
        });

        addressFindById.setText("Find One");
        addressFindById.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleAddressFindOne(evt);
            }
        });

        addressCreate.setText("Create");
        addressCreate.setMaximumSize(new java.awt.Dimension(94, 70));
        addressCreate.setMinimumSize(new java.awt.Dimension(94, 70));
        addressCreate.setPreferredSize(new java.awt.Dimension(94, 70));
        addressCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleAddressCreate(evt);
            }
        });

        addressDelete.setText("Delete");
        addressDelete.setMaximumSize(new java.awt.Dimension(94, 70));
        addressDelete.setMinimumSize(new java.awt.Dimension(94, 70));
        addressDelete.setPreferredSize(new java.awt.Dimension(94, 70));
        addressDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleAddressDelete(evt);
            }
        });

        desktop.setLayer(titleEmployeeActions, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(employeeFindAll, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(employeeFindById, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(employeeCreate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(employeeUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(employeeDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(titleCompanyActions, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(companyFindAll, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(companyFindById, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(companyCreate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(companyUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(companyDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(titleAddressActions, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(addressFindAll, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(addressFindById, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(addressCreate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(addressDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleAddressActions, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(titleCompanyActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(desktopLayout.createSequentialGroup()
                                        .addComponent(companyFindAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(companyFindById, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(companyCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(companyUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(companyDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(titleEmployeeActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(desktopLayout.createSequentialGroup()
                                        .addComponent(employeeFindAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(employeeFindById, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(employeeCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(employeeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(employeeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(addressFindAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addressFindById, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addressCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addressDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(333, Short.MAX_VALUE))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(titleEmployeeActions, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeFindAll, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeFindById, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(titleCompanyActions, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyFindAll, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companyFindById, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companyCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companyUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companyDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(titleAddressActions, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressFindAll, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressFindById, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        systemMenu.setText("System");
        systemMenu.setToolTipText("System actions");

        systemMenuExit.setText("Logout");
        systemMenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                handleSystemMenuExit(evt);
            }
        });
        systemMenu.add(systemMenuExit);

        menu.add(systemMenu);

        employeeMenu.setText("Employee");
        employeeMenu.setToolTipText("Actions for system employees");

        employeeMenuFindAll.setText("Find All");
        employeeMenuFindAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleEmployeeMenuFindAll(evt);
            }
        });
        employeeMenu.add(employeeMenuFindAll);

        employeeMenuCreate.setText("Create");
        employeeMenuCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleEmployeeMenuCreate(evt);
            }
        });
        employeeMenu.add(employeeMenuCreate);

        employeeMenuUpdate.setText("Update");
        employeeMenuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleEmployeeMenuUpdate(evt);
            }
        });
        employeeMenu.add(employeeMenuUpdate);

        employeeMenuDelete.setText("Delete");
        employeeMenuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleEmployeeMenuDelete(evt);
            }
        });
        employeeMenu.add(employeeMenuDelete);

        menu.add(employeeMenu);

        companyMenu.setText("Company");
        companyMenu.setToolTipText("Actions for companies in the system");

        companyMenuFindAll.setText("Find All");
        companyMenuFindAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleCompanyMenuFindAll(evt);
            }
        });
        companyMenu.add(companyMenuFindAll);

        companyMenuCreate.setText("Create");
        companyMenuCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleCompanyMenuCreate(evt);
            }
        });
        companyMenu.add(companyMenuCreate);

        companyMenuUpdate.setText("Update");
        companyMenuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleCompanyMenuUpdate(evt);
            }
        });
        companyMenu.add(companyMenuUpdate);

        companyMenuDelete.setText("Delete");
        companyMenuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleCompanyMenuDelete(evt);
            }
        });
        companyMenu.add(companyMenuDelete);

        menu.add(companyMenu);

        addressMenu.setText("Address");
        addressMenu.setToolTipText("Actions for system addresses");

        addressMenuFindAll.setText("Find All");
        addressMenuFindAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleAddressMenuFindAll(evt);
            }
        });
        addressMenu.add(addressMenuFindAll);

        addressMenuCreate.setText("Create");
        addressMenuCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleAddressMenuCreate(evt);
            }
        });
        addressMenu.add(addressMenuCreate);

        addressMenuDelete.setText("Delete");
        addressMenuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleAddressMenuDelete(evt);
            }
        });
        addressMenu.add(addressMenuDelete);

        menu.add(addressMenu);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void handleSystemMenuExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleSystemMenuExit
        System.exit(0);
    }//GEN-LAST:event_handleSystemMenuExit

    private void handleEmployeeFindAllButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleEmployeeFindAllButton
        employeeController.findAll(desktop);
    }//GEN-LAST:event_handleEmployeeFindAllButton

    private void handleEmployeeFindByMailButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleEmployeeFindByMailButton
        employeeController.findOne(desktop);
    }//GEN-LAST:event_handleEmployeeFindByMailButton

    private void handleEmployeeCreate(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleEmployeeCreate
        employeeController.create(desktop);
    }//GEN-LAST:event_handleEmployeeCreate

    private void handleEmployeeUpdate(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleEmployeeUpdate
        employeeController.update(desktop);
    }//GEN-LAST:event_handleEmployeeUpdate

    private void handleEmployeeDelete(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleEmployeeDelete
        employeeController.delete();
    }//GEN-LAST:event_handleEmployeeDelete

    private void handleEmployeeMenuFindAll(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleEmployeeMenuFindAll
        employeeController.findAll(desktop);
    }//GEN-LAST:event_handleEmployeeMenuFindAll

    private void handleEmployeeMenuCreate(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleEmployeeMenuCreate
        employeeController.create(desktop);
    }//GEN-LAST:event_handleEmployeeMenuCreate

    private void handleEmployeeMenuUpdate(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleEmployeeMenuUpdate
        employeeController.update(desktop);
    }//GEN-LAST:event_handleEmployeeMenuUpdate

    private void handleEmployeeMenuDelete(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleEmployeeMenuDelete
        employeeController.delete();
    }//GEN-LAST:event_handleEmployeeMenuDelete

    private void handleAddressCreate(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleAddressCreate
        addressController.create(desktop);
    }//GEN-LAST:event_handleAddressCreate

    private void handleAddressFindAll(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleAddressFindAll
        addressController.findAll(desktop);
    }//GEN-LAST:event_handleAddressFindAll

    private void handleAddressFindOne(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleAddressFindOne
        addressController.findOne(desktop);
    }//GEN-LAST:event_handleAddressFindOne

    private void handleAddressDelete(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleAddressDelete
        addressController.delete();
    }//GEN-LAST:event_handleAddressDelete

    private void handleAddressMenuFindAll(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleAddressMenuFindAll
        addressController.findAll(desktop);
    }//GEN-LAST:event_handleAddressMenuFindAll

    private void handleAddressMenuCreate(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleAddressMenuCreate
        addressController.create(desktop);
    }//GEN-LAST:event_handleAddressMenuCreate

    private void handleAddressMenuDelete(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleAddressMenuDelete
        addressController.delete();
    }//GEN-LAST:event_handleAddressMenuDelete

    /*
        
        COPIAR DAQUI PARA BAIXO
    
    */
    
    private void handleCompanyFindAll(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleCompanyFindAll
        this.companyController.findAll(desktop);
    }//GEN-LAST:event_handleCompanyFindAll

    private void handleCompanyFindOne(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleCompanyFindOne
        this.companyController.findOne(desktop);
    }//GEN-LAST:event_handleCompanyFindOne

    private void handleCompanyCreate(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleCompanyCreate
        this.companyController.create(desktop);
    }//GEN-LAST:event_handleCompanyCreate

    private void handleCompanyUpdate(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleCompanyUpdate
        this.companyController.update(desktop);
    }//GEN-LAST:event_handleCompanyUpdate

    private void handleCompanyDelete(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleCompanyDelete
        this.companyController.delete();
    }//GEN-LAST:event_handleCompanyDelete

    private void handleCompanyMenuFindAll(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleCompanyMenuFindAll
        this.companyController.findAll(desktop);
    }//GEN-LAST:event_handleCompanyMenuFindAll

    private void handleCompanyMenuCreate(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleCompanyMenuCreate
        this.companyController.create(desktop);
    }//GEN-LAST:event_handleCompanyMenuCreate

    private void handleCompanyMenuUpdate(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleCompanyMenuUpdate
        this.companyController.update(desktop);
    }//GEN-LAST:event_handleCompanyMenuUpdate

    private void handleCompanyMenuDelete(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleCompanyMenuDelete
        this.companyController.delete();
    }//GEN-LAST:event_handleCompanyMenuDelete

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addressCreate;
    private javax.swing.JButton addressDelete;
    private javax.swing.JButton addressFindAll;
    private javax.swing.JButton addressFindById;
    private javax.swing.JMenu addressMenu;
    private javax.swing.JMenuItem addressMenuCreate;
    private javax.swing.JMenuItem addressMenuDelete;
    private javax.swing.JMenuItem addressMenuFindAll;
    private javax.swing.JButton companyCreate;
    private javax.swing.JButton companyDelete;
    private javax.swing.JButton companyFindAll;
    private javax.swing.JButton companyFindById;
    private javax.swing.JMenu companyMenu;
    private javax.swing.JMenuItem companyMenuCreate;
    private javax.swing.JMenuItem companyMenuDelete;
    private javax.swing.JMenuItem companyMenuFindAll;
    private javax.swing.JMenuItem companyMenuUpdate;
    private javax.swing.JButton companyUpdate;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton employeeCreate;
    private javax.swing.JButton employeeDelete;
    private javax.swing.JButton employeeFindAll;
    private javax.swing.JButton employeeFindById;
    private javax.swing.JMenu employeeMenu;
    private javax.swing.JMenuItem employeeMenuCreate;
    private javax.swing.JMenuItem employeeMenuDelete;
    private javax.swing.JMenuItem employeeMenuFindAll;
    private javax.swing.JMenuItem employeeMenuUpdate;
    private javax.swing.JButton employeeUpdate;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu systemMenu;
    private javax.swing.JMenuItem systemMenuExit;
    private javax.swing.JLabel titleAddressActions;
    private javax.swing.JLabel titleCompanyActions;
    private javax.swing.JLabel titleEmployeeActions;
    // End of variables declaration//GEN-END:variables
}
