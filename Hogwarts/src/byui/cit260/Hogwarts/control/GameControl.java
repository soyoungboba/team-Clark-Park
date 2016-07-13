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
import citbyui.cit260.Hogwarts.exceptions.GameControlException;
import citbyui.cit260.Hogwarts.exceptions.MapControlException;
import hogwarts.Hogwarts;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import byui.cit260.Hogwarts.model.Character;
import java.io.FileWriter;
import java.io.PrintWriter;
/**
 *
 * @author boba
 */
public class GameControl {

    public static int randOne;

    public static Player createPlayer(String name)
            throws MapControlException /*chance to gameControl*/ {
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
        map.getLocations()[0][0].setVisited(true);
        game.setMap(map); //save map in game

        
    }
    public static void moveToLocation(int x, int y)
            throws MapControlException{
        Map map = Hogwarts.getCurrentGame().getMap();
        int newRow = x-1;
        int newColumn = y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() ||
            newColumn <0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move character to location"
                                        + x + ", " + y 
                                        + "because that location is outside "
                                        + "the bounds of the map.");
            
        }
        Player player = Hogwarts.getPlayer();
        player.setRow(x);
        player.setCol(y);
        map.getLocations()[x][y].setVisited(true);
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

    public static void saveCharacter(String character) {
        Hogwarts.getPlayer().setCharacter(character);
    }

    public static int randNum() {
        Random rand = new Random();
        randOne = rand.nextInt(30) + 1;
        //randOne = (int)(Math.random()*50 + 1);
        return randOne;
    }

    

    public static void saveGame(Game currentGame, String filePath)
            throws GameControlException {

        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(currentGame);
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath)
            throws GameControlException {
        Game game = null;
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject();
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        Hogwarts.setCurrentGame(game);//load in hogwarts
    }

    public static void saveCharacterList(Character[] characterList, String filePath)
            throws GameControlException {
            //PrintWriter outFile = null;
        try (PrintWriter outFile = new PrintWriter(filePath)) {
            
            outFile.println("\n\n            Character Report          ");
            outFile.printf("%n%-20s%20s"," Character","Discription");
            outFile.printf("%n%-20s%20s","----------","-----------");
            
            for(Character character : characterList){
                outFile.printf("%n%-20s%20s", character, character.getDescription());
            }
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

}
