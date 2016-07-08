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
            + "\n| Main Menu                         |"
            + "\nN - Start New Game"
            + "\nR - Restart Existing Game"
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
            case "H": // get help 
                this.GetHelpHowToPlayTheGame();
                break;
            //case "E": // exit game
               // this.Exit();
               // break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
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
        this.console.println("*** startExistingGame function called ***");
    }

    private void GetHelpHowToPlayTheGame() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}

