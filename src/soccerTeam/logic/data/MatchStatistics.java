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
    
    public MatchStatistics(/*stuffies*/){
        //TODO
    }
    
    private SortedEvents getEvents(){
        return this.events;
    }

    public Object[] toArray() {
        return this.getEvents().toArray();
    }
    
}
