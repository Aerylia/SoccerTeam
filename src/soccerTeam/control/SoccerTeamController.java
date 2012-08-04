/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.control;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import soccerTeam.logic.DataPortal;
import soccerTeam.logic.exceptions.LoginFailtException;
import soccerTeam.view.FirstTimeSetupUI;
import soccerTeam.view.LoginUI;
import soccerTeam.view.MainUI;

/**
 *
 * @author Arianne
 */
public class SoccerTeamController {
    
    private String filename = "SavedDate.ser";
    private DataPortal stm;
    private LoginUI loginUI;
    private FirstTimeSetupUI setupUI;
    private MainUI ui;
    
    public SoccerTeamController(){
        //TODO set stm and view etc.
     /*   try{
            DataManager.load(filename);
            this.loginUI = new LoginUI(this);
            this.loginUI.setVisible(true);
        } catch (FileNotFoundException ex){ */
            this.setupUI = new FirstTimeSetupUI(this);
            setupUI.setVisible(true);
      /*  } catch (IOException e){
            
        } */
    }
    
    private DataPortal getSTM(){
        return this.stm;
    }
    
    public void login(String username, String password){
        try {
            this.getSTM().findUser(username, password);
            this.loginUI.setVisible(false);
            this.ui = new MainUI(this);
            ui.setVisible(true);
        } catch (LoginFailtException ex) {
            JOptionPane.showMessageDialog(loginUI, "Login failt.\nThe username and password "
                    + "combination is not know in our system. Please make sure you are submitted to this system.");
        }
    }
    
    public void deleteAndExit(){
        DataManager.delete(filename);
        this.exit();
    }
    
    public void saveAndExit(){
        try {
            DataManager.save(filename);
        } catch (IOException ex) {
            //TODO
            Logger.getLogger(SoccerTeamController.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.exit();
    }
    
    public void exit(){
        System.exit(-1);
    }

    public void createModel(String associationName, String associationStreet, String associationHousenumber, 
            String associationZipcode, String associationCity, String associationPhonenumber, String teamName, 
            String coachName, boolean coachGender, String coachStreet, String coachHousenumber, String coachZipcode, 
            String coachCity, String coachPhonenumber) {
        this.stm = new DataPortal(associationName, associationStreet, associationHousenumber,
                associationZipcode, associationCity, associationPhonenumber, teamName, coachName,
                coachGender, coachStreet, coachHousenumber, coachZipcode, coachCity, coachPhonenumber);
        this.setupUI.setVisible(false);
        this.startUpUI();
    }
    
    private void startUpUI(){
        //TODO
        this.ui = new MainUI(this);
        this.ui.setVisible(true);
    }
}