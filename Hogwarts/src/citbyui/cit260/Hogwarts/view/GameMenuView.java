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
import byui.cit260.Hogwarts.model.Player;
import byui.cit260.Hogwarts.model.Scene;
import citbyui.cit260.Hogwarts.exceptions.MapControlException;
import hogwarts.Hogwarts;
import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
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
                + "\nE - Save a list of scenes to an external file" 
                + "\nQ - Main menu"
                + "\n------------------------------------------");
       
    game = Hogwarts.getCurrentGame();
    }

    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert choice to upper case
        
        Character character = Character.Cedric;
        Point coord = character.getCoordinates();
        switch (value) {
            case "V": // View map
                this.viewMap();
                break;
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
            case "L": //View current location
                //this.moveToCurrentLocation(character, coord);
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
            case "E":
                this.exportFile();
            case "Q": // Go back to main menu
                this.MainMenuView();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid selection. Try again.");
                break;
        }
        return false;
    }

    private void viewMap() {
        
        Map map = Hogwarts.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        this.console.println("            MAP");
        this.console.print("   ");
        
        for (int i = 0; i < 5; i++) {
            this.console.print(i + 1 + "    ");
        }
        this.console.print("\n");
        for (int i = 0; i < 5; i++) {
            this.console.println("--------------------------");
            this.console.print(i + 1);
            for (int j = 0; j < 5; j++) {
                this.console.print("|");
                this.console.print(" " + locations[i][j].getScene().getMapSymbol()+ " ");
            }
            this.console.print("\n");
        }
    }
    
    private void firstTask() {
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
        Map map = game.getMap();
        /*for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
            {
            Scene scene = locations[i][j].getScene();
            System.out.println(scene.getDescription());
            }*/
        
    }

    private void viewNumOfCoinsCollected() {
        
    }

    private void viewListOfToolsAcquired() {
        //System.out.println("*** viewNumOftoolsCollected function called ***");
       StringBuilder line;

        
        //Item[] items = game.getItem();
        Item[] items = GameControl.createItemList();
        //items[2].setHasItem(true);
        this.console.println("\n            List of Items");
        line = new StringBuilder("                            ");
        line.insert(0, "Description");
        line.insert(30, "In Stock");
        this.console.println(line.toString());
        

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
            this.console.println(line.toString());
        }

        //display
        
    }

    private void numOfCoinsNeeded() {
        this.console.println("*** numOfCoinsNeeded function called ***");
    }

    private void saveGame() {
        this.console.println("*** saveGame function called ***");
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
        this.console.println("\n         List of Houses");
        //for (int i =0; i < houses.length; i++){
        for ( House house:houses )
            this.console.println(house);
        }

    private void exportFile() {
        
        Location[][] locations = game.getMap().getLocations();
        
        // get size info of the map
        double numCol = game.getMap().getColumnCount();
        double numRow = game.getMap().getRowCount();
        
        Scene[] scenes = new Scene[25];
        
        int count = 0;

        
        String fileLoc = "Scene_List.txt";
        try (PrintWriter out = new PrintWriter(fileLoc)) {
            out.println("\n\n           List of Scenes          ");
            out.printf("%n%-26s%8s", "Name", "Location");
            out.printf("%n%-26s%8s", "----", "--------");
            
            
            for (int i = 0; i < numCol; i++) {
                for (int j = 0; j < numRow; j++) {
                   Scene scene = locations[i][j].getScene();
                   out.printf("%n%-30s%2d%2d", scene.getDescription(), j, i);
               }
            }
         
        } catch (IOException ex) {
           System.out.println("I/O Exception: " + ex.getMessage());
        } 
        
    }
}
