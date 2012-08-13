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
    private int hour;
    private int minutes;
    private int seconds;
    
    public Time(int hour, int minutes, int seconds){
        this.time = new GregorianCalendar(0, 0, 0, hour, minutes, seconds);
        this.setHour(hour);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }
    
    private GregorianCalendar getTime(){
        return this.time;
    }
    
    private void setHour(int hour){
        this.hour = hour;
    }
    
    private void setMinutes(int minutes){ 
        this.minutes = minutes;
    }
    
    private void setSeconds(int seconds){
        this.seconds = seconds;
    }
    
    private int getHour(){
        return this.hour;
    }
    
    private int getMinutes(){
        return this.minutes;
    }
    
    private int getSeconds(){
        return this.seconds;
    }
    public int compareTo(Time otherTime){
        return this.getTime().compareTo(otherTime.getTime());
    }
    
    @Override
    public String toString(){
        String hour = new Integer(this.getHour()).toString();
        String minutes = new Integer(this.getMinutes()).toString();
        String seconds = new Integer(this.getSeconds()).toString();
        return hour +":"+ minutes +":"+ seconds;
    }
}
