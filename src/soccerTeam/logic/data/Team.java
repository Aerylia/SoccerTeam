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
        public Team(String teamName){
            this.setTeamName(teamName);
            this.team = new ArrayList();
            this.coaches = new ArrayList();
        }
        
        public String getTeamName(){
            return this.teamName;
        }
        
        private ArrayList<Player> getTeam(){
            return this.team;
        }
        
        private ArrayList<Coach> getCoaches(){
            return this.coaches;
        }
        
        public void setTeamName(String teamName){
            this.teamName = teamName;
        }
        
        public boolean addPlayerToTeam(Player player){
            return getTeam().add(player);
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
        
        public void changeAvailability(Player player, Match match){
            match.changeAvailability(player);
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
}
