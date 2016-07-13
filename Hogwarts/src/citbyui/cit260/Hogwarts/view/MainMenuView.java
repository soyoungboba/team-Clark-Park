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
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n-------------------------------------"
                + "\n|           Main Menu               |"
                + "\nN - Start New Game"
                + "\nR - Restart Existing Game"
                + "\nS - Save Game"
                + "\nH - Get Help How To Play The Game"
                + "\nE - Exit"
                + "\n-------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "R": // restart game
                this.startExistingGame();
                break;
            case "S": // save game
                this.saveGame();
                break;
            case "H": // get help 
                this.GetHelpHowToPlayTheGame();
                break;
            case "E": // exit game
                this.Exit();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid selection. Try again.");
                break;
        }
        return false;
    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(Hogwarts.getPlayer());
        //choose house
        //HouseMenuVeiw.chooseHouse(Hogwarts.getHouseName());
        HouseMenuView houseMenu = new HouseMenuView();
        houseMenu.display();

        CharacterMenuView characterMenuView = new CharacterMenuView();
        characterMenuView.display();

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();

        /*
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
         */
    }

    private void startExistingGame() {
        this.console.println("\n\n enter the file path for file where the game"
                            + "is to be saved.");
        
        String filePath = this.getInput();
        try {
            //start asaved game
            GameControl.getSavedGame(filePath);
            } catch (Exception ex) {
                ErrorView.display("MainMenuView", ex.getMessage());
                
            }
            this.console.println("Welcome back" + Hogwarts.getCurrentGame().getPlayer().getName());
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        
    }

    private void GetHelpHowToPlayTheGame() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where the game "
                + "is to be saved.");
        String filePath = this.getInput();

        try {
            GameControl.saveGame(Hogwarts.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    //I'm working on it. 7/11/2016
    private void Exit() {
       
        this.console.println("\n\nDo you want to save game?");
        
       /*String answer;
       boolean yn;

       System.out.println("y/n");
while (true) {
  answer = in.nextLine().trim().toLowerCase();
  if (answer.equals("y")) {
    yn = true;
    break;
  } else if (answer.equals("n")) {
    yn = false;
    break;
  } else {
     System.out.println("Sorry, I didn't catch that. Please answer y/n");
  }
}
        /*this.console.println("\n\nEnter the file path for file where the game "
                + "is to be saved.");
        String filePath = this.getInput();
        
        /*value = value.toUpperCase();
        
        switch (value) {
            case "Q": // house name griffindor
                this.Exit();
                break; 
        }
        
         if (value== "Yes") {
            String filePath = this.getInput();
        } else {
            this.console.println("Try again!");
        } 
        } catch (NumberFormatException nf) {
        ErrorView.display(this.getClass().getName(), nf.getMessage()
                        + "You must enter a valid number."
                        + " Try again or enter Q to exit.");
        }
        return false; 
        */
    }
}
