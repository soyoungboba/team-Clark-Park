/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

import byui.cit260.Hogwarts.control.GameControl;

/**
 *
 * @author boba
 */
public class CharacterMenuView extends View {

    private String characterName;
    public CharacterMenuView() {
        super("\n"
                + "\n"
                  + "\n------------------------------------------------------------------------------------"
                  + "\n| Choose Your Character                                                            |"
                  + "\nHR - HARRY: He's the bravest witch.                "
                  + "\nHM - HERMIONE: She's one of the brightest witches. "
                  + "\nR - RON: He's very loyal and a brilliant player of "
                         + "wizarding chess."
                  + "\nCE - CEDRIC: He is honest and hardworking.         "
                  + "\nCH - CHO: She is an excellent Quidditch player.    "
                  + "\nL - LUNA: Even though she is seen as an odd and "
                         + "weird person, she is quite clever."
                  + "\nD - DRACO: He comes from an ancient, wealthy "
                         + "wizarding family."
                  + "\n-----------------------------------------------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
    
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "HR": // house name griffindor
                this.saveCharacter("Harry");
                break;
            case "HM":
                this.saveCharacter("HERMIONE");
                break;
            case "R":
                this.saveCharacter("Ron");
                break;
            case "CE":
                this.saveCharacter("Cedric");
                break;
            case "CH":
                this.saveCharacter("Cho");
                break;
            case "L":
                this.saveCharacter("Luna");
                break;
            case "D":
                this.saveCharacter("Draco");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }
    private void saveCharacter(String charName){
        GameControl.saveCharacter(charName);
    }
    /*private void harry() {
        System.out.println("\n*** Harry function was called");
    }
    
    private void hermione() {
        System.out.println("\n*** Hermione function was called");
    }
    
    private void ron() {
        System.out.println("\n*** Ron function was called");
    }
    
    private void cedric() {
        System.out.println("\n*** Cedric function was called");
    }
    
    private void cho() {
        System.out.println("\n*** Cho function was called");
    }
    
    private void luna() {
        System.out.println("\n*** Luna function was called");
    }
    
    private void draco() {
        System.out.println("\n*** Luna function was called");
    }*/
}
