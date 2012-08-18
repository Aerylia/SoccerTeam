/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

import java.util.Calendar;
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
        
        private int getDayOfMonth(){
            return this.getDate().get(Calendar.DAY_OF_MONTH);
        }
        
        private int getMonth(){
            return this.getDate().get(Calendar.MONTH) + 1;
        }
        
        private int getYear(){
            return this.getDate().get(Calendar.YEAR);
        }
        
	public int compareTo(CorrectDate otherdate){
		return this.getDate().compareTo(otherdate.getDate());
	}
	
        @Override
        public String toString(){
            String m = new Integer(this.getMonth()).toString();
            String d = new Integer(this.getDayOfMonth()).toString();
            String y = new Integer(this.getYear()).toString();
            return d + "/" + m + "/" + y;
        }

    boolean isUpcomming() {
        return Calendar.getInstance().compareTo(this.getDate()) < 0;
    }
}

