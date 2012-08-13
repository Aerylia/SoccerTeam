/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

import java.util.ArrayList;

/**
 *
 * @author Arianne
 */
public abstract class Match {
    
        private Team team;
    	private CorrectDate date;
        private Time time;
	private String location;
	private String opponents;
	private ArrayList<Player> matchTeam;
	private ArrayList<Player> availablePlayers;
        private MatchStatistics matchStats;
	
	//Constructors
	public Match(Team team, CorrectDate date, Time time, String opponents, String location){
                this.setTeam(team);
		this.setDate(date);
                this.setTime(time);
		this.setOpponents(opponents);
		this.setLocation(location);
                this.matchTeam = new ArrayList();
                this.availablePlayers = new ArrayList();
                this.setAvailablePlayers();
	}

	//getters
        private Team getTeam(){
            return this.team;
        }
        
        private ArrayList<Player> getAvailablePlayers(){
            return this.availablePlayers;
        }
        
	public CorrectDate getDate(){
		return this.date;
	}
        
        public Time getTime(){
            return this.time;
        }

	public String getLocation(){
		return this.location;
	}
	
	public String getOpponents(){
		return this.opponents;
	}
        
        private MatchStatistics getMatchStats(){
            return this.matchStats;
        }
	
	//setters
	public void setDate(CorrectDate date){
		this.date = date;
	}
        
        private void setTime(Time time) {
            this.time = time;
        }
	
	public void setLocation(String location){
		this.location = location;
	}
	
	public void setOpponents(String opponents){
		this.opponents = opponents;
	}
	
	public void setMatchTeam(ArrayList<Player> matchTeam){
		this.matchTeam = matchTeam;
	}
        
        private void setTeam(Team team){
            this.team = team;
        }

	//Methods
        private void setAvailablePlayers(){
            this.availablePlayers = this.getTeam().getNonSuspendedPlayers(this);
        }
        
        @Override
	public String toString(){
            //TODO
		throw new UnsupportedOperationException("Not implemented yet.");
	}

        void changeAvailability(Player player) {
            //TODO suspention check.
            int index = this.getAvailablePlayers().indexOf(player);
            if(index == -1){
                this.getAvailablePlayers().add(player); //mits hij niet suspended is.
            } else {
                this.getAvailablePlayers().remove(index);
            }
        }
        
        public void addMatchStats(/*stuffies*/){
            this.setMatchStats(new MatchStatistics(/*stuffies*/));
        }

        private void setMatchStats(MatchStatistics matchStats) {
            this.matchStats = matchStats;
        }

        protected String date() {
            return this.getDate().toString();
        }
        
        protected String time(){
            return this.getTime().toString();
        }

        public String[] displayAvailablePlayers() {
            String [] players;
            players = new String [this.getAvailablePlayers().size()];
            int index = 0;
            for(Player player: this.getAvailablePlayers()){
                players[index] = player.toString();
                index++;
            }
            return players;
        }

    public void setAvailable(Player player) {
        if(!this.availablePlayers.contains(player)){
            this.availablePlayers.add(player);
        }
    }
    
    public void setUnavailable(Player player){
        if(this.availablePlayers.contains(player)){
            this.availablePlayers.remove(player);
        }
    }


}
