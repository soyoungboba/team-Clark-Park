/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.control;
import byui.cit260.Hogwarts.model.Game;
import byui.cit260.Hogwarts.model.Player;
import hogwarts.Hogwarts;
/**
 *
 * @author boba
 */
public class InventoryControl {  
    
    private Game game;
    private Player player;
    
    public InventoryControl() {
       game = Hogwarts.getCurrentGame();
       player = game.getPlayer();
    }
    
    public void addCoinsToPlayer(double coins) {
        player.setCoin(coins);
    }
}

