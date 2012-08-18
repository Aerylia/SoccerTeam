/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

import soccerTeam.logic.exceptions.ToMuchYellowCardsException;

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
                this.loginInfo = new LoginInfo(name, phonenumber);
	}
	
	//Getters
	private SuspentionInfo getSuspentionInfo(){ //aan suspended moeten andere vragen gesteld worden.
		return this.suspentionInfo;
	}
        
        private ContactInfo getContactInfo(){
            return this.contactInfo;
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
        
        @Override
        public String getName(){
            return this.getContactInfo().getName();
        }

        @Override
        public String getGender(){
            return this.getContactInfo().gender();
        }

        @Override
        public String getStreet(){
            return this.getContactInfo().getStreet();
        }

        @Override
        public String getHousenumber(){
            return this.getContactInfo().getHousenumber();
        }

        @Override
        public String getZipcode(){
            return this.getContactInfo().getZipcode();
        }
        
        @Override
        public String getCity(){
            return this.getContactInfo().getCity();
        }

        @Override
        public String getPhonenumber(){
            return this.getContactInfo().getPhonenumber();
        }
        
	//Setters
        @Override
        public void setName(String name) {
            this.getContactInfo().setName(name);
        }

        @Override
        public void setGender(boolean gender) {
            this.getContactInfo().setGender(gender);
        }

        @Override
        public void setStreet(String street) {
            this.getContactInfo().setStreet(street);
        }

        @Override
        public void setHousenumber(String housenumber) {
            this.getContactInfo().setHousenumber(housenumber);
        }
        
        @Override
        public void setZipcode(String zipcode) {
            this.getContactInfo().setZipcode(zipcode);
        }

        @Override
        public void setCity(String city) {
            this.getContactInfo().setCity(city);
        }

        @Override
        public void setPhonenumber(String phonenumber) {
            this.getContactInfo().setPhonenumber(phonenumber);
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
        
        @Override
        public void changeLoginInfo(String newUsername, String newPassword){
            this.getLoginInfo().setUsername(newUsername);
            this.getLoginInfo().setPassword(newPassword);
        }
        
        @Override
        public String getUsername(){
            return this.getLoginInfo().getUsername();
        }
        
        @Override
        public String getPassword(){
            return this.getLoginInfo().getPassword();
        }        

        @Override
        public User getUser() {
            return this;
        }
        
        @Override
        public String toString(){
            String string = new String();
            if(isCaptain()){
                string += "Captain    ";
            }
            if(isGoalkeeper()){
                string += "Goalkeeper    ";
            }
            return string + this.getContactInfo().toString();
        }

        public void matchPassed(){
            if(this.getSuspentionInfo().getTimeSuspended() != 0){
                this.getSuspentionInfo().matchPassed();
            }
        }
        
        public void setSuspended(int yellowCards, int redCards) throws ToMuchYellowCardsException {
            this.getSuspentionInfo().setSuspended(yellowCards, redCards);
        }
}
