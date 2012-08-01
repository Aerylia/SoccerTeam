/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

/**
 *
 * @author Arianne
 */
public class Coach{
	
    private ContactInfo contactInfo;
    private LoginInfo loginInfo;
    
	public Coach(String name, boolean gender, String street, String housenumber, String zipcode,
						   String city, String phonenumber){
		this.contactInfo = new ContactInfo(name, gender, street, housenumber, zipcode, city, phonenumber);
                this.loginInfo = new LoginInfo(name, phonenumber);
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
        
        private LoginInfo getLoginInfo(){
            return this.loginInfo;
        }
        
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

}
