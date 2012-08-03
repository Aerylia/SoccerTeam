/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.exceptions;

/**
 *
 * @author Arianne
 */
public class NoGenderException extends Exception{
    
    public NoGenderException(){
        super("Please enter a gender.");
    }
}
