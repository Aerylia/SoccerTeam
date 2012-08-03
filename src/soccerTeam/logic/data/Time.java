/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

import java.util.GregorianCalendar;

/**
 *
 * @author Arianne
 */
public class Time {
    
    private GregorianCalendar time;
    
    public Time(int year, int month, int dayOfMonth, int hour, int minutes, int seconds){
        this.time = new GregorianCalendar(year, month, dayOfMonth, hour, minutes, seconds);
    }
    
    private GregorianCalendar getTime(){
        return this.time;
    }
    
    public int compareTo(Time otherTime){
        return this.getTime().compareTo(otherTime.getTime());
    }
}
