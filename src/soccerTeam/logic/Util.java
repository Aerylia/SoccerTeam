/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic;

import java.util.ArrayList;
import java.util.Iterator;
import soccerTeam.logic.data.Player;

/**
 *
 * @author Arianne
 */
public abstract class Util {
    	/**
	 * Plakt een stel strings aan elkaar met na elke string een char c.
	 * 
	 * @param c
	 * @param strings
	 * @return
	 */
	public static String concat(String c, String... strings){
		String buffer = "";
		for (String string : strings){
			buffer += string;
			buffer += c;
		}
		return buffer;
	}
	
	/**
	 * Veranderd een arraylist naar een string.
	 * 
	 * @param list
	 * @return
	 */
	public static String ArrayListToString(ArrayList<Player> list){
		String output = "";
		for(Iterator<Player> it = list.iterator(); it.hasNext();){
			output += it.next().toString() + "\n";
		}
		return output;
	}
}

