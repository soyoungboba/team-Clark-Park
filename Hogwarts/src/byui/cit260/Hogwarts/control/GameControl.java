/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.control;

import byui.cit260.Hogwarts.model.Player;
import hogwarts.Hogwarts;

/**
 *
 * @author boba
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        Hogwarts.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame() function called ***"); //To change body of generated methods, choose Tools | Templates.
    }
    public static void saveHouse(String house) {
        System.out.println("\n*** saveHouse() function called ***"); //To change body of generated methods, choose Tools | Templates.
    
    
    }
}
