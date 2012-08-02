/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

import soccerTeam.control.User;

/**
 *
 * @author Arianne
 */
public class Player implements User{
    
        private ContactInfo contactInfo;
        private LoginInfo loginInfo;
    	private SuspentionInfo suspentionInfo;
        private boolean goalkeeper;
        private boolean captain;
	
	//Constructors
	/**
	 * Class Constructor 
	 * 
	 * @param name
	 * @param gender
	 * @param street
	 * @param housenumber
	 * @param zipcode
	 * @param city
	 * @param phonenumber
	 */
	public Player(String name, boolean gender, String street, String housenumber, String zipcode,
						   String city, String phonenumber){
		this.contactInfo = new ContactInfo(name, gender, street, housenumber, zipcode, city, phonenumber);
                this.setGoalkeeper(false);
                this.setCaptain(false);
                this.suspentionInfo = new SuspentionInfo();
	}
	
	//Getters
	private SuspentionInfo getSuspentionInfo(){ //aan suspended moeten andere vragen gesteld worden.
		return this.suspentionInfo;
	}
        
        private LoginInfo getLoginInfo(){
            return this.loginInfo;
        }
	
        private boolean getGoalkeeper(){
            return this.goalkeeper;
        }
        
        private boolean getCaptain(){
            return this.captain;
        }
        
        public String getName(){
            return this.contactInfo.getName();
        }

        public boolean getGender(){
            return this.contactInfo.getGender();
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

        public void setGender(boolean gender) {
            this.contactInfo.setGender(gender);
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
        
	private void setGoalkeeper(boolean goalkeeper){
            this.goalkeeper = goalkeeper;
        }
        
        private void setCaptain(boolean captain){
            this.captain = captain;
        }
	
	//Methods
	public boolean isCaptain(){
            return this.getCaptain();
        }
        
        public boolean isGoalkeeper(){
            return this.getGoalkeeper();
        }
        
        public void assignToCaptain(){
            this.setCaptain(true);
        }
        
        public void dismissFromCaptain(){
            this.setCaptain(false);
        }
        
        public void assignToGoalkeeper(){
            this.setGoalkeeper(true);
        }
        
        public void dismissFromGoalkeeper(){
            this.setGoalkeeper(false);
        }
        
        public void changeLoginInfo(String newUsername, String newPassword){
            this.getLoginInfo().setUsername(newUsername);
            this.getLoginInfo().setPassword(newPassword);
        }
        
        public String getUsername(){
            return this.getLoginInfo().getUsername();
        }
        
        public String getPassword(){
            return this.getLoginInfo().getPassword();
        }        

        @Override
        public User getUser() {
            return this;
        }

}
