/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic;

/**
 *
 * @author Arianne
 */
public class CorrectDate {
    	private int dayOfMonth;
	private int month;
	private int year;
	
	public CorrectDate(int dayOfMonth, int month, int year){
		this.setDayOfMonth(dayOfMonth);
		this.setMonth(month);
		this.setYear(year);
	}
	
	//getters
	public int getDayOfMonth(){
		return this.dayOfMonth;
	}
	
	public int getMonth(){
		return this.month;
	}
	
	public int getYear(){
		return this.year;
	}
	
	//setters
	public void setDayOfMonth(int dayOfMonth){
		this.dayOfMonth = dayOfMonth;
	}
	
	public void setMonth(int month){
		this.month = month;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	/**
	 * returns een getal groter dan 0 als this na otherdate komt, gelijk aan 0
	 * als deze gelijk zijn en kleiner dan 0 als deze voor die andere komt.
	 * 
	 * @param otherdate
	 * @return getal dat de afstand tot de date moet voorstellen.
	 */
	public int compareTo(CorrectDate otherdate){
		int difference = this.getYear() - otherdate.getYear();
		if(difference != 0){
			return difference;
		} else {
			difference = this.getMonth() - otherdate.getMonth();
			if(difference != 0){
				return difference;
			} else {
				difference = this.getDayOfMonth() - otherdate.getDayOfMonth();
				return difference;
			}
		}
	}
	
        @Override
	public String toString(){
		return this.getDayOfMonth() + "/" + this.getMonth() + "/" + this.getYear();
	}
}

