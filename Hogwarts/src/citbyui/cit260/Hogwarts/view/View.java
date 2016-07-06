/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

import hogwarts.Hogwarts;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author boba
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage; 
    
    protected final BufferedReader keyboard = Hogwarts.getInFile();
    protected final PrintWriter console = Hogwarts.getOutFile();
    
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
        
        //Scanner keyboard = new Scanner(System.in); 
        boolean valid = false; 
        String selection = null;
        try {
        while (!valid) { 
    
            // get the value entered from the keyboard
            selection = keyboard.readLine();
            selection = selection.trim();
            
            if (selection.length() < 1) { // blank value entered
                System.out.println("You must enter a value.");
                continue;
            }
            break; 
        }
        } catch (Exception te) {    
        System.out.println("Error reading input: " + te.getMessage());
        }
    
        return selection; // return the name
    }       
}
