/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.exceptions;

/**
 *
 * @author Arianne
 */
public class LoginFailtException extends Exception{
    
    private String username;
    private String password;
    
    public LoginFailtException(String username, String password){
        super("Login failt.");
        this.username = username;
        this.password = password;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
}
