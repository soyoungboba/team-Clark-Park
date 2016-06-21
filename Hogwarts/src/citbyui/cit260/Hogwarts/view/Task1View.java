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
        super("\nPlease Enter Your Answer");
        randOne = GameControl.randNum();
        randTwo = GameControl.randNum();
        System.out.println("\n Your challenge in this task is to "
                + "\n calculate the area of a triangle"
                + "\n that has a base of " + randOne + " and the height"
                + "\n of " + randTwo + ".");
    }

    @Override
    public boolean doAction(String value) {

        answer = TaskControl.calcAreaOfTriangle(randOne, randTwo);
        double input = Double.parseDouble(value);
        if (input == answer) {
            System.out.println("That is correct");
        } else {
            System.out.println("try again");
        }
        return true;
    }
    //public int randOne;
    //private void randNum() {
    //GameControl.randNum(randOne);

}