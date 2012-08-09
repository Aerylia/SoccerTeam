/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.view;

import javax.swing.JOptionPane;
import soccerTeam.control.SoccerTeamController;

/**
 *
 * @author Arianne
 */
public class MainUI extends javax.swing.JFrame {

    private SoccerTeamController stc;
    
    /**
     * Creates new form MainUI
     */
    public MainUI(SoccerTeamController stc, String username) {
        this.stc = stc;
        initComponents();
        this.welcomeTextLabel.setText("Welcome " + username + ".");
    }
    
    private SoccerTeamController getSTC(){
        return this.stc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginInfoDialog = new javax.swing.JDialog();
        loginInfoPanel = new javax.swing.JPanel();
        loginInfoIntroLabel = new javax.swing.JLabel();
        loginInfoUsernameLabel = new javax.swing.JLabel();
        loginInfoPasswordLabel = new javax.swing.JLabel();
        loginInfoPasswordTextField = new javax.swing.JTextField();
        loginInfoUsernameTextField = new javax.swing.JTextField();
        loginInfoCancelButton = new javax.swing.JButton();
        loginInfoOKButton = new javax.swing.JButton();
        loginInfoIntro2Label = new javax.swing.JLabel();
        mainTabbedPane = new javax.swing.JTabbedPane();
        profilePanel = new javax.swing.JPanel();
        profileTeamLabel = new javax.swing.JLabel();
        profileNameLabel = new javax.swing.JLabel();
        profileGenderLabel = new javax.swing.JLabel();
        profileStreetLabel = new javax.swing.JLabel();
        profileZipcodeLabel = new javax.swing.JLabel();
        profileLogoffLabel = new javax.swing.JButton();
        profileSaveButton = new javax.swing.JButton();
        profileTeamTextField = new javax.swing.JTextField();
        profileGenderTextField = new javax.swing.JTextField();
        profileNameTextField = new javax.swing.JTextField();
        profileStreetTextField = new javax.swing.JTextField();
        profileZipcodeTextField = new javax.swing.JTextField();
        profilePhonenumberLabel = new javax.swing.JLabel();
        profilePhonenumberTextField = new javax.swing.JTextField();
        profileHousenumberLabel = new javax.swing.JLabel();
        profileCityLabel = new javax.swing.JLabel();
        profileHousenumberTextField = new javax.swing.JTextField();
        profileCityTextField = new javax.swing.JTextField();
        profileLoginInfoButton = new javax.swing.JButton();
        soccerAssociationPanel = new javax.swing.JPanel();
        soccerAssociationNameLabel = new javax.swing.JLabel();
        soccerAssociationStreetLabel = new javax.swing.JLabel();
        soccerAssociationZipcodeLabel = new javax.swing.JLabel();
        soccerAssociationPhonenumberLabel = new javax.swing.JLabel();
        SoccerAssociationPhonenumberTextField = new javax.swing.JTextField();
        soccerAssociationZipcodeTextField = new javax.swing.JTextField();
        soccerAssociationStreetTextField = new javax.swing.JTextField();
        soccerAssociationNameTextField = new javax.swing.JTextField();
        soccerAssociationHousenumberLabel = new javax.swing.JLabel();
        soccerAssociationHousenumberTextField = new javax.swing.JTextField();
        soccerAssociationCityLabel = new javax.swing.JLabel();
        soccerAssociationCityTextField = new javax.swing.JTextField();
        availabilityPanel = new javax.swing.JPanel();
        availabilityIntroLabel = new javax.swing.JLabel();
        availabilityScrollPane = new javax.swing.JScrollPane();
        availabilityTable = new javax.swing.JTable();
        matchStatsPanel = new javax.swing.JPanel();
        teamPanel = new javax.swing.JPanel();
        welcomeTextLabel = new javax.swing.JLabel();

        loginInfoDialog.setResizable(false);

        loginInfoIntroLabel.setText("Type your new username and password  and press OK to change it.");

        loginInfoUsernameLabel.setText("Username :");

        loginInfoPasswordLabel.setText("Password :");

        loginInfoCancelButton.setText("Cancel");
        loginInfoCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginInfoCancelButtonActionPerformed(evt);
            }
        });

        loginInfoOKButton.setText("OK");
        loginInfoOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginInfoOKButtonActionPerformed(evt);
            }
        });

        loginInfoIntro2Label.setText("Press Cancel to close this window without saving.");

        javax.swing.GroupLayout loginInfoPanelLayout = new javax.swing.GroupLayout(loginInfoPanel);
        loginInfoPanel.setLayout(loginInfoPanelLayout);
        loginInfoPanelLayout.setHorizontalGroup(
            loginInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginInfoPanelLayout.createSequentialGroup()
                        .addGroup(loginInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginInfoUsernameLabel)
                            .addComponent(loginInfoPasswordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginInfoPasswordTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginInfoUsernameTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginInfoPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loginInfoCancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginInfoOKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginInfoPanelLayout.createSequentialGroup()
                        .addGroup(loginInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginInfoIntroLabel)
                            .addComponent(loginInfoIntro2Label))
                        .addGap(0, 7, Short.MAX_VALUE))))
        );
        loginInfoPanelLayout.setVerticalGroup(
            loginInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginInfoIntroLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginInfoIntro2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginInfoUsernameLabel)
                    .addComponent(loginInfoUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginInfoPasswordLabel)
                    .addComponent(loginInfoPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginInfoOKButton)
                    .addComponent(loginInfoCancelButton)))
        );

        javax.swing.GroupLayout loginInfoDialogLayout = new javax.swing.GroupLayout(loginInfoDialog.getContentPane());
        loginInfoDialog.getContentPane().setLayout(loginInfoDialogLayout);
        loginInfoDialogLayout.setHorizontalGroup(
            loginInfoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginInfoDialogLayout.createSequentialGroup()
                .addComponent(loginInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginInfoDialogLayout.setVerticalGroup(
            loginInfoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginInfoDialogLayout.createSequentialGroup()
                .addComponent(loginInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Programname");

        profileTeamLabel.setText("Team :");

        profileNameLabel.setText("Name :");

        profileGenderLabel.setText("Gender :");

        profileStreetLabel.setText("Street :");

        profileZipcodeLabel.setText("Zipcode :");

        profileLogoffLabel.setText("Log off");
        profileLogoffLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileLogoffLabelActionPerformed(evt);
            }
        });

        profileSaveButton.setText("Save");
        profileSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileSaveButtonActionPerformed(evt);
            }
        });

        profilePhonenumberLabel.setText("Phonenr. :");

        profileHousenumberLabel.setText("Housenr. :");

        profileCityLabel.setText("City :");

        profileLoginInfoButton.setText("Login Info");
        profileLoginInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileLoginInfoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(profileSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profileLoginInfoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profileLogoffLabel))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(profileTeamLabel)
                                    .addComponent(profileNameLabel)
                                    .addComponent(profileGenderLabel)
                                    .addComponent(profileStreetLabel)
                                    .addComponent(profileZipcodeLabel)))
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(profilePhonenumberLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profileTeamTextField)
                            .addComponent(profileNameTextField)
                            .addComponent(profileGenderTextField)
                            .addComponent(profilePhonenumberTextField)
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addComponent(profileZipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profileCityLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profileCityTextField))
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addComponent(profileStreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profileHousenumberLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profileHousenumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileTeamLabel)
                    .addComponent(profileTeamTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileNameLabel)
                    .addComponent(profileNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileGenderLabel)
                    .addComponent(profileGenderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileStreetLabel)
                    .addComponent(profileStreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileHousenumberLabel)
                    .addComponent(profileHousenumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileZipcodeLabel)
                    .addComponent(profileZipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileCityLabel)
                    .addComponent(profileCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profilePhonenumberLabel)
                    .addComponent(profilePhonenumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileLogoffLabel)
                    .addComponent(profileLoginInfoButton)
                    .addComponent(profileSaveButton))
                .addContainerGap())
        );

        mainTabbedPane.addTab("Profile", profilePanel);

        soccerAssociationNameLabel.setText("Name :");

        soccerAssociationStreetLabel.setText("Street :");

        soccerAssociationZipcodeLabel.setText("Zipcode :");

        soccerAssociationPhonenumberLabel.setText("Phonenumber :");

        soccerAssociationHousenumberLabel.setText("Housenr. :");

        soccerAssociationCityLabel.setText("City :");

        javax.swing.GroupLayout soccerAssociationPanelLayout = new javax.swing.GroupLayout(soccerAssociationPanel);
        soccerAssociationPanel.setLayout(soccerAssociationPanelLayout);
        soccerAssociationPanelLayout.setHorizontalGroup(
            soccerAssociationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(soccerAssociationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(soccerAssociationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soccerAssociationPhonenumberLabel)
                    .addComponent(soccerAssociationNameLabel)
                    .addComponent(soccerAssociationStreetLabel)
                    .addComponent(soccerAssociationZipcodeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(soccerAssociationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SoccerAssociationPhonenumberTextField)
                    .addComponent(soccerAssociationNameTextField)
                    .addGroup(soccerAssociationPanelLayout.createSequentialGroup()
                        .addComponent(soccerAssociationStreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soccerAssociationHousenumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soccerAssociationHousenumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                    .addGroup(soccerAssociationPanelLayout.createSequentialGroup()
                        .addComponent(soccerAssociationZipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soccerAssociationCityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soccerAssociationCityTextField)))
                .addContainerGap())
        );
        soccerAssociationPanelLayout.setVerticalGroup(
            soccerAssociationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(soccerAssociationPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(soccerAssociationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soccerAssociationNameLabel)
                    .addComponent(soccerAssociationNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(soccerAssociationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soccerAssociationStreetLabel)
                    .addComponent(soccerAssociationStreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soccerAssociationHousenumberLabel)
                    .addComponent(soccerAssociationHousenumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(soccerAssociationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soccerAssociationZipcodeLabel)
                    .addComponent(soccerAssociationZipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soccerAssociationCityLabel)
                    .addComponent(soccerAssociationCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(soccerAssociationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soccerAssociationPhonenumberLabel)
                    .addComponent(SoccerAssociationPhonenumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        mainTabbedPane.addTab("SoccerAssociation", soccerAssociationPanel);

        availabilityIntroLabel.setText("You are available for these matches :");

        availabilityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Opponents", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        availabilityTable.getTableHeader().setReorderingAllowed(false);
        availabilityScrollPane.setViewportView(availabilityTable);

        javax.swing.GroupLayout availabilityPanelLayout = new javax.swing.GroupLayout(availabilityPanel);
        availabilityPanel.setLayout(availabilityPanelLayout);
        availabilityPanelLayout.setHorizontalGroup(
            availabilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availabilityPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(availabilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(availabilityScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addGroup(availabilityPanelLayout.createSequentialGroup()
                        .addComponent(availabilityIntroLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        availabilityPanelLayout.setVerticalGroup(
            availabilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availabilityPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(availabilityIntroLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(availabilityScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
        );

        mainTabbedPane.addTab("Availability", availabilityPanel);

        javax.swing.GroupLayout matchStatsPanelLayout = new javax.swing.GroupLayout(matchStatsPanel);
        matchStatsPanel.setLayout(matchStatsPanelLayout);
        matchStatsPanelLayout.setHorizontalGroup(
            matchStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );
        matchStatsPanelLayout.setVerticalGroup(
            matchStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        mainTabbedPane.addTab("Match Statistics", matchStatsPanel);

        javax.swing.GroupLayout teamPanelLayout = new javax.swing.GroupLayout(teamPanel);
        teamPanel.setLayout(teamPanelLayout);
        teamPanelLayout.setHorizontalGroup(
            teamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );
        teamPanelLayout.setVerticalGroup(
            teamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        mainTabbedPane.addTab("Team", teamPanel);

        welcomeTextLabel.setText("Welcome \"username\".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(welcomeTextLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(mainTabbedPane))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeTextLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainTabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileLogoffLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileLogoffLabelActionPerformed
        this.getSTC().logoff();
    }//GEN-LAST:event_profileLogoffLabelActionPerformed

    private void loginInfoOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginInfoOKButtonActionPerformed
        this.getSTC().changeLoginInfoUser(this.loginInfoUsernameTextField.getText(),
                                          this.loginInfoPasswordTextField.getText());
        this.loginInfoDialog.dispose();
    }//GEN-LAST:event_loginInfoOKButtonActionPerformed

    private void profileLoginInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileLoginInfoButtonActionPerformed
        this.loginInfoUsernameTextField.setText(this.getSTC().getUsernameUser());
        this.loginInfoPasswordTextField.setText(this.getSTC().getPasswordUser());
        this.loginInfoDialog.setSize(450, 200);
        this.loginInfoDialog.setVisible(true);
    }//GEN-LAST:event_profileLoginInfoButtonActionPerformed

    private void loginInfoCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginInfoCancelButtonActionPerformed
        this.loginInfoDialog.dispose();
    }//GEN-LAST:event_loginInfoCancelButtonActionPerformed

    private void profileSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileSaveButtonActionPerformed
        if (this.getSTC().changeGenderUser(this.profileGenderTextField.getText())){
            this.getSTC().changeNameUser(this.profileNameTextField.getText());  
            this.getSTC().changeStreetUser(this.profileStreetTextField.getText());
            this.getSTC().changeHousenumberUser(this.profileHousenumberTextField.getText());
            this.getSTC().changeZipcodeUser(this.profileZipcodeTextField.getText());
            this.getSTC().changeCityUser(this.profileCityTextField.getText());
            this.getSTC().changePhonenumberUser(this.profilePhonenumberTextField.getText());
            JOptionPane.showMessageDialog(this, "Changes succesfully saved.");
        } 
    }//GEN-LAST:event_profileSaveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SoccerAssociationPhonenumberTextField;
    private javax.swing.JLabel availabilityIntroLabel;
    private javax.swing.JPanel availabilityPanel;
    private javax.swing.JScrollPane availabilityScrollPane;
    private javax.swing.JTable availabilityTable;
    private javax.swing.JButton loginInfoCancelButton;
    private javax.swing.JDialog loginInfoDialog;
    private javax.swing.JLabel loginInfoIntro2Label;
    private javax.swing.JLabel loginInfoIntroLabel;
    private javax.swing.JButton loginInfoOKButton;
    private javax.swing.JPanel loginInfoPanel;
    private javax.swing.JLabel loginInfoPasswordLabel;
    private javax.swing.JTextField loginInfoPasswordTextField;
    private javax.swing.JLabel loginInfoUsernameLabel;
    private javax.swing.JTextField loginInfoUsernameTextField;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JPanel matchStatsPanel;
    private javax.swing.JLabel profileCityLabel;
    private javax.swing.JTextField profileCityTextField;
    private javax.swing.JLabel profileGenderLabel;
    private javax.swing.JTextField profileGenderTextField;
    private javax.swing.JLabel profileHousenumberLabel;
    private javax.swing.JTextField profileHousenumberTextField;
    private javax.swing.JButton profileLoginInfoButton;
    private javax.swing.JButton profileLogoffLabel;
    private javax.swing.JLabel profileNameLabel;
    private javax.swing.JTextField profileNameTextField;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JLabel profilePhonenumberLabel;
    private javax.swing.JTextField profilePhonenumberTextField;
    private javax.swing.JButton profileSaveButton;
    private javax.swing.JLabel profileStreetLabel;
    private javax.swing.JTextField profileStreetTextField;
    private javax.swing.JLabel profileTeamLabel;
    private javax.swing.JTextField profileTeamTextField;
    private javax.swing.JLabel profileZipcodeLabel;
    private javax.swing.JTextField profileZipcodeTextField;
    private javax.swing.JLabel soccerAssociationCityLabel;
    private javax.swing.JTextField soccerAssociationCityTextField;
    private javax.swing.JLabel soccerAssociationHousenumberLabel;
    private javax.swing.JTextField soccerAssociationHousenumberTextField;
    private javax.swing.JLabel soccerAssociationNameLabel;
    private javax.swing.JTextField soccerAssociationNameTextField;
    private javax.swing.JPanel soccerAssociationPanel;
    private javax.swing.JLabel soccerAssociationPhonenumberLabel;
    private javax.swing.JLabel soccerAssociationStreetLabel;
    private javax.swing.JTextField soccerAssociationStreetTextField;
    private javax.swing.JLabel soccerAssociationZipcodeLabel;
    private javax.swing.JTextField soccerAssociationZipcodeTextField;
    private javax.swing.JPanel teamPanel;
    private javax.swing.JLabel welcomeTextLabel;
    // End of variables declaration//GEN-END:variables

    public void setVisibility() {
        if(this.getSTC().userIsPlayer()){
            if(this.getSTC().userIsCaptain()){
                this.setVisibilityCaptain();
            } else {
                this.setVisibilityPlayer();
            }
        } else if(this.getSTC().userIsCoach()){
            this.setVisibilityCoach();
        }
        this.setVisible(true);
    }
    
    private void setVisibilityPlayer(){
        this.setProfilePanel(true);
        this.setSoccerAssociationPanel(true);
        this.setAvailabilityPanel(true);
        this.setMatchStatisticsPanel(false);
        this.setTeamPanel(false);
        
    }
    
    private void setVisibilityCaptain(){
        this.setProfilePanel(true);
        this.setSoccerAssociationPanel(true);
        this.setAvailabilityPanel(true);
        this.setMatchStatisticsPanel(true);
        this.setTeamPanel(false);
        
    }
    
    private void setVisibilityCoach(){
        this.setProfilePanel(true);
        this.setSoccerAssociationPanel(true);
        this.setAvailabilityPanel(false);
        this.setMatchStatisticsPanel(true);
        this.setTeamPanel(true);
        
    }

    private void setProfilePanel(boolean accessAllowed) {
        if(accessAllowed){
            this.profileTeamTextField.setText(this.getSTC().getTeamUser());
            this.profileNameTextField.setText(this.getSTC().getNameUser());
            this.profileGenderTextField.setText(this.getSTC().getGenderUser());
            this.profileStreetTextField.setText(this.getSTC().getStreetUser());
            this.profileHousenumberTextField.setText(this.getSTC().getHousenumberUser());
            this.profileZipcodeTextField.setText(this.getSTC().getZipcodeUser());
            this.profileCityTextField.setText(this.getSTC().getCityUser());
            this.profilePhonenumberTextField.setText(this.getSTC().getPhonenumberUser());
        } else {
            this.mainTabbedPane.remove(this.profilePanel);
        }
    }

    private void setSoccerAssociationPanel(boolean accessAllowed) {
        if(accessAllowed){
            this.soccerAssociationNameTextField.setText(this.getSTC().getNameSA());
            this.soccerAssociationStreetTextField.setText(this.getSTC().getStreetSA());
            this.soccerAssociationHousenumberTextField.setText(this.getSTC().getHousenumberSA());
            this.soccerAssociationZipcodeTextField.setText(this.getSTC().getZipcodeSA());
            this.soccerAssociationCityTextField.setText(this.getSTC().getCitySA());
            this.SoccerAssociationPhonenumberTextField.setText(this.getSTC().getPhonenumberSA());
        } else {
            this.mainTabbedPane.remove(this.soccerAssociationPanel);
        }
    }

    private void setAvailabilityPanel(boolean accessAllowed) {
        if(accessAllowed){
            //TODO get and set availability of user
        } else {
            this.mainTabbedPane.remove(this.availabilityPanel);
        }
    }

    private void setMatchStatisticsPanel(boolean accessAllowed) {
        if (accessAllowed) {
            //TODO not sure yet if something needs to be done.
        } else {
            this.mainTabbedPane.remove(this.matchStatsPanel);
        }
    }

    private void setTeamPanel(boolean accessAllowed) {
        if (accessAllowed) {
            //TODO not sure yet if something needs to be done.
        } else {
            this.mainTabbedPane.remove(this.teamPanel);
        }
    }
}
