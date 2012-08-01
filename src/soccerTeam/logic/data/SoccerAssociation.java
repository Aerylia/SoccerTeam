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
        public String getName(){
            return this.contactInfo.getName();
        }
        
        public String getStreet(){
            return this.contactInfo.getStreet();
        }

        public String getHousenumber(){
            return this.contactInfo.getHousenumber();
        }

        public String getZipcode(){
            return this.contactInfo.getZipcode();
        }
        
        public String getCity(){
            return this.contactInfo.getCity();
        }

        public String getPhonenumber(){
            return this.contactInfo.getPhonenumber();
        }
        
	//Setters
        public void setName(String name) {
            this.contactInfo.setName(name);
        }

        public void setStreet(String street) {
            this.contactInfo.setStreet(street);
        }

        public void setHousenumber(String housenumber) {
            this.contactInfo.setHousenumber(housenumber);
        }

        public void setZipcode(String zipcode) {
            this.contactInfo.setZipcode(zipcode);
        }

        public void setCity(String city) {
            this.contactInfo.setCity(city);
        }

        public void setPhonenumber(String phonenumber) {
            this.contactInfo.setPhonenumber(phonenumber);
        }
        
	
}
