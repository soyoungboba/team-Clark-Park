/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

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
        
        
        boolean done = false; // set flag to not done
        do {
            // promp for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("R")) // user wants to restart existing game
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
        
        
        boolean done = false; // set flag to not done
        do {
            // promp for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("H")) // user wants to get help how to play the game
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
        
        
        boolean done = false; // set flag to not done
        do {
            // promp for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("N")) // user wants to start new game
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }

    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() function called ***");
        return "N";
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "R": // create and start a new game
                this.startExistingGame();
                break;
            case "H": // create and start a new game
                this.GetHelpHowToPlayTheGame();
                break;
            case "E": // create and start a new game
                this.Exit();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        System.out.println("*** startNewGame function called ***");
    }

    private void startExistingGame() {
System.out.println("*** startExistingGame function called ***");
    }

    private void GetHelpHowToPlayTheGame() {
System.out.println("*** getHelpHowToPlayTheGame function called ***");
    }

    private void Exit() {
System.out.println("*** Exit function called ***");
    }
   
    
    
}
