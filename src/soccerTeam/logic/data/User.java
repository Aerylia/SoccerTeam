/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

import soccerTeam.logic.data.LoginInfo;

/**
 *
 * @author Arianne
 */
public interface User {
    
    public User getUser();
    public String getName();
    public String getGender();
    public String getStreet();
    public String getHousenumber();
    public String getZipcode();
    public String getCity();
    public String getPhonenumber();
    
    public void setName(String name);
    public void setGender(boolean gender);
    public void setStreet(String street);
    public void setHousenumber(String housenumber);
    public void setZipcode(String zipcode);
    public void setCity(String city);
    public void setPhonenumber(String phonenumber);
    
    public String getUsername();
    public String getPassword();
    public void changeLoginInfo(String username, String password);

}
