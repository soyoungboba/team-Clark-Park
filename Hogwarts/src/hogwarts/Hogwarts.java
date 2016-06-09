/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

import byui.cit260.Hogwarts.model.Player;
import byui.cit260.Hogwarts.model.House;
import byui.cit260.Hogwarts.model.Location;
import byui.cit260.Hogwarts.model.Scene;
import byui.cit260.Hogwarts.model.TaskScene;
import byui.cit260.Hogwarts.model.Character;
import byui.cit260.Hogwarts.model.Item;
import byui.cit260.Hogwarts.model.Map;
import byui.cit260.Hogwarts.model.Game;
import citbyui.cit260.Hogwarts.view.StartProgramView;

public class Hogwarts {
    
    private static Game currentGame = null;
    private static Player player = null;
    private static House houseName = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
}
    public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player) {
        Hogwarts.player = player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Hogwarts.currentGame = currentGame;
    }

    public static House getHouseName() {
        return houseName;
    }

    public static void setHouseName(House houseName) {
        Hogwarts.houseName = houseName;
    }

}