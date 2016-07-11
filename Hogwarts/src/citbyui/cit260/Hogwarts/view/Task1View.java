/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

import byui.cit260.Hogwarts.control.GameControl;
import byui.cit260.Hogwarts.control.TaskControl;
import java.util.Random;

/**
 *
 * @author Cody
 */
public class Task1View extends View {

    //Random rand = new Random();
    private double randOne;
    private double randTwo;
    private double answer;
    //private String input;

    public Task1View() {
        super("\nPlease Enter Your Answer:");
        randOne = GameControl.randNum();
        randTwo = GameControl.randNum();
        this.console.println("\n Your challenge in this task is to "
                + "\n calculate the area of a triangle"
                + "\n that has a base of " + randOne + " and the height"
                + "\n of " + randTwo + ".");
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
            answer = TaskControl.calcAreaOfTriangle(randOne, randTwo);
            // parse and convert number from text to a double
            double input = Double.parseDouble(value);
            if (input == answer) {
                this.console.println("That is correct");
            } else {
                this.console.println("try again");
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
