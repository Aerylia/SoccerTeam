/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.control;

import java.io.FileNotFoundException;
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
        try{
            DataManager.load(filename);
            this.loginUI = new LoginUI(this);
            this.loginUI.setVisible(true);
        } catch (FileNotFoundException ex){ 
            this.setupUI = new FirstTimeSetupUI(this);
            setupUI.setVisible(true);
        }
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
        DataManager.save(filename);
        this.exit();
    }
    
    public void exit(){
        System.exit(-1);
    }
}