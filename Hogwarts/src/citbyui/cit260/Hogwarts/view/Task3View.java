/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

import byui.cit260.Hogwarts.control.GameControl;
import byui.cit260.Hogwarts.control.TaskControl;
import byui.cit260.Hogwarts.model.Game;
import hogwarts.Hogwarts;
import java.util.Random;

/**
 *
 * @author Jebean
 */
public class Task3View extends View {

    //Random rand = new Random();
    private double randOne;
    private double randTwo;
    private double randThree;
    private double answer;
    private Game game;

    public Task3View() {
        super("\nPlease Enter Your Answer");
        randOne = GameControl.randNum();
        randTwo = GameControl.randNum();
        randThree = GameControl.randNum();
        this.console.println("\n Your chalange in this task is to "
                + "\n calculate the area of a trapezoid"
                + "\n that has a base of " + randOne + " and another base of"
                + "\n  " + randTwo + "and a height of" + randThree + ".");
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

            answer = taskControl.calcAreaOfTrapezoid(randOne, randTwo, randThree);
            // parse and convert number from text to a double
            double input = Double.parseDouble(value);
            if (input == answer) {
                this.console.println("That is correct!");
                game.getPlayer().setCoin(10.0);
                this.console.println("You have collected 10 coins.");
                return true;
            } else {
                this.console.println("try again!");
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
