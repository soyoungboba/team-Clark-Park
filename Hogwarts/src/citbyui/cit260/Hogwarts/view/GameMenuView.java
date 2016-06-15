/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;
import byui.cit260.Hogwarts.control.GameControl; //needed?//
import hogwarts.Hogwarts;
import java.util.Scanner;

/**
 *
 * @author boba
 */
public class GameMenuView {
    private String menu;
    
    public GameMenuView() {
      displayMenu();  
    }
    public void displayMenu() {
        
        this.menu = "\n"
                  + "\n------------------------------------------"
                  + "\n| Game Menu                              |"
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
                  + "\n------------------------------------------";
        System.out.println(menu);
    }
    
    public void displayGameMenuView() {
    
        boolean done = false; // set flag to not done
        do {
            // promp for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("")) // user wants to exit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + "Enter menu option:");
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered    
    }
    
    private boolean doAction(String choice) {
         choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
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
        System.out.println("*** firstTask function called ***");
    }

    private void secondTask() {
        System.out.println("*** secondTask function called ***");
    }

    private void thirdTask() {
        System.out.println("*** thirdTask function called ***");
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
        System.out.println("*** viewListOfToolsAcquired function called ***");
    }

    private void numOfCoinsNeeded() {
        System.out.println("*** numOfCoinsNeeded function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void HelpMenuView() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }

    private void MainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
           
}

    
