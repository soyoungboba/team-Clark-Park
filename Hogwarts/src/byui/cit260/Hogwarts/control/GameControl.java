/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.control;

import byui.cit260.Hogwarts.model.Game;
import byui.cit260.Hogwarts.model.Item;
import byui.cit260.Hogwarts.model.Map;
import byui.cit260.Hogwarts.model.Player;
import hogwarts.Hogwarts;
import java.util.Random;

/**
 *
 * @author boba
 */
public class GameControl {

    public static int randOne;

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        Hogwarts.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) throws MapControl.MapControlException {
        Game game = new Game(); //create new game
        Hogwarts.setCurrentGame(game); //save in Hogwarts
        
        game.setPlayer(player); //save player in game
        
        //create the item and save in the game
        Item[] itemList = GameControl.createItemList(); 
        game.setItem(itemList);
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); //save map in game
        
        //move characters to starting position in the map
        MapControl.moveCharactersToStartingLocation(map);
    }
    
    public static Item[] createItemList() {
        System.out.println("\n*** called createItemList() in GameControl ***");
        return null;
    }
    
    public static void saveHouse(String house) {
        System.out.println("\n*** saveHouse() function called ***");
    }
    public static int randNum() {
        Random rand = new Random();
        randOne = rand.nextInt(30)+1;
        //randOne = (int)(Math.random()*50 + 1);
        return randOne;
    }
}
