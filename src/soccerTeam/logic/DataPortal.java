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
}
