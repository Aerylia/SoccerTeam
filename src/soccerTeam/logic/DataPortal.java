/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic;

import soccerTeam.logic.data.Coach;
import soccerTeam.logic.data.Player;
import soccerTeam.logic.data.SoccerAssociation;
import soccerTeam.logic.data.User;
import soccerTeam.logic.exceptions.LoginFailtException;

/**
 *
 * @author Arianne
 */
public class DataPortal{
    
    private SoccerAssociation sa;
    private User user;

    public DataPortal(String associationName, String associationStreet, String associationHousenumber, 
            String associationZipcode, String associationCity, String associationPhonenumber, String teamName, 
            String coachName, boolean coachGender, String coachStreet, String coachHousenumber, String coachZipcode, 
            String coachCity, String coachPhonenumber) {
        this.sa = new SoccerAssociation(associationName, associationStreet, associationHousenumber,
                associationZipcode, associationCity, associationPhonenumber);
        this.user = new Coach(coachName, coachGender, coachStreet, coachHousenumber, coachZipcode,
                coachCity, coachPhonenumber);
        this.sa.addTeam(teamName, (Coach)this.user);
    }
    
    private SoccerAssociation getSA(){
        return this.sa;
    }
    
    private User getUser(){
        return this.user;
    }
    
    private void setUser(User user){
        this.user = user;
    }
    
    public void findUser(String username, String password) throws LoginFailtException{
        User user = this.getCoach(username, password);
        if(user == null){
            user = this.getPlayer(username, password);
            if(user == null){
                throw new LoginFailtException(username, password);
            }
        }
        this.setUser(user);
    }
    
    public Player getPlayer(String username, String password){
        return this.getSA().getPlayer(username, password);
    }
    
    public Coach getCoach(String username, String password){
        return this.getSA().getCoach(username, password);
    }
    
    public boolean userIsPlayer(){
        return this.getUser() instanceof Player;
    }
    
    public boolean userIsCoach(){
        return this.getUser() instanceof Coach;
    }
    
    public boolean userIsCaptain(){
        if(this.userIsPlayer()){
            Player player = (Player)this.getUser();
            return player.isCaptain();
        } else {
            return false;
        }
    }
    
    public boolean userIsGoalkeeper(){
        if(this.userIsPlayer()){
            Player player = (Player)this.getUser();
            return player.isGoalkeeper();
        } else {
            return false;
        }
    }

    public String getNameUser() {
        return this.getUser().getName();
    }

    public String getGenderUser() {
        if(this.getUser().getGender()){
            return "male";
        } else {
            return "female";
        }
    }

    public String getStreetUser() {
        return this.getUser().getStreet();
    }

    public String getHousenumberUser() {
        return this.getUser().getHousenumber();
    }

    public String getZipcodeUser() {
        return this.getUser().getZipcode();
    }

    public String getCityUser() {
        return this.getUser().getCity();
    }

    public String getPhonenumberUser() {
        return this.getUser().getPhonenumber();
    }

    public String getTeamUser() {
        if(this.getUser() instanceof Coach){
            return this.getSA().getTeam((Coach)this.getUser());
        } else {
            return this.getSA().getTeam((Player)this.getUser());
        }
    }

    public String getNameSA() {
        return this.getSA().getSAName();
    }

    public String getStreetSA() {
        return this.getSA().getSAStreet();
    }

    public String getHousenumberSA() {
        return this.getSA().getSAHousenumber();
    }

    public String getZipcodeSA() {
        return this.getSA().getSAZipcode();
    }

    public String getCitySA() {
        return this.getSA().getSACity();
    }

    public String getPhonenumberSA() {
        return this.getSA().getSAPhonenumber();
    }

    public void logoff() {
        this.setUser(null);
    }

    public String getUsernameUser() {
        return this.getUser().getUsername();
    }

    public String getPasswordUser() {
        return this.getUser().getPassword();
    }

    public void changeLoginInfoUser(String username, String password) {
        this.getUser().changeLoginInfo(username, password);
    }

    public void changeNameUser(String name) {
        this.getUser().setName(name);
    }

    public void changeGenderUser(String gender) throws IllegalArgumentException {
        if(gender.equals("male") || gender.equals("Male")){
            this.getUser().setGender(true);
        } else if (gender.equals("female") || gender.equals("Female")) {
            this.getUser().setGender(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void changeStreetUser(String street) {
        this.getUser().setStreet(street);
    }

    public void changeHousenumberUser(String housenumber) {
        this.getUser().setHousenumber(housenumber);
    }

    public void changeZipcodeUser(String zipcode) {
        this.getUser().setZipcode(zipcode);
    }

    public void changeCityUser(String city) {
        this.getUser().setCity(city);
    }

    public void changePhonenumberUser(String phonenumber) {
        this.getUser().setPhonenumber(phonenumber);
    }

    public void changeNameSA(String name) {
        this.getSA().setSAName(name);
    }

    public void changeStreetSA(String street) {
        this.getSA().setSAStreet(street);
    }

    public void changeHousenumberSA(String housenumber) {
        this.getSA().setSAHousenumber(housenumber);
    }

    public void changeZipcodeSA(String zipcode) {
        this.getSA().setSAZipcode(zipcode);
    }

    public void changeCitySA(String city) {
        this.getSA().setSACity(city);
    }

    public void changePhonenumberSA(String phonenumber) {
        this.getSA().setSAPhonenumber(phonenumber);
    }

}
