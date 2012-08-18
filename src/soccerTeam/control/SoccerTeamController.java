/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.control;

import soccerTeam.logic.DataManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import javax.swing.JFrame;
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
    
    private String filename = "SavedData.ser";
    private DataPortal stm;
    private LoginUI loginUI;
    private FirstTimeSetupUI setupUI;
    private MainUI ui;
    
    public SoccerTeamController(){
        //TODO set stm and view etc.
     /*   try{
            DataManager.load(filename);
            //set bestaand stm.
            this.loginUI = new LoginUI(this);
            this.loginUI.setVisible(true);
        } catch (FileNotFoundException ex){ */
            this.setupUI = new FirstTimeSetupUI(this);
            setupUI.setVisible(true);
      /*  } catch (IOException e){
            //TODO do something
        } */
    }
    
    private DataPortal getSTM(){
        return this.stm;
    }
    
    private FirstTimeSetupUI getSetupUI(){
        return this.setupUI;
    }
    
    private LoginUI getLoginUI(){
        return this.loginUI;
    }
    
    private MainUI getUI(){
        return this.ui;
    }
    
    public void deleteAndExit(JFrame window){
        DataManager.delete(filename);
        this.exit(window);
    }
    
    public void saveAndExit(JFrame window){
        /*
        try {
            DataManager.save(filename);
        } catch (IOException ex) {
            //TODO
            Logger.getLogger(SoccerTeamController.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        this.exit(window);
    }
    
    public void exit(JFrame window){
        window.dispose();
    }
    
    public void login(String username, String password){
        try {
            this.getSTM().findUser(username, password);
            this.loginUI.dispose();
            this.ui = new MainUI(this, this.getNameUser());
            this.getUI().setVisibility();
        } catch (LoginFailtException ex) {
            this.getLoginUI().popup("Login failt.\nThe username and password "
                    + "combination is not know in our system. Please make sure you are submitted into this system.");
        }
    }

    public void createModel(String associationName, String associationStreet, String associationHousenumber, 
            String associationZipcode, String associationCity, String associationPhonenumber, String teamName, 
            String coachName, boolean coachGender, String coachStreet, String coachHousenumber, String coachZipcode, 
            String coachCity, String coachPhonenumber) {
        this.stm = new DataPortal(associationName, associationStreet, associationHousenumber,
                associationZipcode, associationCity, associationPhonenumber, teamName, coachName,
                coachGender, coachStreet, coachHousenumber, coachZipcode, coachCity, coachPhonenumber);
        this.exit(this.getSetupUI());
        this.startUpUI();
        this.getSetupUI().popup("Your username and passoword are set to :\n"
                + "Username : \t" + this.getUsernameUser() + "\nPassword : \t" + this.getPasswordUser());
    }
    
    private void startUpUI(){
        //TODO
        this.ui = new MainUI(this, this.getNameUser());
        this.getUI().setVisibility();
    }
    
    public String getNameUser(){
        return this.getSTM().getNameUser();
    }

    public String getGenderUser() {
        return this.getSTM().getGenderUser();
    }

    public String getStreetUser() {
        return this.getSTM().getStreetUser();
    }

    public String getHousenumberUser() {
        return this.getSTM().getHousenumberUser();
    }

    public String getZipcodeUser() {
        return this.getSTM().getZipcodeUser();
    }

    public String getCityUser() {
        return this.getSTM().getCityUser();
    }

    public String getPhonenumberUser() {
        return this.getSTM().getPhonenumberUser();
    }

    public boolean userIsPlayer() {
        return this.getSTM().userIsPlayer();
    }

    public boolean userIsCoach() {
        return this.getSTM().userIsCoach();
    }

    public boolean userIsCaptain() {
        return this.getSTM().userIsCaptain();
    }

    public String getNameSA() {
        return this.getSTM().getNameSA();
    }

    public String getStreetSA() {
        return this.getSTM().getStreetSA();
    }

    public String getHousenumberSA() {
        return this.getSTM().getHousenumberSA();
    }

    public String getZipcodeSA() {
        return this.getSTM().getZipcodeSA();
    }

    public String getCitySA() {
        return this.getSTM().getCitySA();
    }

    public String getPhonenumberSA() {
        return this.getSTM().getPhonenumberSA();
    }

    public void logoff() {
        this.getSTM().logoff();
        this.getUI().dispose();
        this.loginUI = new LoginUI(this);
        this.getLoginUI().setVisible(true);
    }

    public String getUsernameUser() {
        return this.getSTM().getUsernameUser();
    }

    public String getPasswordUser() {
        return this.getSTM().getPasswordUser();
    }

    public void changeLoginInfoUser(String username, String password) {
        this.getSTM().changeLoginInfoUser(username, password);
    }

    public void changeNameUser(String name) {
        this.getSTM().changeNameUser(name);
    }

    public boolean changeGenderUser(String gender) {
        try{
            this.getSTM().changeGenderUser(gender);
            return true;
        } catch (IllegalArgumentException ex){
            this.getUI().popup( "Please enter \"male\" or \"female\" in the gender TextField.");
            return false;
        }
    }

    public void changeStreetUser(String street) {
        this.getSTM().changeStreetUser(street);
    }

    public void changeHousenumberUser(String housenumber) {
        this.getSTM().changeHousenumberUser(housenumber);
    }

    public void changeZipcodeUser(String zipcode) {
        this.getSTM().changeZipcodeUser(zipcode);
    }

    public void changeCityUser(String city) {
        this.getSTM().changeCityUser(city);
    }

    public void changePhonenumberUser(String phonenumber) {
        this.getSTM().changePhonenumberUser(phonenumber);
    }

    public void changeNameSA(String name) {
        this.getSTM().changeNameSA(name);
    }

    public void changeStreetSA(String street) {
        this.getSTM().changeStreetSA(street);
    }

    public void changeHousenumberSA(String housenumber) {
        this.getSTM().changeHousenumberSA(housenumber);
    }

    public void changeZipcodeSA(String zipcode) {
        this.getSTM().changeZipcodeSA(zipcode);
    }

    public void changeCitySA(String city) {
        this.getSTM().changeCitySA(city);
    }

    public void changePhonenumberSA(String phonenumber) {
        this.getSTM().changePhonenumberSA(phonenumber);
    }

    public Object[] getDisplayableTeams(){
        return this.getSTM().getTeamsUser();
    }

    public String[] createPlayer(Object team, String playerName, boolean playerGender, String playerStreet, 
            String playerHousenumber, String playerZipcode, String playerCity, String playerPhonenumber) {
        return this.getSTM().createPlayer(team, playerName, playerGender, playerStreet, playerHousenumber, 
                playerZipcode, playerCity, playerPhonenumber);
    }

    public Object[] getDisplayableMatches(Object team) {
        if(team != null){
            Object[] matches = this.getSTM().getDisplayableMatches(team);
            if(matches.length > 0){
                return matches;
            } else {
                return new Object[0];
            }
        } else {
            return new Object[0];
        }
    }
    
    public Object[] getAllPlayers(Object team){
        if(team != null){
            return this.getSTM().getAllPlayers(team); 
        } else {
            return new Object[0];
        }
    }
    
    public Object[] getAvailablePlayers(Object match){
        if(match != null){
            return this.getSTM().getAvailablePlayers(match);
        } else {
            return new Object[0];
        }
    }

    public void setAvailable(Object match, Object player) {
        this.getSTM().setAvailable(match, player);        
    }
    
    public void setUnavailable(Object match, Object player){
        this.getSTM().setUnavailable(match, player);
    }

    public void assignCaptain(Object team, Object player) {
        this.getSTM().assignCaptain(team, player);
    }
    
    public Object[] getNonGoalkeepers(Object team){
        if(team != null){
            return this.getSTM().getNonGoalkeepers(team);
        } else {
            return new Object[0];
        }
    }

    public void assignGoalkeeper(Object player) {
        this.getSTM().assignGoalkeeper(player);
    }
    
    public Object[] getGoalkeepers(Object team){
        if(team != null){
            return this.getSTM().getGoalkeepers(team);
        } else {
            return new Object[0];
        }
    }

    public void dismissGoalkeeper(Object player) {
        this.getSTM().dismissGoalkeeper(player);
    }

    public void addMatchToTeam(Object team, int day, int month, int year, int hour, int minutes, String opponents, String location) {
            this.getSTM().addMatchToTeam(team, day, month, year, hour, minutes, opponents, location);
    }
    
    public Object[] getMatchStatistics(Object match){
        if (match != null){
            return this.getSTM().getMatchStatistics(match);
        } else {
            return new Object[0];
        }
    }
    
    public Object[] getAvailableMatches(Object team){
        return this.getSTM().getAvaialableMatches(team);
    }

    public boolean containsGoalkeeper(List selection) {
        return this.getSTM().containsGoalkeeper(selection);
    }

    public void setMatchTeam(Object match, List selection) {
        this.getSTM().setMatchTeam(match, selection);
    }
    
    public boolean isUpcomming(Object match){
        if(match != null){
            return this.getSTM().isUpcomming(match);
        } else {
            return false;
        }
    }

    public String getDateMatch(Object match) {
        if(match != null){
            return this.getSTM().getDateMatch(match);
        } else {
            return new String();
        }
    }

    public String getTimeMatch(Object match) {
        if(match != null){
            return this.getSTM().getTimeMatch(match);
        } else {
            return new String();
        }
    }

    public String getOpponentsMatch(Object match) {
        if(match != null){
            return this.getSTM().getOpponentsMatch(match);
        } else {
            return new String();
        }
    }

    public String getLocationMatch(Object match) {
        if(match != null){
            return this.getSTM().getLocationMatch(match);
        } else {
            return new String();
        }
    }
    
    public Object[] getMatchTeam(Object match){
        if(match != null){
            return this.getSTM().getMatchTeam(match);
        } else {
            return new Object[0];
        }
    }

    public boolean getMatchForfeited(Object match) {
        if(match != null){
            return this.getSTM().getMatchForfeited(match);
        } else {
            return false;
        }
    }

    public int getMatchResult(Object match) {
        if(match != null){
            return this.getSTM().getMatchResult(match);
        } else {
            return 2;
        }
    }
}