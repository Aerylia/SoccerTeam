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
        
        @Override
        public String getName(){
            return this.contactInfo.getName();
        }

        @Override
        public String getGender(){
            return this.contactInfo.gender();
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
        
        private LoginInfo getLoginInfo(){
            return this.loginInfo;
        }
        
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
