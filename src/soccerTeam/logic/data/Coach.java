/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

/**
 *
 * @author Arianne
 */
public class Coach implements User{
	
    private ContactInfo contactInfo;
    private LoginInfo loginInfo;
    
	public Coach(String name, boolean gender, String street, String housenumber, String zipcode,
						   String city, String phonenumber){
		this.contactInfo = new ContactInfo(name, gender, street, housenumber, zipcode, city, phonenumber);
                this.loginInfo = new LoginInfo(name, phonenumber);
	}
        
        private ContactInfo getContactInfo(){
            return this.contactInfo;
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
        
        private LoginInfo getLoginInfo(){
            return this.loginInfo;
        }
        
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
            return "Coach\t" + this.getContactInfo().toString();
        }

}
