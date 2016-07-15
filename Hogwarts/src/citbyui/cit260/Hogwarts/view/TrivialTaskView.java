/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

import byui.cit260.Hogwarts.control.GameControl;
import byui.cit260.Hogwarts.control.InventoryControl;
import byui.cit260.Hogwarts.control.TaskControl;
import byui.cit260.Hogwarts.model.Game;
import hogwarts.Hogwarts;

/**
 *
 * @author Bit
 */
public class TrivialTaskView extends View {

    private int randOne;
    private int randTwo;
    private int answer;
    private Game game;
    
    public TrivialTaskView() {
        super("\nPlease Enter Your Answer: ");
        randOne = GameControl.randNum();
        randTwo = GameControl.randNum();

        this.console.println("\n What is " + randOne + " + " + randTwo + "? ");
        
        game = Hogwarts.getCurrentGame();
    }
    
    @Override
    public boolean doAction(String value) {
      
        value = value.toUpperCase();

        switch (value) {
            case "Q": // house name griffindor
                this.Exit();
                break;
        }

        try {
            TaskControl taskControl = new TaskControl();

            answer = taskControl.calcTwoNumbers(randOne, randTwo);
            // parse and convert number from text to a double
            double input = Integer.parseInt(value);
            if (input == answer) {
                this.console.println("\nThat is correct!\n");
                InventoryControl ic = new InventoryControl();
                ic.addCoinsToPlayer(10);
                this.console.println("You have collected 10 coins.\n");
                return true;
            } else {
                this.console.println("\nTry Again! Enter 'Q' to quit!\n");
            }
        } catch (NumberFormatException nf) {

            ErrorView.display(this.getClass().getName(), nf.getMessage()
                    + "You must enter a valid number."
                    + " Try again or enter Q to exit.");
        }
        return false;
    }
    
    private void Exit() {
        GameMenuView gameMenuView = new GameMenuView();
        // Display the main menu view
        gameMenuView.display();
    }
}
