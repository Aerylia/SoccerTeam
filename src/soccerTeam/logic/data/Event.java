/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

/**
 *
 * @author Arianne
 */
public abstract class Event {
    
    private Player subject;
    private Time startTime;//TODO
    private Time endTime;//TODO
    
    public Event(/* Stuffies */){
        //TODO
    }
    
    public Time getStartTime(){
        return this.startTime;
    }
    
    public Time getEndTime(){
        return this.startTime;
    }
    public abstract void print();
    
    @Override
    public abstract String toString();
    
}
