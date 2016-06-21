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
 * @author Jebean
 */
public class Task3View extends View {
    
   //Random rand = new Random();
    private double randOne;
    private double randTwo;
    private double randThree;
    private double answer;
    //private String input;

    public Task3View() {
        super("\nPlease Enter Your Answer");
        randOne = GameControl.randNum();
        randTwo = GameControl.randNum();
        randThree = GameControl.randNum();
        System.out.println("\n Your chalange in this task is to "
                + "\n calculate the area of a trapezoid"
                + "\n that has a base of " + randOne + " and another base of"
                + "\n  " + randTwo + "and a height of" + randThree + ".");
    }

    
    @Override
    public boolean doAction(String value) {

        answer = TaskControl.calcAreaOfTrapezoid(randOne, randTwo, randThree);
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
  

