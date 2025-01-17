package com.collegeapp.view;

import com.collegeapp.model.StudentModel;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prithivi
 */
public class CollegeApp extends javax.swing.JFrame {

    private List<StudentModel> studentList;
    private java.awt.CardLayout cardLayout;

    /**
     * Creates new form CollegeApp
     */
    public CollegeApp() {
        initComponents();
        initializeLayout(); // Set up CardLayout and add screens
        initializeData(); // Initialize student data and table
        startProgress(); // Show loading screen and initiate progress
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainScreen = new javax.swing.JPanel();
        pnlMainBar = new javax.swing.JPanel();
        lblMainBarSlogan = new javax.swing.JLabel();
        lblMainBarLogo = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        tabPaneMain = new javax.swing.JTabbedPane();
        pnlHome = new javax.swing.JPanel();
        pnlStudentList = new javax.swing.JPanel();
        spTblStudent = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        lblTblStudentTitle = new javax.swing.JLabel();
        pnlAdminControl = new javax.swing.JPanel();
        pnlAboutUs = new javax.swing.JPanel();
        pnlLoginScreen = new javax.swing.JPanel();
        pnlLoginLeft = new javax.swing.JPanel();
        lblLoginLogo = new javax.swing.JLabel();
        lblLoginTitle = new javax.swing.JLabel();
        txtFldLoginUsername = new javax.swing.JTextField();
        pwdFldLogin = new javax.swing.JPasswordField();
        lblLoginSubTitle = new javax.swing.JLabel();
        lblLoginForgotPwd = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblLoginError = new javax.swing.JLabel();
        pnlLoadingScreen = new javax.swing.JPanel();
        lblLoadingLogo = new javax.swing.JLabel();
        pgBarSplashScreen = new javax.swing.JProgressBar(0,100);
        lblLoading = new javax.swing.JLabel();

        pnlMainScreen.setBackground(new java.awt.Color(0, 0, 0));
        pnlMainScreen.setMaximumSize(new java.awt.Dimension(1130, 514));
        pnlMainScreen.setMinimumSize(new java.awt.Dimension(1130, 514));
        pnlMainScreen.setPreferredSize(new java.awt.Dimension(1130, 514));

        pnlMainBar.setBackground(new java.awt.Color(234, 192, 32));

        lblMainBarSlogan.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lblMainBarSlogan.setText("Empowering Students, Simplifying Management.");

        lblMainBarLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/collegeapp/resources/logo_sm.png"))); // NOI18N

        btnLogout.setBackground(new java.awt.Color(234, 192, 32));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogout.setText("Log out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainBarLayout = new javax.swing.GroupLayout(pnlMainBar);
        pnlMainBar.setLayout(pnlMainBarLayout);
        pnlMainBarLayout.setHorizontalGroup(
            pnlMainBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblMainBarLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMainBarSlogan, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlMainBarLayout.setVerticalGroup(
            pnlMainBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMainBarLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMainBarSlogan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabPaneMain.setBackground(new java.awt.Color(234, 192, 32));
        tabPaneMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 192, 32)));
        tabPaneMain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        pnlHome.setBackground(new java.awt.Color(0, 0, 0));
        pnlHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 192, 32)));

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabPaneMain.addTab("Home", pnlHome);

        pnlStudentList.setBackground(new java.awt.Color(0, 0, 0));

        tblStudent.setBackground(new java.awt.Color(234, 192, 32));
        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LMU ID", "Full Name", "Program", "Contact", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudent.setGridColor(new java.awt.Color(0, 0, 0));
        tblStudent.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tblStudent.setSelectionForeground(new java.awt.Color(234, 192, 32));
        tblStudent.setShowGrid(true);
        tblStudent.getTableHeader().setReorderingAllowed(false);
        spTblStudent.setViewportView(tblStudent);
        if (tblStudent.getColumnModel().getColumnCount() > 0) {
            tblStudent.getColumnModel().getColumn(0).setResizable(false);
            tblStudent.getColumnModel().getColumn(1).setResizable(false);
            tblStudent.getColumnModel().getColumn(2).setResizable(false);
            tblStudent.getColumnModel().getColumn(3).setResizable(false);
            tblStudent.getColumnModel().getColumn(4).setResizable(false);
            tblStudent.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        lblTblStudentTitle.setBackground(new java.awt.Color(234, 192, 32));
        lblTblStudentTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTblStudentTitle.setForeground(new java.awt.Color(234, 192, 32));
        lblTblStudentTitle.setText("Student Information");
        lblTblStudentTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 192, 32)));

        javax.swing.GroupLayout pnlStudentListLayout = new javax.swing.GroupLayout(pnlStudentList);
        pnlStudentList.setLayout(pnlStudentListLayout);
        pnlStudentListLayout.setHorizontalGroup(
            pnlStudentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentListLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlStudentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTblStudentTitle)
                    .addComponent(spTblStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlStudentListLayout.setVerticalGroup(
            pnlStudentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentListLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTblStudentTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spTblStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPaneMain.addTab("Student List", pnlStudentList);

        pnlAdminControl.setBackground(new java.awt.Color(0, 0, 0));
        pnlAdminControl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 192, 32)));

        javax.swing.GroupLayout pnlAdminControlLayout = new javax.swing.GroupLayout(pnlAdminControl);
        pnlAdminControl.setLayout(pnlAdminControlLayout);
        pnlAdminControlLayout.setHorizontalGroup(
            pnlAdminControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlAdminControlLayout.setVerticalGroup(
            pnlAdminControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabPaneMain.addTab("Admin Control", pnlAdminControl);

        pnlAboutUs.setBackground(new java.awt.Color(0, 0, 0));
        pnlAboutUs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 192, 32)));

        javax.swing.GroupLayout pnlAboutUsLayout = new javax.swing.GroupLayout(pnlAboutUs);
        pnlAboutUs.setLayout(pnlAboutUsLayout);
        pnlAboutUsLayout.setHorizontalGroup(
            pnlAboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlAboutUsLayout.setVerticalGroup(
            pnlAboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabPaneMain.addTab("About Us", pnlAboutUs);

        javax.swing.GroupLayout pnlMainScreenLayout = new javax.swing.GroupLayout(pnlMainScreen);
        pnlMainScreen.setLayout(pnlMainScreenLayout);
        pnlMainScreenLayout.setHorizontalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMainScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPaneMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1118, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMainScreenLayout.setVerticalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainScreenLayout.createSequentialGroup()
                .addComponent(pnlMainBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPaneMain, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
        );

        pnlLoginScreen.setBackground(new java.awt.Color(0, 0, 0));
        pnlLoginScreen.setMaximumSize(new java.awt.Dimension(1130, 514));
        pnlLoginScreen.setMinimumSize(new java.awt.Dimension(1130, 514));
        pnlLoginScreen.setPreferredSize(new java.awt.Dimension(1130, 514));

        pnlLoginLeft.setBackground(new java.awt.Color(234, 192, 32));
        pnlLoginLeft.setMaximumSize(new java.awt.Dimension(570, 514));
        pnlLoginLeft.setMinimumSize(new java.awt.Dimension(570, 514));
        pnlLoginLeft.setPreferredSize(new java.awt.Dimension(570, 514));

        lblLoginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/collegeapp/resources/logo_big.png"))); // NOI18N

        javax.swing.GroupLayout pnlLoginLeftLayout = new javax.swing.GroupLayout(pnlLoginLeft);
        pnlLoginLeft.setLayout(pnlLoginLeftLayout);
        pnlLoginLeftLayout.setHorizontalGroup(
            pnlLoginLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLeftLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(lblLoginLogo)
                .addGap(83, 83, 83))
        );
        pnlLoginLeftLayout.setVerticalGroup(
            pnlLoginLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLeftLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lblLoginLogo)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        lblLoginTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLoginTitle.setForeground(new java.awt.Color(234, 192, 32));
        lblLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginTitle.setText("Sign in to CollegeApp");

        txtFldLoginUsername.setBackground(new java.awt.Color(0, 0, 0));
        txtFldLoginUsername.setForeground(new java.awt.Color(234, 192, 32));
        txtFldLoginUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 192, 32), 2), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(234, 192, 32))); // NOI18N

        pwdFldLogin.setBackground(new java.awt.Color(0, 0, 0));
        pwdFldLogin.setForeground(new java.awt.Color(234, 192, 32));
        pwdFldLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 192, 32), 2), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(234, 192, 32))); // NOI18N

        lblLoginSubTitle.setBackground(new java.awt.Color(234, 192, 32));
        lblLoginSubTitle.setForeground(new java.awt.Color(234, 192, 32));
        lblLoginSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginSubTitle.setText("Please enter your login details below using this app.");

        lblLoginForgotPwd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLoginForgotPwd.setForeground(new java.awt.Color(234, 192, 32));
        lblLoginForgotPwd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginForgotPwd.setText("Forgot your password?");

        btnLogin.setBackground(new java.awt.Color(234, 192, 32));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblLoginError.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLoginError.setForeground(new java.awt.Color(255, 0, 0));
        lblLoginError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlLoginScreenLayout = new javax.swing.GroupLayout(pnlLoginScreen);
        pnlLoginScreen.setLayout(pnlLoginScreenLayout);
        pnlLoginScreenLayout.setHorizontalGroup(
            pnlLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                .addComponent(pnlLoginLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 99, Short.MAX_VALUE))
                    .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                                .addComponent(lblLoginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginScreenLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnlLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFldLoginUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                    .addComponent(pwdFldLogin))
                                .addGap(97, 97, 97))
                            .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                                .addComponent(lblLoginSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginScreenLayout.createSequentialGroup()
                                .addComponent(lblLoginForgotPwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                                .addComponent(lblLoginError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        pnlLoginScreenLayout.setVerticalGroup(
            pnlLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                .addComponent(pnlLoginLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblLoginError)
                .addGap(26, 26, 26)
                .addComponent(lblLoginTitle)
                .addGap(18, 18, 18)
                .addComponent(lblLoginSubTitle)
                .addGap(26, 26, 26)
                .addComponent(txtFldLoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pwdFldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLoginForgotPwd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1130, 514));
        setMinimumSize(new java.awt.Dimension(1130, 514));
        setSize(new java.awt.Dimension(1130, 514));

        pnlLoadingScreen.setBackground(new java.awt.Color(234, 192, 32));

        lblLoadingLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoadingLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/collegeapp/resources/logo_big.png"))); // NOI18N

        pgBarSplashScreen.setStringPainted(true);
        pgBarSplashScreen.setForeground(new java.awt.Color(0, 0, 0));

        lblLoading.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLoading.setText("Loading...");

        javax.swing.GroupLayout pnlLoadingScreenLayout = new javax.swing.GroupLayout(pnlLoadingScreen);
        pnlLoadingScreen.setLayout(pnlLoadingScreenLayout);
        pnlLoadingScreenLayout.setHorizontalGroup(
            pnlLoadingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoadingScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoadingLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlLoadingScreenLayout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addGroup(pnlLoadingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoading)
                    .addComponent(pgBarSplashScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(375, Short.MAX_VALUE))
        );
        pnlLoadingScreenLayout.setVerticalGroup(
            pnlLoadingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoadingScreenLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(lblLoadingLogo)
                .addGap(27, 27, 27)
                .addComponent(pgBarSplashScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLoading)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLoadingScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLoadingScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Method to set up the CardLayout and add panels

    private void initializeLayout() {
        cardLayout = new java.awt.CardLayout();
        getContentPane().setLayout(cardLayout);

        // Add panels with unique identifiers
        getContentPane().add(pnlLoadingScreen, "LoadingScreen");
        getContentPane().add(pnlLoginScreen, "LoginScreen");
        getContentPane().add(pnlMainScreen, "MainScreen");

        // Start with the loading screen
        cardLayout.show(getContentPane(), "LoadingScreen");
    }

    // Method to initialize data, including student list and table
    private void initializeData() {
        studentList = new LinkedList();
        registerStudent(new StudentModel(123, "Suman", "BIT. Computing", "9876", (short) 21));
        registerStudent(new StudentModel(1234, "Radha", "BIT. Computing", "98736", (short) 21));
    }
    
    // Method to simulate loading progress
    private void startProgress() {
        javax.swing.SwingWorker<Void, Integer> worker = new javax.swing.SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(30); // Simulated delay for progress bar
                    publish(i);
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                int progress = chunks.get(chunks.size() - 1);
                pgBarSplashScreen.setValue(progress);
            }

            @Override
            protected void done() {
                loadScreen("LoginScreen"); // Switch to login screen
            }
        };
        worker.execute();
    }

    // Method to add student data and populate the table
    private void registerStudent(StudentModel student) {
        studentList.add(student);
        DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
        model.addRow(new Object[]{
            student.getLmuId(), student.getName(), student.getProgram(),
            student.getContact(), student.getAge()
        });
    }
    
    
    // Method to switch screens
    private void loadScreen(String screenName) {
        cardLayout.show(getContentPane(), screenName);
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Get the username and password input
        String username = txtFldLoginUsername.getText();
        String password = new String(pwdFldLogin.getPassword());

        // Check if username or password is empty
        if (username.isEmpty() || password.isEmpty()) {
            lblLoginError.setText("Please enter your username and password.");
        } // Check if username and password are incorrect
        else if (!username.equals("admin") || !password.equals("admin")) {
            lblLoginError.setText("Username and password mismatch.");
        } // If credentials are correct, proceed to load the main screen
        else {
            lblLoginError.setText(""); // Clear any previous error messages
            loadScreen("MainScreen"); // Load the main screen
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        pwdFldLogin.setText("");
        txtFldLoginUsername.setText("");
        loadScreen("LoginScreen"); // Load the main screen
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CollegeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CollegeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CollegeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CollegeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        CollegeApp app = new CollegeApp();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            app.setVisible(true);
        });

        app.startProgress();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel lblLoading;
    private javax.swing.JLabel lblLoadingLogo;
    private javax.swing.JLabel lblLoginError;
    private javax.swing.JLabel lblLoginForgotPwd;
    private javax.swing.JLabel lblLoginLogo;
    private javax.swing.JLabel lblLoginSubTitle;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblMainBarLogo;
    private javax.swing.JLabel lblMainBarSlogan;
    private javax.swing.JLabel lblTblStudentTitle;
    private javax.swing.JProgressBar pgBarSplashScreen;
    private javax.swing.JPanel pnlAboutUs;
    private javax.swing.JPanel pnlAdminControl;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlLoadingScreen;
    private javax.swing.JPanel pnlLoginLeft;
    private javax.swing.JPanel pnlLoginScreen;
    private javax.swing.JPanel pnlMainBar;
    private javax.swing.JPanel pnlMainScreen;
    private javax.swing.JPanel pnlStudentList;
    private javax.swing.JPasswordField pwdFldLogin;
    private javax.swing.JScrollPane spTblStudent;
    private javax.swing.JTabbedPane tabPaneMain;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField txtFldLoginUsername;
    // End of variables declaration//GEN-END:variables
}
