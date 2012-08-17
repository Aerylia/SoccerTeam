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
        private int month;
        private int dayOfMonth;
        private int year;
	
	public CorrectDate(int dayOfMonth, int month, int year){
		this.date = new GregorianCalendar(year, month, dayOfMonth);
	}
	
        private GregorianCalendar getDate(){
            return this.date;
        }
        
        private void setDayOfMonth(int dayOfMonth){
            this.dayOfMonth = dayOfMonth;
        }
        
        private void setMonth(int month){
            this.month = month;
        }
        
        private void setYear(int year){
            this.year = year;
        }
        
        private int getDayOfMonth(){
            return this.dayOfMonth;
        }
        
        private int getMonth(){
            return this.month;
        }
        
        private int getYear(){
            return this.year;
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

