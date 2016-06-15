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
public class HelpMenuView {
    private String menu;

    public HelpMenuView() {
        this.menu = "\n"
                  + "\n-------------------------------------"
                  + "\n| Getting Help                      |"
                  + "\nW - What is the goal of the game?"
                  + "\nH - How to move"
                  + "\nG - Game Menu"
                  + "\nM - Main Menu"
                  + "\nQ - Quit"
                  + "\n-------------------------------------";
        System.out.println(menu);
    }
     
    void displayHelpMenuView() {
        
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
            case "W": // What is the goal of the game?
                this.goalOfTheGame();
                break;
            case "H": // How to move
                this.howToMove();
                break;
            case "G": // game menu
                this.startGameMenu();
                break;
            case "M": // main menu
                this.startNewGame();
                break;
            case "Q": // quit
                this.Exit();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void goalOfTheGame() {
        System.out.println("*** goalOfTheGame function called ***");
    }
    
    private void howToMove() {
        System.out.println("*** howToMove function called ***");
    }
    // game menu view? //
    private void startGameMenu() {
      GameMenuView gameMenuView = new GameMenuView();
      gameMenuView.displayGameMenuView();
    }

    private void startNewGame() {
                // create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.display(); 
    }

    private void Exit() {
        System.out.println("*** Exit function called ***");
    }
   
    
}
