/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

import byui.cit260.Hogwarts.model.Player;
import byui.cit260.Hogwarts.model.House;
import byui.cit260.Hogwarts.model.Location;
import byui.cit260.Hogwarts.model.Scene;
import byui.cit260.Hogwarts.model.TaskScene;
import byui.cit260.Hogwarts.model.Character;
import byui.cit260.Hogwarts.model.Item;
import byui.cit260.Hogwarts.model.Map;
import byui.cit260.Hogwarts.model.Game;

public class Hogwarts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintson");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        House houseOne = new House();
        
        houseOne.setHouseName("Gryfindor");
        
        String houseInfo = houseOne.toString();
        System.out.println(houseInfo);
        
        Location locationOne = new Location();
        locationOne.setRow(1);
        locationOne.setColumn(2);
        locationOne.setVisited(true);
        locationOne.setAmountRemaining(2);
        String rowInfo = locationOne.toString();
        System.out.println(rowInfo);
        
        Scene sceneOne = new Scene();
        sceneOne.setDescription("Office");
        sceneOne.setBlockedLocation(true);
        sceneOne.setDisplaySymbol(true);
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        TaskScene taskOne = new TaskScene();
        taskOne.setAmountAvailable(23);
        taskOne.setResourcesNeeded(15);
        taskOne.setAttribute("Hickory");
        String taskInfo = taskOne.toString();
        System.out.println(taskInfo);
        
        

        // character
        Character characterOne = new Character();
        
        characterOne.setName("Harry Potter");
        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
       
      
        // item
        Item itemOne = new Item();
        
        itemOne.setInventoryType("wands");
        itemOne.setQuantityInStock(22);
        
        String inventoryInfo = itemOne.toString();
        System.out.println(inventoryInfo);
    
        
        // map
        Map myMap = new Map();
        
        myMap.setRowCount(10);
        myMap.setColumnCount(50);
        
        String mapInfo = myMap.toString();
        System.out.println(mapInfo);
        
        
        // game
        Game myGame = new Game();
        // need explanation of set start games type
        myGame.setStartGame(20);
        myGame.setEndGame(60);
        
        String gameInfo = myGame.toString();
        System.out.println(gameInfo);
    }
    
}