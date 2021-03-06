/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

import byui.cit260.Hogwarts.control.GameControl; //needed?//
import byui.cit260.Hogwarts.control.InventoryControl;
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
                + "\nCL - Veiw Character List"
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
                this.viewCurrentLocation();
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
            case "CL": // veiw characters
                this.viewCharacters();
                break;
            case "H": // Help
                this.HelpMenuView();
                break;
            case "E":
                String filepath = this.prompt();
                this.exportFile(filepath);
            case "Q": // Go back to main menu
                return true;

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
                if (locations[i][j].isVisited()) {
                    this.console.print(" " + locations[i][j].getScene().getMapSymbol() + " ");
                } else {
                    this.console.print(" ?? ");
                }
            }
            this.console.print("\n");
        }

    }

    private void firstTask() {
        double numOfCoins = game.getPlayer().getCoin();
        if (numOfCoins >= 50) {
            Task1View task1 = new Task1View();
            task1.display();
        }
        else {
            this.console.print("You only have " + numOfCoins + " coins. Come back when you have 50 or more coins!\n");
        }
    }

    private void secondTask() {
        double numOfCoins = game.getPlayer().getCoin();
        if (numOfCoins >= 50) {
            Task2View task2 = new Task2View();
            task2.display();
        }
        else {
            this.console.print("You only have " + numOfCoins + " coins. Come back when you have 50 or more coins!\n");
        }
    }

    private void thirdTask() {
        double numOfCoins = game.getPlayer().getCoin();
        
        if (numOfCoins >= 50) {
            Task3View task3 = new Task3View();
            task3.display();
        } else {
            this.console.print("You only have " + numOfCoins + " coins. Come back when you have 50 or more coins!\n");
        }
    }
    
    private void trivialTask() {
        TrivialTaskView trivialTask = new TrivialTaskView();
        trivialTask.display();
    }

    private static void moveToCurrentLocation() {

        //not needed use MovetoNewlocation
    }

    private void moveToNewLocation() {
        //get input for coordinates and pass to contol
        
        
        try {
            this.console.println("Please enter the row where you would like to go: ");
            
            String row = this.getInput();
            int x = Integer.parseInt(row);
            
            this.console.println("Please enter the column where you would like to go: ");
           
            String col = this.getInput();
            int y = Integer.parseInt(col);
           
            GameControl.moveToLocation(x, y);
            
            Map map = game.getMap();
            Location[][] locations = map.getLocations();

            // if the location has an obstacle, put a math question
            if (locations[y - 1][x - 1].hasObstacle()) {  
                trivialTask();
                
                if (locations[y - 1][x - 1].hasItem()) {
                    this.console.println("You have collected a" + locations[y - 1][x - 1].getItem().getName() + "\n");
                    InventoryControl ic = new InventoryControl();
                     ic.addItemToPlayer(locations[y - 1][x - 1].getItem());
                }
            // item collected!
            } else {
                this.console.println("No obstacles found. You have collected 10 coins!");
                InventoryControl ic = new InventoryControl();
                ic.addCoinsToPlayer(10);
            }
        
        } catch (MapControlException me) {
            ErrorView.display(this.getClass().getName(), "Error reading Input: " + me.getMessage());
        }
        

    }

    private void viewNumOfCoinsCollected() {
        double numOfCoins = game.getPlayer().getCoin();
        this.console.println("\nYou currently have " + numOfCoins + " coins.\n");
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
            if (item.isHasItem()) {
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

    private void viewCurrentLocation() {
        
        Player player = Hogwarts.getCurrentGame().getPlayer();
        int y, x;
        
        y = player.getCol();
        x = player.getRow();
        
        this.console.println("\nPlayer's Current Location: (" + (x + 1) + ", " + (y + 1) + ")");
        
    }

    private void numOfCoinsNeeded() {
        this.console.println("\n******************************************\n"
                        +"\n You need 50 coins to enter the first task."
                        +"\n You need 50 coins to enter the second task."
                        +"\n You need 60 coins to enter the thrid task."
                              +"\n******************************************\n");
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
        for (House house : houses) {
            this.console.println(house);
        }
    }

    private void viewCharacters() {
        this.console.println("\n\nEnter the file path for the file where "
                + "the character list is to be saved");
        String filePath = this.getInput();

        Character[] characters = Character.values();
        try { //(PrintWriter out = new PrintWriter(Character.values()){

            this.console.println("\n\n            Character Report          ");
            this.console.printf("%n%-20s%20s", " Character", "Discription");
            this.console.printf("%n%-20s%20s", "----------", "-----------");

            for (Character character : characters) {
                this.console.printf("%n%-20s%20s", character, character.getDescription());

            }
            GameControl.saveCharacterList(characters, filePath);
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading Input: " + e.getMessage());
        }
    }

    String prompt() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a file path where the report is to be printed: ");
        String filepath = reader.nextLine();

        return filepath;
    }

    private void exportFile(String filepath) {

        Location[][] locations = game.getMap().getLocations();

        // get size info of the map
        double numCol = game.getMap().getColumnCount();
        double numRow = game.getMap().getRowCount();

        Scene[] scenes = new Scene[25];

        int count = 0;

        try (PrintWriter out = new PrintWriter(filepath)) {
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

        console.print("\nYour file has been successfully saved!\n");
    }
}
