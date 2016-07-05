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
import citbyui.cit260.Hogwarts.view.HelpMenuView;
import citbyui.cit260.Hogwarts.view.MainMenuView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hogwarts {
    
    private static Game currentGame = null;
    private static Player player = null;
    private static House houseName = null;
    
    private static PrintWriter outFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Hogwarts.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Hogwarts.inFile = inFile;
    }
    private static BufferedReader inFile = null;
    
    public static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Hogwarts.logFile = logFile;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {   
        
        // open character stream files for end user input and output
        Hogwarts.inFile = 
                new BufferedReader(new InputStreamReader(System.in));
        
        Hogwarts.outFile = new PrintWriter(System.out, true);
        
        // create StartProgramView and start the program
        /*StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        return;*/
        
        // open log file
        String filePath = "log.txt";
        Hogwarts.logFile = new PrintWriter(filePath);

        } catch (Throwable te) {
            
            System.out.println("Exception: " + te.toString() +
                               "\nCause: " + te.getCause() +
                               "\nMessage: " + te.getMessage());
           
            te.printStackTrace();
        }  
        
        finally {
            try {
                if (Hogwarts.inFile != null)
                    Hogwarts.inFile.close();
                
                if (Hogwarts.outFile != null)
                    Hogwarts.outFile.close();
                
                if (Hogwarts.logFile != null)
                    Hogwarts.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
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

    public static PrintWriter getoutFile() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
