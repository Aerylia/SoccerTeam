/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

import soccerTeam.logic.exceptions.NoExistingMatchException;
import soccerTeam.logic.exceptions.ToMuchYellowCardsException;

/**
 *
 * @author Arianne
 */
public class SuspentionInfo {
    
	private int numberOfYellowCards;
	private int timeSuspended;
	
	//Constructor
	public SuspentionInfo(){
		this.resetYellowCards();
		this.setTimeSuspended(0); 
	}
	
	//Getters	
	public int getYellowCards(){
		return this.numberOfYellowCards;
	}
	
	public int getTimeSuspended(){
		return this.timeSuspended;
	}
	
	//Setters	
	public void setYellowCards(int amount){
		this.numberOfYellowCards = amount;
	}
	
	public void setTimeSuspended(int numberOfMatches){
		this.timeSuspended = numberOfMatches;
	}
	
	//Methods
	public void resetYellowCards(){
		this.setYellowCards(0);
	}
	
	public void addYellowCards(int amount){
		this.setYellowCards(getYellowCards() + amount);
	}
	
	public void matchPassed(){
		int time = getTimeSuspended();
		if(time > 0){
			this.setTimeSuspended(time-1);			
		}
	}
        
        public void setSuspended(int yellowCards, int redCards, Match match){
            //TODO
            throw new UnsupportedOperationException("Not implemented yet");
        }
}