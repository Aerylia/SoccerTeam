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
public class Time {
    
    private GregorianCalendar time;
    private boolean hasSeconds;
    
    public Time(int hours, int minutes, int seconds){
        this.time = new GregorianCalendar(0, 0, 0, hours, minutes, seconds);
        this.hasSeconds = true;
    }
    
    public Time(int hour, int minutes){
        this.time = new GregorianCalendar(0, 0, 0, hour, minutes);
        this.hasSeconds = false;
    }
    
    private boolean hasSeconds(){
        return this.hasSeconds;
    }
    
    private GregorianCalendar getTime(){
        return this.time;
    }
    
    private int getHour(){
        return this.getTime().get(Calendar.HOUR_OF_DAY);
    }
    
    private int getMinutes(){
        return this.getTime().get(Calendar.MINUTE);
    }
    
    private int getSeconds(){
        return this.getTime().get(Calendar.SECOND);
    }
    public int compareTo(Time otherTime){
        return this.getTime().compareTo(otherTime.getTime());
    }
    
    @Override
    public String toString(){
        String hour = new Integer(this.getHour()).toString();
        String minute = new Integer(this.getMinutes()).toString();
        if(this.hasSeconds()){
            String second = new Integer(this.getSeconds()).toString();
            return hour +":"+ minute +":"+ second;
        } else {
            return hour +":"+ minute ;
        }
    }
}
