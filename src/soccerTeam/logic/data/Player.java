/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

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
        
        @Override
        public String getName(){
            return this.contactInfo.getName();
        }

        @Override
        public boolean getGender(){
            return this.contactInfo.getGender();
        }

        @Override
        public String getStreet(){
            return this.contactInfo.getStreet();
        }

        @Override
        public String getHousenumber(){
            return this.contactInfo.getHousenumber();
        }

        @Override
        public String getZipcode(){
            return this.contactInfo.getZipcode();
        }
        
        @Override
        public String getCity(){
            return this.contactInfo.getCity();
        }

        @Override
        public String getPhonenumber(){
            return this.contactInfo.getPhonenumber();
        }
        
	//Setters
        @Override
        public void setName(String name) {
            this.contactInfo.setName(name);
        }

        @Override
        public void setGender(boolean gender) {
            this.contactInfo.setGender(gender);
        }

        @Override
        public void setStreet(String street) {
            this.contactInfo.setStreet(street);
        }

        @Override
        public void setHousenumber(String housenumber) {
            this.contactInfo.setHousenumber(housenumber);
        }
        
        @Override
        public void setZipcode(String zipcode) {
            this.contactInfo.setZipcode(zipcode);
        }

        @Override
        public void setCity(String city) {
            this.contactInfo.setCity(city);
        }

        @Override
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

}
