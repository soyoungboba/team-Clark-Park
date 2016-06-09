/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

import byui.cit260.Hogwarts.control.GameControl;
import hogwarts.Hogwarts;
import java.util.Scanner;

/**
 *
 * @author boba
 */
public class MainMenuView {

    private String menu;

    public MainMenuView() {
        this.menu = "\n"
                  + "\n-------------------------------------"
                  + "\n| Main Menu                         |"
                  + "\nN - Start New Game"
                  + "\nR - Restart Existing Game"
                  + "\nH - Get Help How To Play The Game"
                  + "\nE - Exit"
                  + "\n-------------------------------------";
        
        System.out.println(menu);
    }
     
    void displayMainMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // promp for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E")) // user wants to exit
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
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "R": // restart game
                this.startExistingGame();
                break;
            case "H": // get help 
                this.GetHelpHowToPlayTheGame();
                break;
            case "E": // exit game
                this.Exit();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
                // create a new game
        GameControl.createNewGame(Hogwarts.getPlayer());
        //choose house
        //HouseMenuVeiw.chooseHouse(Hogwarts.getHouseName());
        HouseMenuVeiw houseMenu = new HouseMenuVeiw();
        houseMenu.displayHouseMenuView();
        // display the game menu 
        //GameMenuView gameMenu = new GameMenuView();//
        //gameMenu.displayMenu();//
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void GetHelpHowToPlayTheGame() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }

    private void Exit() {
        System.out.println("*** Exit function called ***");
    }
}
