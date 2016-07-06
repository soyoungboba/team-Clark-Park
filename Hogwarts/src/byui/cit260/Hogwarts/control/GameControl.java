/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.control;

import byui.cit260.Hogwarts.model.Game;
import byui.cit260.Hogwarts.model.Item;
import byui.cit260.Hogwarts.model.ItemType;
import byui.cit260.Hogwarts.model.Location;
import byui.cit260.Hogwarts.model.Map;
import byui.cit260.Hogwarts.model.Player;
import byui.cit260.Hogwarts.model.Scene;
import byui.cit260.Hogwarts.model.SceneType;
import citbyui.cit260.Hogwarts.exceptions.MapControlException;
import hogwarts.Hogwarts;
import java.util.Random;

/**
 *
 * @author boba
 */
public class GameControl {

    public static int randOne;
    
    public static Player createPlayer(String name)
                throws MapControlException /*chance to gameControl*/{
        if (name == null) {
            throw new MapControlException("Player name can not be Null");
        }
        Player player = new Player();
        player.setName(name);
        Hogwarts.setPlayer(player);
        player.setRow(0);
        player.setCol(0);

        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game(); //create new game
        Hogwarts.setCurrentGame(game); //save in Hogwarts

        game.setPlayer(player); //save player in game

        //create the item and save in the game
        Item[] itemList = GameControl.createItemList();
        game.setItem(itemList);

        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); //save map in game
       
        //move characters to starting position in the map
        //GameControl.moveCharactersToStartingLocation(map,player);
    }

    public static Item[] createItemList() {
        Item[] items = new Item[ItemType.values().length];
        for (int i = 0; i < ItemType.values().length; i++) {
            items[i] = new Item(i);
            /*Item[] items = new Item[4];

            Item wand = new Item();
            wand.setDescription("Wand");
            wand.setInventoryType(inventoryType);
            wand.setQuantityInStock(0);
            items[Item.wand.ordinal()] = wand;

            Item invisibility cloak = new Item();
            invisibility_cloak.setDescription("Invisibility cloak");
            invisibility_cloak.setInventoryType(inventoryType);
            items[1] = invisibility_cloak;

            Item = new Item();
            broomstick.setDescription("Broomstick");
            broomstick.setInventoryType(inventoryType);
            broomstick.setQuantityInStock(0);
            items[2] = broomstick;

            Item = new Item();
            gillyweed.setDescription("Gillyweed");
            gillyweed.setInventoryType(inventoryType);
            gillyweed.setQuantityInStock(0);
            items[3] = gillyweed;  */
        }
        return items;
    }

    public static void saveHouse(String house) {
        Hogwarts.getPlayer().setHouse(house);
    }

    public static void saveCharacter(String character){
        Hogwarts.getPlayer().setCharacter(character);
    }
    public static int randNum() {
        Random rand = new Random();
        randOne = rand.nextInt(30) + 1;
        //randOne = (int)(Math.random()*50 + 1);
        return randOne;
    }
    static void moveCharactersToStartingLocation(Map map,Player player) {
        System.out.println("set move characters function called");    }

}
