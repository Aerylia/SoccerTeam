/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic;

import soccerTeam.logic.data.Coach;
import soccerTeam.logic.data.Player;
import soccerTeam.logic.data.SoccerAssociation;

/**
 *
 * @author Arianne
 */
public class SoccerTeamModel{
    
    private SoccerAssociation sa;
    
    public SoccerTeamModel(String name, String street, String housenumber, String zipcode, 
                                                                String city, String phonenumber){
        this.sa = new SoccerAssociation(name, street, housenumber, zipcode, city, phonenumber);
    }
    
    private SoccerAssociation getSA(){
        return this.sa;
    }
    
    public Player getPlayer(String username, String password){
        return this.getSA().getPlayer(username, password);
    }
    
    public Coach getCoach(String username, String password){
        return this.getSA().getCoach(username, password);
    }
}
