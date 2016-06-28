/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;
import byui.cit260.Hogwarts.control.GameControl; //needed?//
import byui.cit260.Hogwarts.model.Game;
import byui.cit260.Hogwarts.model.Item;
import hogwarts.Hogwarts;
import java.util.Scanner;

/**
 *
 * @author boba
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
        super(      "\n"
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
                  + "\nC - Number of coins needed for each task"
                  + "\nG - Save game"
                  + "\nH - Help"
                  + "\nQ - Main menu"
                  + "\n------------------------------------------");
           }
    
    public boolean doAction(String value) {
         value = value.toUpperCase(); // convert choice to upper case
        
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
            case "L": // View current location
                this.moveToCurrentLocation();
                break;
            case "VC": // View number of coins collected 
                this.viewNumOfCoinsCollected();
                break;
            case "VT": // View list of tools acquired
                this.viewListOfToolsAcquired();
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
       System.out.println("*** viewMap function called ***");
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

    private void moveToNewLocation() {
        System.out.println("*** moveToNewLocation function called ***");
    }

    private void moveToCurrentLocation() {
        System.out.println("*** moveToCurrentLocation function called ***");
    }

    private void viewNumOfCoinsCollected() {
        System.out.println("*** viewNumOfCoinsCollected function called ***");
    }

    private void viewListOfToolsAcquired() {
        
        StringBuilder line;
        
        Game game = Hogwarts.getCurrentGame();
        Item[] items = game.getItem();
        
        System.out.println("\n            List of Items");
        line = new StringBuilder("                            ");
        line.insert(0, "Description");
        line.insert(30, "In Stock");
        System.out.println(line.toString());
        
        //for each inventory item
        for (Item item : items) {
        line = new StringBuilder("                              ");
        line.insert(0, item.getInventoryType());
        line.insert(23, item.getQuantityInStock());
        }
        
        //display
        System.out.println(line.toString());
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
}
