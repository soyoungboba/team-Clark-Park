/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

import byui.cit260.Hogwarts.control.GameControl; //needed?//
import byui.cit260.Hogwarts.model.Character;
import byui.cit260.Hogwarts.model.Game;
import byui.cit260.Hogwarts.model.House;
import byui.cit260.Hogwarts.model.Item;
import byui.cit260.Hogwarts.model.ItemType;
import byui.cit260.Hogwarts.model.Location;
import byui.cit260.Hogwarts.model.Map;
import citbyui.cit260.Hogwarts.exceptions.MapControlException;
import hogwarts.Hogwarts;
import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author boba
 */
public class GameMenuView extends View {

    private Game game;
    
    public GameMenuView() {
       super("\n"
                + "\n------------------------------------------"
                + "\n|               Game Menu                |"
                + "\nV - View map"
                + "\nC - Display character"
                + "\nF - First task"
                + "\nS - Second task"
                + "\nT - Third task"
                + "\nM - Move to new location"
                + "\nL - View current location"
                + "\nVC - View number of coins collected"
                + "\nVT - View list of tools acquired"
                + "\nVHL - View House list"
                + "\nC - Number of coins needed for each task"
                + "\nG - Save game"
                + "\nH - Help"
                + "\nQ - Main menu"
                + "\n------------------------------------------");
    game = Hogwarts.getCurrentGame();
    }

    public boolean doAction(String value) {
        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "V": // View map
                this.viewMap();
                break;
            /*case "C": // Character
                this.Character();
                break;*/
            case "F": // First task
                this.firstTask();
                break;
            case "S": // Second task
                this.secondTask();
                break;
            case "T": // Third task
                this.thirdTask();
                break;
            case "M": // Move to new location
                this.moveToNewLocation();
                break;
            case "L": // View current location
                this.moveToCurrentLocation();
                break;
            case "VC": // View number of coins collected 
                this.viewNumOfCoinsCollected();
                break;
            case "VT": // View list of tools acquired
                this.viewListOfToolsAcquired();
                break;
            case "VHL": // View list of tools acquired
                this.viewListOfHouses();
                break;
            case "C": // Number of coins needed for eash task
                this.numOfCoinsNeeded();
                break;
            case "G": // Save game
                this.saveGame();
                break;
            case "H": // Help
                this.HelpMenuView();
                break;
            case "Q": // Go back to main menu
                this.MainMenuView();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void viewMap() {
        Game game = new Game();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        System.out.println("            MAP");
        System.out.print("   ");
        
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + "    ");
        }
        System.out.print("\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("--------------------------");
            System.out.print(i + 1);
            for (int j = 0; j < 5; j++) {
                System.out.print("|");
                System.out.print(" ?? ");
            }
            System.out.print("\n");
        }
        
    }

    private void firstTask() {
        //System.out.println("*** firstTask function called ***");
        Task1View task1 = new Task1View();
        task1.display();
    }

    private void secondTask() {
        Task2View task2 = new Task2View();
        task2.display();
    }

    private void thirdTask() {
        Task3View task3 = new Task3View();
        task3.display();
    }

    private static void moveToCurrentLocation(Character character, Point coordinates) 
                                            throws MapControlException {
        
        Map map = Hogwarts.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() ||
            newColumn <0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move character to location"
                                        + coordinates.x + ", " + coordinates.y 
                                        + "because that location is outside "
                                        + "the bounds of the map.");
        }
    }
    
    private void moveToNewLocation() {
        System.out.println("*** moveToNewLocation function called ***");
    }

    private void viewNumOfCoinsCollected() {
        System.out.println("*** viewNumOfCoinsCollected function called ***");
    }

    private void viewListOfToolsAcquired() {
        //System.out.println("*** viewNumOftoolsCollected function called ***");
       StringBuilder line;

        
        //Item[] items = game.getItem();
        Item[] items = GameControl.createItemList();
        //items[2].setHasItem(true);
        System.out.println("\n            List of Items");
        line = new StringBuilder("                            ");
        line.insert(0, "Description");
        line.insert(30, "In Stock");
        System.out.println(line.toString());
        

        //for each inventory item
        for (Item item : items) {
            String has = "no";
            if (item.isHasItem()){
                has = "yes";
            }
            int ordinalValue = item.getOrdinalValue();
            line = new StringBuilder("                              ");
            line.insert(0, ItemType.values()[ordinalValue].getInventoryType());
            line.insert(32, has);
            System.out.println(line.toString());
        }

        //display
        
    }

    private void numOfCoinsNeeded() {
        System.out.println("*** numOfCoinsNeeded function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void HelpMenuView() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void MainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

    private void viewListOfHouses() {
        House[] houses = House.values();
        System.out.println("\n         List of Houses");
        //for (int i =0; i < houses.length; i++){
        for ( House house:houses )
            System.out.println(houses);
        }
    //}
}
