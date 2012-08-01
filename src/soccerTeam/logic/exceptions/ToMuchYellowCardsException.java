/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.exceptions;

/**
 *
 * @author Arianne
 */
public class ToMuchYellowCardsException extends Exception{
    
    public ToMuchYellowCardsException(){
        super("Je kan in 1 match niet meer dan 2 gele kaarten krijgen...");
    }
}
