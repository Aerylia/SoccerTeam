/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.control;

import soccerTeam.logic.SoccerTeamModel;

/**
 *
 * @author Arianne
 */
public class SoccerTeamController {
    
    private User user;
    private SoccerTeamModel stm;
    
    public SoccerTeamController(){
        //TODO
    }
    
    private SoccerTeamModel getSTM(){
        return this.stm;
    }
    
    private void setUser(User user){
        this.user = user;
    }
    
    public void login(String username, String password){
        User user = this.getSTM().getCoach(username, password);
        if(user == null){
            user = this.getSTM().getPlayer(username, password);
            if(user == null){
                this.incorrectUsernameOrPassword(username, password);
            }
        }
        this.setUser(user);
    }

    private void incorrectUsernameOrPassword(String username, String password) {
        //TODO show message or something
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
