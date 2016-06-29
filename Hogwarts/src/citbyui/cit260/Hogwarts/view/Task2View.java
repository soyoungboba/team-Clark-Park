/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

import java.util.Random;
import byui.cit260.Hogwarts.control.GameControl;
import byui.cit260.Hogwarts.control.TaskControl;


/**
 *
 * @author boba
 */
public class Task2View extends View {
    
    private double randOne;
    private double randTwo;
    private double randThree;
    private double answer;
    
    public Task2View() {
        super("\nPlease Enter Your Answer:");
        randOne = GameControl.randNum();
        randTwo = GameControl.randNum();
        randThree = GameControl.randNum();
        System.out.println("\n-------------------------------------"
                          +"\n Your challenge in this taks is to"
                          +"\n calculate the volume of rectangle"
                          +"\n that has a width of " + randOne + ", height"
                          +"\n of " + randTwo + ", and length of " + randThree + "."
                          +"\n-------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        TaskControl taskControl = new TaskControl();
        
        answer = taskControl.calcVolumeOfRectangle(randOne, randTwo, randThree);
        double input = Double.parseDouble(value);
        if (input== answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Try again!");
        }     
        return true; 
    }
}