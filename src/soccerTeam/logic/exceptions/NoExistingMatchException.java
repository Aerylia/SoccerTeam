/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.exceptions;

import soccerTeam.logic.CorrectDate;

/**
 *
 * @author Arianne
 */
public class NoExistingMatchException extends Exception{
    
    public NoExistingMatchException(CorrectDate date){
        super("Er is geen match bekend op " + date.toString());
    }
}
