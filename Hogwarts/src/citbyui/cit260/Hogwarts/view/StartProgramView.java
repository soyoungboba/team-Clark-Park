/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

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
    
}
