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
public class StartProgramView extends View {
    private String promptMessage;
    public StartProgramView() {
    
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
    }

    private void displayBanner() {
       
      this.console.println(
        "\n*****************************************************"
       +"\n*                                                   *"
       +"\n* Welcome to Hogwarts! This is the game of problem  *" 
       +"\n* solving. Your goal is to win Harry Potter         *"
       +"\n* tournament. In order to complete the game, you    *"    
       +"\n* will have to collect coins which will be required *"
       +"\n* to unlock and succefully complete the tasks.      *"
       +"\n* Tools are optional to collect that can be useful  *"
       +"\n* to complete the tasks. If you succefully complete *"
       +"\n* all three tasks, you officially win the           *"
       +"\n* Quad-Wizard tournament.                           *"
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
        
        Scanner keyboard = new Scanner(this.keyboard);
        boolean valid = false; // initialize to not valid
        String value = null; 
        try{
        while (!valid) { // loop while an invalid value is enter
           this.console.println("\n" + this.promptMessage);
            
            value = this.keyboard.readLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                this.console.println("\nInvalid value. Value can not be blank.");
                continue;
            }
            
            break;
            // end the loop
        }
        }catch (Exception te){
               this.console.println(te.getMessage());
        }
        return value; // return the value entered
    }
@Override
    public boolean doAction(String playerName) {
       
        if (playerName.length() <2) {
            this.console.println("\nInvalid players name:"
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
            this.console.println(me.getMessage());
            return false;
        }
        
    }
    private void displayNextView(Player player) {
        this.console.println("\n======================================="
                          +"\n Welcome to the game " + player.getName()
                          +"\n We hope you have a lot of fun!" 
                          +"\n========================================"
                          );
        
       MainMenuView mainMenuView = new MainMenuView();
                
       mainMenuView.display();
    }
}