/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.view;

import javax.swing.JOptionPane;
import soccerTeam.control.SoccerTeamController;
import soccerTeam.logic.exceptions.NoGenderException;

/**
 *
 * @author Arianne
 */
public class FirstTimeSetupUI extends javax.swing.JFrame {

    private SoccerTeamController stc;
    
    /**
     * Creates new form FirstTimeSetupUI
     */
    public FirstTimeSetupUI(SoccerTeamController stc) {
        this.stc = stc;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setupPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        textLabel = new javax.swing.JLabel();
        soccerAssociationLabel = new javax.swing.JLabel();
        asociationNameLabel = new javax.swing.JLabel();
        associationStreetLabel = new javax.swing.JLabel();
        associationNameField = new javax.swing.JTextField();
        associationStreetField = new javax.swing.JTextField();
        associationHousenumberLabel = new javax.swing.JLabel();
        associationHousenumberField = new javax.swing.JTextField();
        associationcityField = new javax.swing.JTextField();
        associationZipcodeField = new javax.swing.JTextField();
        associationCityLabel = new javax.swing.JLabel();
        associationZipcodeLabel = new javax.swing.JLabel();
        setupFinishButton = new javax.swing.JButton();
        associationExitButton = new javax.swing.JButton();
        soccerTeamLabel = new javax.swing.JLabel();
        soccerTeamNameLabel = new javax.swing.JLabel();
        teamNameField = new javax.swing.JTextField();
        coachLabel = new javax.swing.JLabel();
        coachNameLabel = new javax.swing.JLabel();
        coachNameField = new javax.swing.JTextField();
        coachGenderLabel = new javax.swing.JLabel();
        coachMaleRadioButton = new javax.swing.JRadioButton();
        coachFemaleRadioButton = new javax.swing.JRadioButton();
        coachStreetLabel = new javax.swing.JLabel();
        coachHousenumberLabel = new javax.swing.JLabel();
        coachHousenumberField = new javax.swing.JTextField();
        coachCityField = new javax.swing.JTextField();
        coachCityLabel = new javax.swing.JLabel();
        coachZipcodeField = new javax.swing.JTextField();
        coachZipcodeLabel = new javax.swing.JLabel();
        coachPhonenumberLabel = new javax.swing.JLabel();
        coachPhonenumberField = new javax.swing.JTextField();
        coachCheckBox = new javax.swing.JCheckBox();
        coachStreetField = new javax.swing.JTextField();
        associationPhonenumberLabel = new javax.swing.JLabel();
        associationPhonenumberField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("First Time Setup");

        welcomeLabel.setText("Welcome to \"Program name\". ");

        textLabel.setText("Please enter the required information below to setup this program.");

        soccerAssociationLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        soccerAssociationLabel.setText("Soccer Association :");

        asociationNameLabel.setText("Association Name :");

        associationStreetLabel.setText("Street :");

        associationStreetField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                associationStreetFieldActionPerformed(evt);
            }
        });

        associationHousenumberLabel.setText("Housenr. :");

        associationcityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                associationcityFieldActionPerformed(evt);
            }
        });

        associationCityLabel.setText("City :");

        associationZipcodeLabel.setText("Zipcode :");

        setupFinishButton.setText("Finish");
        setupFinishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setupFinishButtonActionPerformed(evt);
            }
        });

        associationExitButton.setText("Cancel");
        associationExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                associationExitButtonActionPerformed(evt);
            }
        });

        soccerTeamLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        soccerTeamLabel.setText("Soccer Team :");

        soccerTeamNameLabel.setText("Team Name :");

        coachLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        coachLabel.setText("Coach :");

        coachNameLabel.setText("Name :");

        coachGenderLabel.setText("Gender : ");

        coachMaleRadioButton.setText("Male");
        coachMaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachMaleRadioButtonActionPerformed(evt);
            }
        });

        coachFemaleRadioButton.setText("Female");
        coachFemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachFemaleRadioButtonActionPerformed(evt);
            }
        });

        coachStreetLabel.setText("Street :");

        coachHousenumberLabel.setText("Housenr. :");

        coachCityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachCityFieldActionPerformed(evt);
            }
        });

        coachCityLabel.setText("City :");

        coachZipcodeLabel.setText("Zipcode :");

        coachPhonenumberLabel.setText("Phonenumber :");

        coachCheckBox.setText("Yes, I am the coach of this soccerteam of this soccer association.");
        coachCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachCheckBoxActionPerformed(evt);
            }
        });

        coachStreetField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachStreetFieldActionPerformed(evt);
            }
        });

        associationPhonenumberLabel.setText("Phonenumber :");

        javax.swing.GroupLayout setupPanelLayout = new javax.swing.GroupLayout(setupPanel);
        setupPanel.setLayout(setupPanelLayout);
        setupPanelLayout.setHorizontalGroup(
            setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setupPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(setupFinishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(associationExitButton))
                    .addGroup(setupPanelLayout.createSequentialGroup()
                        .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coachStreetLabel)
                            .addComponent(textLabel)
                            .addComponent(coachGenderLabel)
                            .addComponent(coachZipcodeLabel)
                            .addComponent(coachPhonenumberLabel)
                            .addComponent(coachCheckBox)
                            .addComponent(coachLabel)
                            .addComponent(soccerAssociationLabel)
                            .addComponent(welcomeLabel)
                            .addComponent(soccerTeamLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(setupPanelLayout.createSequentialGroup()
                        .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(associationStreetLabel)
                            .addComponent(associationZipcodeLabel)
                            .addComponent(coachNameLabel)
                            .addComponent(asociationNameLabel)
                            .addComponent(soccerTeamNameLabel)
                            .addComponent(associationPhonenumberLabel))
                        .addGap(21, 21, 21)
                        .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(associationPhonenumberField)
                            .addComponent(associationNameField)
                            .addGroup(setupPanelLayout.createSequentialGroup()
                                .addComponent(associationStreetField, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(associationHousenumberLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(associationHousenumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(teamNameField)
                            .addComponent(coachPhonenumberField)
                            .addComponent(coachNameField)
                            .addGroup(setupPanelLayout.createSequentialGroup()
                                .addComponent(coachZipcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coachCityLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coachCityField))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setupPanelLayout.createSequentialGroup()
                                .addComponent(coachStreetField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coachHousenumberLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coachHousenumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(setupPanelLayout.createSequentialGroup()
                                .addComponent(coachFemaleRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(coachMaleRadioButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(setupPanelLayout.createSequentialGroup()
                                .addComponent(associationZipcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(associationCityLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(associationcityField)))))
                .addContainerGap())
        );
        setupPanelLayout.setVerticalGroup(
            setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textLabel)
                .addGap(18, 18, 18)
                .addComponent(soccerAssociationLabel)
                .addGap(18, 18, 18)
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asociationNameLabel)
                    .addComponent(associationNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(associationHousenumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(associationStreetLabel)
                    .addComponent(associationStreetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(associationHousenumberLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(associationZipcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(associationZipcodeLabel)
                    .addComponent(associationcityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(associationCityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(associationPhonenumberLabel)
                    .addComponent(associationPhonenumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(soccerTeamLabel)
                .addGap(18, 18, 18)
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soccerTeamNameLabel)
                    .addComponent(teamNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coachLabel)
                .addGap(18, 18, 18)
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coachNameLabel)
                    .addComponent(coachNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coachGenderLabel)
                    .addComponent(coachFemaleRadioButton)
                    .addComponent(coachMaleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coachStreetLabel)
                    .addComponent(coachHousenumberLabel)
                    .addComponent(coachStreetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coachHousenumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coachZipcodeLabel)
                    .addComponent(coachZipcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coachCityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coachCityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coachPhonenumberLabel)
                    .addComponent(coachPhonenumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(coachCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(associationExitButton)
                    .addComponent(setupFinishButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(setupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void associationcityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_associationcityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_associationcityFieldActionPerformed

    private void associationStreetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_associationStreetFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_associationStreetFieldActionPerformed

    private void setupFinishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setupFinishButtonActionPerformed
        String associationName = this.associationNameField.getText();
        String associationStreet = this.associationStreetField.getText();
        String associationHousenumber = this.associationHousenumberField.getText();
        String associationZipcode = this.associationZipcodeField.getText();
        String associationCity = this.associationcityField.getText();
        String associationPhonenumber = this.associationPhonenumberField.getText();
        
        String teamName = this.teamNameField.getText();
        
        String coachName = this.coachNameField.getText();
        boolean coachGender;
        String coachStreet = this.coachStreetField.getText();
        String coachHousenumber = this.coachHousenumberField.getText();
        String coachZipcode = this.coachZipcodeField.getText();
        String coachCity = this.coachCityField.getText();
        String coachPhonenumber = this.coachPhonenumberField.getText();
        
        boolean isCoach = this.coachCheckBox.isSelected(); //has to be true
  
        if(!this.coachFemaleRadioButton.isSelected() && !this.coachMaleRadioButton.isSelected()){
            this.popup("Please enter the coaches gender.");
        } else if(associationName.isEmpty()){
            this.popup("Please enter association name.");
        } else if(associationStreet.isEmpty()){
            this.popup("Please enter association street.");
        } else if(associationHousenumber.isEmpty()){
            this.popup("Please enter association housenumber.");
        } else if(associationZipcode.isEmpty()){
            this.popup("Please enter association zipcode.");
        } else if(associationCity.isEmpty()){
            this.popup("Please enter association city.");
        } else if(associationPhonenumber.isEmpty()){
            this.popup("Please enter association phonenumber.");
        } else if(teamName.isEmpty()){
            this.popup("Please enter a team name");
        } else if(coachName.isEmpty()){
            this.popup("Please enter the coaches name.");
        } else if(coachStreet.isEmpty()){
            this.popup("Please enter the coaches street.");
        } else if(coachHousenumber.isEmpty()){
            this.popup("Please enter the coaches housenumber.");
        } else if(coachZipcode.isEmpty()){
            this.popup("Please enter the coaches zipcode.");
        } else if(coachCity.isEmpty()){
            this.popup("Please enter the coaches city.");
        } else if(coachPhonenumber.isEmpty()){
            this.popup("Please enter the coaches phonenumber.");
        } else if(!isCoach){
            this.popup("You must be a coach to setup this program.");
        } else {
            coachGender = this.coachMaleRadioButton.isSelected(); //true is male, false is female.
            this.stc.createModel(associationName, associationStreet, associationHousenumber, 
                    associationZipcode, associationCity, associationPhonenumber, teamName,
                    coachName, coachGender, coachStreet, coachHousenumber, coachZipcode,
                    coachCity, coachPhonenumber);
        }
    }//GEN-LAST:event_setupFinishButtonActionPerformed

    private void coachStreetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachStreetFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coachStreetFieldActionPerformed

    private void coachCityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachCityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coachCityFieldActionPerformed

    private void coachCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coachCheckBoxActionPerformed

    private void associationExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_associationExitButtonActionPerformed
        this.stc.exit(this);
    }//GEN-LAST:event_associationExitButtonActionPerformed

    public void popup(String message){
        JOptionPane.showMessageDialog(this, message);
    }
    
    private void coachFemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachFemaleRadioButtonActionPerformed
        this.coachMaleRadioButton.setSelected(false);
    }//GEN-LAST:event_coachFemaleRadioButtonActionPerformed

    private void coachMaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachMaleRadioButtonActionPerformed
        this.coachFemaleRadioButton.setSelected(false);
    }//GEN-LAST:event_coachMaleRadioButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asociationNameLabel;
    private javax.swing.JLabel associationCityLabel;
    private javax.swing.JButton associationExitButton;
    private javax.swing.JTextField associationHousenumberField;
    private javax.swing.JLabel associationHousenumberLabel;
    private javax.swing.JTextField associationNameField;
    private javax.swing.JTextField associationPhonenumberField;
    private javax.swing.JLabel associationPhonenumberLabel;
    private javax.swing.JTextField associationStreetField;
    private javax.swing.JLabel associationStreetLabel;
    private javax.swing.JTextField associationZipcodeField;
    private javax.swing.JLabel associationZipcodeLabel;
    private javax.swing.JTextField associationcityField;
    private javax.swing.JCheckBox coachCheckBox;
    private javax.swing.JTextField coachCityField;
    private javax.swing.JLabel coachCityLabel;
    private javax.swing.JRadioButton coachFemaleRadioButton;
    private javax.swing.JLabel coachGenderLabel;
    private javax.swing.JTextField coachHousenumberField;
    private javax.swing.JLabel coachHousenumberLabel;
    private javax.swing.JLabel coachLabel;
    private javax.swing.JRadioButton coachMaleRadioButton;
    private javax.swing.JTextField coachNameField;
    private javax.swing.JLabel coachNameLabel;
    private javax.swing.JTextField coachPhonenumberField;
    private javax.swing.JLabel coachPhonenumberLabel;
    private javax.swing.JTextField coachStreetField;
    private javax.swing.JLabel coachStreetLabel;
    private javax.swing.JTextField coachZipcodeField;
    private javax.swing.JLabel coachZipcodeLabel;
    private javax.swing.JButton setupFinishButton;
    private javax.swing.JPanel setupPanel;
    private javax.swing.JLabel soccerAssociationLabel;
    private javax.swing.JLabel soccerTeamLabel;
    private javax.swing.JLabel soccerTeamNameLabel;
    private javax.swing.JTextField teamNameField;
    private javax.swing.JLabel textLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

}
