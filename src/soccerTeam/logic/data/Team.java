/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

import java.util.ArrayList;
import java.util.Iterator;
import soccerTeam.logic.SortedMatches;

/**
 *
 * @author Arianne
 */
public class Team {
    
        private String teamName;
    	private ArrayList<Player> team;
        private ArrayList<Coach> coaches;
        private SortedMatches matches;
        
        //constructor
        public Team(String teamName, Coach coach){
            this.setTeamName(teamName);
            this.team = new ArrayList();
            this.coaches = new ArrayList();
            this.getCoaches().add(coach);
            this.matches = new SortedMatches();
        }
        
        public String getTeamName(){
            return this.teamName;
        }
        
        private ArrayList<Player> getTeam(){
            return this.team;
        }
        
        private SortedMatches getMatches(){
            return this.matches;
        }
        
        private ArrayList<Coach> getCoaches(){
            return this.coaches;
        }
        
        public void setTeamName(String teamName){
            this.teamName = teamName;
        }
        
        public boolean addPlayerToTeam(Player player){
            boolean succeeded = true;
            if( !getTeam().add(player)){
                succeeded = false;
            }
            if( !getMatches().addAvailablePlayer(player)){
                succeeded = false;
            }
            return succeeded;
        }
        
        public boolean addCoachToTeam(Coach coach){
            return getCoaches().add(coach);
        }
        
        public boolean removePlayerFromTeam(Player player){
            return getTeam().remove(player);
        }
        
        public boolean removeCoachFromTeam(Coach coach){
            return getCoaches().remove(coach);
        }
        
        public int containsPlayer(Player player){
            return this.getTeam().indexOf(player);
        }
        
        public int containsCoach(Coach coach){
            return this.getCoaches().indexOf(coach);
        }
        
        public void assignCaptain(Player player){
            dismissCaptain();
            player.assignToCaptain();
        }
        
        public void assignGoalkeeper(Player player){
            player.assignToGoalkeeper();
        }
        
        public void dismissGoalkeeper(Player player){
            player.dismissFromGoalkeeper();
        }
        
        private void dismissCaptain(){
            for(Iterator<Player> it = this.getTeam().iterator(); it.hasNext();){
                it.next().dismissFromCaptain();
            }
        }
        
        public ArrayList<Player> getNonSuspendedPlayers(Match match){
            //TODO
            //Somthing with get all suspended players out.
            return this.getTeam();
        }

        public int containsPlayer(String username, String password) {
            int index = 0;
            for(Player player: this.getTeam()){
                if(player.getUsername().equals(username) && player.getPassword().equals(password)){
                    return index;
                }
                index++;
            }
            return -1;
        }

        public Player getPlayer(int index) {
            return this.getTeam().get(index);
        }

        int containsCoach(String username, String password) {
            int index = 0;
            for(Coach coach: this.getCoaches()){
                if(coach.getUsername().equals(username) && coach.getPassword().equals(password)){
                    return index;
                }
            }
            return -1;
        }

        Coach getCoach(int index) {
            return this.getCoaches().get(index);
        }
        
        @Override
        public String toString(){
            return this.getTeamName();
        }

        public Object[] getDisplayableMatches() {
           return this.getMatches().toArray();
        }

        public Object[] getAllPlayers() {
            return this.getTeam().toArray();
        }

        public Object[] getNonGoalkeepers() {
            ArrayList<Player> nonGoalkeepers = new ArrayList();
            for(Player player : this.getTeam()){
                if(!player.isGoalkeeper()){
                    nonGoalkeepers.add(player);
                }
            }
            return nonGoalkeepers.toArray();
        }
        
        

        public Object[] getGoalkeepers() {
            ArrayList<Player> goalkeepers = new ArrayList();
            for(Player player : this.getTeam()){
                if(player.isGoalkeeper()){
                    goalkeepers.add(player);
                }
            }
            return goalkeepers.toArray();
        }

    public void addMatch(Team team, int day, int month, int year, int hour, int minutes, String opponents, String location) {
        this.getMatches().add(new Match(team, new CorrectDate(day, month, year), new Time(hour, minutes), opponents, location));
    }

    public Object[] getAvailabilityPlayer(Player player) {
        return this.getMatches().getAvailabilityPlayer(player);
    }

    public ArrayList<Player> getAvailablePlayers() {
        return (ArrayList<Player>)this.getTeam().clone();
    }
}
