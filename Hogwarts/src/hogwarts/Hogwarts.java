/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

import byui.cit260.Hogwarts.model.Player;

/**
 *
 * @author boba
 */
public class Hogwarts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintson");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
