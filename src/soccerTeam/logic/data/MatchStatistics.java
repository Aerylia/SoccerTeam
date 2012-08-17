/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

import soccerTeam.logic.SortedEvents;

/**
 *
 * @author Arianne
 */
public class MatchStatistics {
    
    private SortedEvents events;
    private boolean forfeited;
    public static int LOSS = 1;
    public static int WON = 2;
    public static int DRAW = 3;
    private int result;
    
    public MatchStatistics(boolean forfeited){
        this.events = new SortedEvents();
        this.forfeited = true;
        this.setResult(LOSS);
        
    }
    
    public MatchStatistics(/*stuffies*/){
        this.forfeited = false;
        this.events = new SortedEvents();
        //TODO
    }   
    
    private SortedEvents getEvents(){
        return this.events;
    }

    public Object[] toArray() {
        return this.getEvents().toArray();
    }

    private void setResult(int result) {
        if ( result < 1 || result > 3) {
            this.result = result;
        } else {
            throw new IllegalArgumentException("The result must be a LOSS, WON or DRAW.");
        }
    }
    
    @Override
    public String toString(){
        //TODO
        return "";
    }
    
}
