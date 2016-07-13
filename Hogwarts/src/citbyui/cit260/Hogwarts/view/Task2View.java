/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

import java.util.Random;
import byui.cit260.Hogwarts.control.GameControl;
import byui.cit260.Hogwarts.control.TaskControl;
import byui.cit260.Hogwarts.model.Game;


/**
 *
 * @author boba
 */
public class Task2View extends View {
    
    private double randOne;
    private double randTwo;
    private double randThree;
    private double answer;
    private Game game;
    
    public Task2View() {
        super("\nPlease Enter Your Answer:");
        randOne = GameControl.randNum();
        randTwo = GameControl.randNum();
        randThree = GameControl.randNum();
        this.console.println("\n-------------------------------------"
                          +"\n Your challenge in this taks is to"
                          +"\n calculate the volume of rectangle"
                          +"\n that has a width of " + randOne + ", height"
                          +"\n of " + randTwo + ", and length of " + randThree + "."
                          +"\n-------------------------------------");
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
             Double value2;
             TaskControl taskControl = new TaskControl();
        
        answer = taskControl.calcVolumeOfRectangle(randOne, randTwo, randThree);
        
            double input = Double.parseDouble(value);
            
        if (input== answer) {
            this.console.println("Correct!");
            game.getPlayer().setCoin(10.0);
            return true;
        } else {
            this.console.println("Try again!");
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