/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

import java.util.Scanner;

/**
 *
 * @author boba
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage; 
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        boolean done = false; // set flag to not done
        do {
            // promp for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("E")) // user wants to exit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done); 
    }
    
    @Override
    public String getInput() {
         
        Scanner keyboard = new Scanner(System.in); 
        boolean valid = false;  
        String value = null;
    
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.displayMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\n***You must enter a value***");
                continue;
            }
            
            break; // end the loop
        }
    
        return value; // return the value entered
        }
}
