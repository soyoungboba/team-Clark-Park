/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

import byui.cit260.Hogwarts.control.GameControl;
import byui.cit260.Hogwarts.model.Player;
import citbyui.cit260.Hogwarts.exceptions.MapControlException;
import java.util.Scanner;

/**
 *
 * @author boba
 */
public class StartProgramView {
    private String promptMessage;
    public StartProgramView() {
    
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
    }

    private void displayBanner() {
       
      System.out.println(
        "\n*****************************************************"
       +"\n*                                                   *"
       +"\n*Welcome to Hogwarts! This is the game of problem   *" 
       +"\n*solving. Your goal is to win Harry Porter          *"
       +"\n*tournament. In order to complete the game, you     *"    
       +"\n*will have to collect coins which will be required  *"
       +"\n*will be required to unlock and succefully          *"
       +"\n*complete the tasks. Tools are optional to collect  *"
       +"\n*that can be useful to complete the tasks.          *"
       +"\n*if you succefully complete all three tasks, you    *"
       +"\n*officially win the Quad-Wizard tournament.         *"
       +"\n*****************************************************"
       );
      
    }

    public void displayStartProgramView() {
        
        boolean done = false;
        do {
            String playerName = this.getPlayerName();
            if (playerName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playerName);
            
        } while (!done);
        
    }

    private String getPlayerName() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String playerName) {
       
        if (playerName.length() <2) {
            System.out.println("\nInvalid players name:"
                    + "The name must be greater than one character in length");
            return false;
            // display customized welcome message
            // display mainMenuView
            
        }
        
        try{
        Player player = GameControl.createPlayer(playerName);
        this.displayNextView(player);
        return true;
        }catch(MapControlException me) {
            System.out.println(me.getMessage());
            return false;
        }
        //if (player == null) {
            //System.out.println("\nError creating the player.");
            
        //}
    
        
    }
    private void displayNextView(Player player) {
        System.out.println("\n======================================="
                          +"\n Welcome to the game " + player.getName()
                          +"\n We hope you have a lot of fun!" 
                          +"\n========================================"
                          );
        
       MainMenuView mainMenuView = new MainMenuView();
                
       mainMenuView.display();
    }
}
