/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

/**
 *
 * @author Arianne
 */

public class ContactInfo {

    private String name;
    private boolean gender; //true is mail, false is female
    private String street;
    private String housenumber; //In case 4b
    private String zipcode;
    private String city;
    private String phonenumber;
    
    public ContactInfo(String name, boolean gender, String street, String housenumber, String zipcode, String city, String phonenumber) {
        this.setName(name);
        this.setGender(gender);
        this.setStreet(street);
        this.setHousenumber(housenumber);
        this.setZipcode(zipcode);
        this.setCity(city);
        this.setPhonenumber(phonenumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean getGender(){
        return this.gender;
    }
    
    public String getStreet(){
        return this.street;
    }
    
    public String getHousenumber(){
        return this.housenumber;
    }
    
    public String getZipcode(){
        return this.zipcode;
    }
    
    public String getCity(){
        return this.city;
    }
    
    public String getPhonenumber(){
        return this.phonenumber;
    }
}
