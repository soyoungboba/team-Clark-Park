/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

import hogwarts.Hogwarts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        String value;
        boolean done = false; // set flag to not done
        
        do {
            this.console.println(this.displayMessage);
            value = this.getInput();
            done = this.doAction(value);

        } while (!done);
    }

    @Override
    public String getInput() {

        Scanner keyboard = new Scanner(this.keyboard);
        boolean valid = false;
        String value = null;

        try {
            while (!valid) {
                value = this.keyboard.readLine();
                value = value.trim();

                if (value.length() < 1) { // value is blank
                    this.console.println("You must enter a value.");
                    continue;
                }

                break; // end the loop
            }
        } catch (IOException te) {
            this.console.println("Error reading input:" + te.getMessage());
        }

        return value; // return the name
    }
}