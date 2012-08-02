/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

import java.util.ArrayList;

/**
 *
 * @author Arianne
 */
public class SoccerAssociation {
    
        private ContactInfo contactInfo;
        private ArrayList<Team> teams;
        
        public SoccerAssociation(String name, String street, String housenumber, String zipcode, 
                                                                String city, String phonenumber){
            this.contactInfo = new ContactInfo(name, false, street, housenumber, zipcode, city, phonenumber);
            this.teams = new ArrayList();
        }
        //Getters
        private ContactInfo getContactInfo(){
            return this.contactInfo;
        }
        
        public String getSAName(){
            return this.getContactInfo().getName();
        }
        
        public String getSAStreet(){
            return this.getContactInfo().getStreet();
        }

        public String getSAHousenumber(){
            return this.getContactInfo().getHousenumber();
        }

        public String getSAZipcode(){
            return this.getContactInfo().getZipcode();
        }
        
        public String getSACity(){
            return this.getContactInfo().getCity();
        }

        public String getSAPhonenumber(){
            return this.getContactInfo().getPhonenumber();
        }
        
        private ArrayList<Team> getTeams(){
            return this.teams;
        }
        
	//Setters
        public void setSAName(String name) {
            this.contactInfo.setName(name);
        }

        public void setSAStreet(String street) {
            this.contactInfo.setStreet(street);
        }

        public void setSAHousenumber(String housenumber) {
            this.contactInfo.setHousenumber(housenumber);
        }

        public void setSAZipcode(String zipcode) {
            this.contactInfo.setZipcode(zipcode);
        }

        public void setSACity(String city) {
            this.contactInfo.setCity(city);
        }

        public void setSAPhonenumber(String phonenumber) {
            this.contactInfo.setPhonenumber(phonenumber);
        }
        
        public Player getPlayer(String username, String password){
            Player player = null;
            for(Team team: this.getTeams()){
                int index = team.containsPlayer(username, password);
                if(index != -1){
                    return team.getPlayer(index);
                }
            }
            return player;
        }
        
        public Coach getCoach(String username, String password){
            for(Team team: this.getTeams()){
                int index = team.containsCoach(username, password);
                if(index != -1){
                    return team.getCoach(index);
                }
            }
            return null;
        }
	
}
