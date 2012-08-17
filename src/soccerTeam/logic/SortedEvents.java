/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic;

import java.util.ArrayList;
import soccerTeam.logic.data.Event;

/**
 *
 * @author Arianne
 */
public class SortedEvents {
    
    private ArrayList<Event> events;
    
    public SortedEvents(){
        this.events = new ArrayList();
    }
    
    private ArrayList<Event> getEvents(){
        return this.events;
    }
    
    public boolean add(Event event){
        boolean succeeded;
                ArrayList<Event> events = this.getEvents();
		if(events.isEmpty()){
			succeeded = events.add(event);
		} else {
			int idx = 0;
			/* zolang match.getDate() komt na this.get(idx).getDate() */
			while(event.getStartTime().compareTo(events.get(idx).getStartTime()) > 0 && idx < events.size()){
				idx++;
			}
			events.add(idx, event);
			succeeded = true;
		}
		return succeeded;
    }

    public Object[] toArray() {
        return this.getEvents().toArray();
    }
}
