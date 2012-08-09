/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

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
	private void setYellowCards(int amount){
		this.numberOfYellowCards = amount;
	}
	
	private void setTimeSuspended(int numberOfMatches){
		this.timeSuspended = numberOfMatches;
	}
	
	//Methods
	private void resetYellowCards(){
		this.setYellowCards(0);
	}
	
	private void addYellowCards(int amount){
		this.setYellowCards(getYellowCards() + amount);
	}
	
	public void matchPassed(){
		int time = this.getTimeSuspended();
		if(time > 0){
			this.setTimeSuspended(time-1);			
		}
	}
        
        public void setSuspended(int yellowCards, int redCards) throws ToMuchYellowCardsException{
            if(yellowCards > 2){
                throw new ToMuchYellowCardsException();
            }
            if(redCards != 0 || yellowCards > 1){
                this.setTimeSuspended(2);
                this.resetYellowCards();
            } else if(yellowCards != 0){
                this.addYellowCards(yellowCards);
                if(this.getYellowCards() > 2){
                    this.setTimeSuspended(1);
                }
            }
        }
}