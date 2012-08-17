/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.ComboBoxModel;
import soccerTeam.logic.data.*;
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
        return this.getUser().getGender();
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

    public String[] createPlayer(Object team, String playerName, boolean playerGender, 
                String playerStreet, String playerHousenumber, String playerZipcode, 
                String playerCity, String playerPhonenumber) {
        Player player = new Player(playerName, playerGender, playerStreet,
                playerHousenumber, playerZipcode, playerCity, playerPhonenumber);
        if (team instanceof Team){
            ((Team)team).addPlayerToTeam(player);
            String[] loginInfo = {player.getUsername(), player.getPassword()}; 
            return loginInfo;
        } else {
            throw new IllegalArgumentException("The new players team is not a Team.");
        }
    }

    public Object[] getDisplayableMatches(Object team) {
        if (team instanceof Team){
            return ((Team)team).getDisplayableMatches();
        } else {
            throw new IllegalArgumentException("The given team was not a Team.");
        }
    }

    public Object[] getAvailablePlayers(Object match) {
        if(match instanceof Match){
            return ((Match)match).displayAvailablePlayers();
        } else {
            throw new IllegalArgumentException("The given match was not a Match.");
        }
    }

    public void setAvailable(Object match, Object player) {
        if(player instanceof Player){
            if(match instanceof Match){
                ((Match)match).setAvailable((Player)player);
            } else {
                throw new IllegalArgumentException("The given match was not a Match");
            }
        } else {
            throw new IllegalArgumentException("The given player was not a Player");
        }
    }
    
    public void setUnavailable(Object match, Object player){
        if(player instanceof Player){
            if(match instanceof Match){
                ((Match)match).setUnavailable((Player)player);
            } else {
                throw new IllegalArgumentException("The given match was not a Match");
            }
        } else {
            throw new IllegalArgumentException("The given player was not a Player");
        }
    }

    public Object[] getAllPlayers(Object team) {
        if(team instanceof Team){
            return ((Team)team).getAllPlayers();
        } else {
            throw new IllegalArgumentException("The given team is not a Team.");
        }
    }

    public void assignCaptain(Object team, Object player) {
        if (player instanceof Player){
            if (team instanceof Team){
                ((Team)team).assignCaptain((Player)player);
            } else {
                throw new IllegalArgumentException("The given team is not a Team.");
            }
        } else {
            throw new IllegalArgumentException("The given team is not a Team.");
        }
    }

    public Object[] getNonGoalkeepers(Object team) {
        if(team instanceof Team){
            return ((Team)team).getNonGoalkeepers();
        } else {
            throw new IllegalArgumentException("The given team is not a Team.");
        }
        
    }

    public void assignGoalkeeper(Object player) {
        if(player instanceof Player){
            ((Player)player).assignToGoalkeeper();
        } else {
            throw new IllegalArgumentException("The given player is not a Player.");
        }
    }

    public Object[] getGoalkeepers(Object team) {
        if(team instanceof Team){
            return ((Team)team).getGoalkeepers();
        } else {
            throw new IllegalArgumentException("The given team is not a Team.");
        }
    }

    public void dismissGoalkeeper(Object player) {
        if(player instanceof Player){
            ((Player)player).dismissFromGoalkeeper();
        } else {
            throw new IllegalArgumentException("The given player was not a Player");
        }
    }

    public void addMatchToTeam(Object team, int day, int month, int year, int hour, int minutes, String opponents, String location) {
        if(team instanceof Team){
            if (!this.checkDate(day, month, year) && !this.checkTime(hour, minutes)){
                throw new IllegalArgumentException();
            } else {
                ((Team)team).addMatch((Team)team, day, month, year, hour, minutes, opponents, location);
            }
        } else {
            throw new IllegalArgumentException("The given team was not a Team.");
        }
    }
    
    private boolean checkDate(int day, int month, int year){
        if(month > 12 || month < 0){
            return false;
        } else if (day < 0){
            return false;
        } else if( (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                && day > 31){
            return false;
        } else if( (month == 4 || month == 6 || month == 9 || month == 11) && day > 30){
            return false;
        } else if (month == 2 && day > 28){
            if(day == 28 && year%4 == 0 && (year%400 == 0 || year%100 != 0)) {
                return true;
            } else {
                return false; 
            }
        } else {
            return true;
        }
    }

    private boolean checkTime(int hour, int minutes) {
        if ( hour < 0 || hour > 23){
            return false;
        } else if ( minutes < 0 || minutes > 59){
            return false;
        } else {
            return true;
        }
    }

    public Object[] getMatchStatistics(Object match) {
        if (match instanceof Match){
            return ((Match)match).getMatchStatistics();
        } else {
            throw new IllegalArgumentException("Given match was nog a Match.");
        }
    }

    public Object[] getTeamsUser() {
        if( this.userIsPlayer()){
            return this.getSA().getTeamsPlayer((Player)this.getUser());
        } else if (this.userIsCoach()) {
            return this.getSA().getTeamsCoach((Coach)this.getUser());
        } else {
            throw new IllegalArgumentException("The user is not a Player");
        }
    }

    public Object[] getAvaialableMatches(Object team) {
        if ( this.userIsPlayer() ){
            if(team instanceof Team){
                return ((Team)team).getAvailabilityPlayer((Player)this.getUser());
            } else {
                throw new IllegalArgumentException("The given team is not a Team.");
            }
        } else {
            throw new IllegalArgumentException("The user is not a Player.");
        }
    }

    public boolean containsGoalkeeper(List selection) {
        boolean contains = false;
        for(Iterator<Object> it = selection.iterator(); it.hasNext();){
            Object o = it.next();
            if(o instanceof Player){
                if(((Player)o).isGoalkeeper()){
                    contains = true;
                }
            } else {
                throw new IllegalArgumentException("Not all elements in selection are Players.");
            }
        }
        return contains;
    }

    public void setMatchTeam(Object match, List selection) {
        if(match instanceof Match){
            ((Match)match).setMatchTeam(new ArrayList(selection));
        } else {
            throw new IllegalArgumentException("Given match is not a Match.");
        }
    }

}
