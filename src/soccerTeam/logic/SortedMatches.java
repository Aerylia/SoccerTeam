/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic;


import soccerTeam.logic.data.CorrectDate;
import java.util.ArrayList;
import java.util.Iterator;
import soccerTeam.logic.data.Match;
import soccerTeam.logic.data.Player;
import soccerTeam.logic.exceptions.NoExistingMatchException;

/**
 *
 * @author Arianne
 */

public class SortedMatches{

        private ArrayList<Match> matches;
        
	public SortedMatches(){
		this.matches = new ArrayList();
	}
        
        private ArrayList<Match> getMatches(){
            return this.matches;
        }
	
	public Match getMatch(Match match) throws NoExistingMatchException{
            int index = this.contains(match);
            if(index != -1){
                return this.getMatches().get(index); 
            } else {
                throw new NoExistingMatchException(match.getDate());
            }
	}
	
	/**
	 * @param match
	 * @return succeeded
	 * 
	 * Deze methode voegt een match toe aan de SortedMatchArrayList
	 * en zal dit gesorteerd doen op basis van de date van de meegegeven match.
	 * Deze methode returnt of dit is gelukt of niet.
	 */

	public boolean add(Match match){
		boolean succeeded;
                ArrayList<Match> matches = this.getMatches();
		if(matches.isEmpty()){
			succeeded = matches.add(match);
		} else {
			int idx = 0;
			/* zolang match.getDate() komt na this.get(idx).getDate() */
			while(match.getDate().compareTo(matches.get(idx).getDate()) > 0 && idx < matches.size()){
				idx++;
			}
			matches.add(idx, match);
			succeeded = true;
		}
		return succeeded;
	}

	/**
	 * retourneerd de index van een match in een sortedArrayList dat op een bepaalde datum
	 * plaats vindt.
	 * 
	 * @param date
	 * @return
	 */
	public int contains(CorrectDate date){
		int index = 0;
		for(Iterator<Match> it = this.getMatches().iterator(); it.hasNext(); ){
			if(it.next().getDate().compareTo(date) == 0){
				return index;
			}
			index++;
		}
		return -1;
	}
        
        public int contains(Match match){
            return this.getMatches().indexOf(match);
        }

    public int size() {
        return this.getMatches().size();
    }

    public Match get(int index) {
        return this.getMatches().get(index);
    }

    public Object[] toArray() {
        return this.getMatches().toArray();
    }

    public Object[] getAvailabilityPlayer(Player player) {
        ArrayList<Match> availableMatches = new ArrayList();
        for(Match match : this.getMatches()){
            if(match.isAvailable(player)){
                availableMatches.add(match);
            }
        }
        return availableMatches.toArray();
    }
}
