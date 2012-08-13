/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic;

import java.util.GregorianCalendar;

/**
 *
 * @author Arianne
 */
public class CorrectDate {
    
        private GregorianCalendar date;
	
	public CorrectDate(int dayOfMonth, int month, int year){
		this.date = new GregorianCalendar(year, month, dayOfMonth);
	}
	
        private GregorianCalendar getDate(){
            return this.date;
        }
        
	public int compareTo(CorrectDate otherdate){
		return this.getDate().compareTo(otherdate.getDate());
	}
	
}

