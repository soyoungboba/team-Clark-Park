/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

import byui.cit260.Hogwarts.control.GameControl;
import byui.cit260.Hogwarts.model.House;
import java.util.Scanner;

/**
 *
 * @author Cody
 */
public class HouseMenuVeiw {
    private String menu;
    private String houseName;
    public HouseMenuVeiw() {
        this.menu = "\n"
                  + "\n-------------------------------------"
                  + "\n| Choose Your House                      |"
                  + "\nG - Gryffindor"
                  + "\nS - Slytherin"
                  + "\nH - Hufflepuff"
                  + "\nR - Ravenclaw"
                  + "\nQ - Quit"
                  + "\n-------------------------------------";
        //System.out.println(menu);
    }
    
    void displayHouseMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // promp for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("e")) // user wants to exit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }   
    //static void chooseHouse(House houseName) {
        //System.out.println("*** chooseHouse function called ***"); //To change body of generated methods, choose Tools | Templates.
    //}

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println(menu);
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
            case "G": // house name griffindor
                this.gryffindor();
                break;
            case "S": // house name slytherin
                this.slytherin();
                break;
            case "H": // house name hufflepuff 
                this.hufflepuff();
                break;
            case "R": // house name Ravenclaw
                this.ravenclaw();
                break;
            case "Q": // Main menu
                this.Exit();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void Exit() {
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }
    private void gryffindor() {
        GameControl.saveHouse(houseName);
    }

    private void slytherin() {
        System.out.println("*** slytherin function called ***");    
    }
    private void hufflepuff() {
        System.out.println("*** hufflepuff function called ***");
    }

    private void ravenclaw() {
        System.out.println("*** ravenclaw function called ***");
    }
    
    
}
