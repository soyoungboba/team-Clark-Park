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
public class HelpMenuView extends View {
   
    public HelpMenuView() {
        super( "\n"
             + "\n-------------------------------------"
             + "\n|           Getting Help            |"
             + "\nW - What is the goal of the game?"
             + "\nH - How to move"
             + "\nG - Game Menu"
             + "\nM - Main Menu"
             + "\nQ - Quit"
             + "\n-------------------------------------");
    }
    
@Override
public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert to all upper case
        
        switch (value) {
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
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid selection. Try again.");
                break;
        }
        return false;
    }

    private void goalOfTheGame() {
        this.console.println(
        "\n*****************************************************"
       +"\n* Your goal is to win Harry Potter tournament.      *"
       +"\n* In order to complete the game, you will have to   *"    
       +"\n* collect coins which will be required to unlock and*"
       +"\n* succefully complete the tasks. Tools are optional *"
       +"\n* to collect that can be useful to complete the     *"
       +"\n* tasks. If you succefully complete all three tasks,*"
       +"\n* you officially win the Quad-Wizard tournament.    *"
       +"\n*****************************************************"
       );
    }
    
    private void howToMove() {
        this.console.println("*** howToMove function called ***");
    }
    // game menu view? //
    private void startGameMenu() {
      GameMenuView gameMenuView = new GameMenuView();
      gameMenuView.display();
    }

    private void startNewGame() {
                // create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.display(); 
    }

    private void Exit() {
        this.console.println("*** Exit function called ***");
    }
}