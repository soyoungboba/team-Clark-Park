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
public class HouseMenuView extends View{
    
    private String houseName;
    public HouseMenuView() {
         super("\n"
                  + "\n-------------------------------------"
                  + "\n| Choose Your House                 |"
                  + "\nG - Gryffindor"
                  + "\nS - Slytherin"
                  + "\nH - Hufflepuff"
                  + "\nR - Ravenclaw"
                  + "\nQ - Quit"
                  + "\n-------------------------------------");
        
    }
    



    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
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
        return true;
    }

    //private void Exit() {
        //MainMenuView mainMenuView = new MainMenuView();        
        // Display the main menu view
        //mainMenuView.displayMainMenuView();
    
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
    private void Exit() {
        MainMenuView mainMenuView = new MainMenuView();        
        // Display the main menu view
        mainMenuView.display();
    }
}
