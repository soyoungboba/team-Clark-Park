/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.view;

import hogwarts.Hogwarts;
import java.io.PrintWriter;

/**
 *
 * @author boba
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = Hogwarts.getOutFile();
    private static final PrintWriter logFile = Hogwarts.getLogFile();
    
    public static void display(String className, String errorMessage) {
        errorFile.println(
                    "----------------------------------------------------"
                   +"\n- ERROR - " + errorMessage
                   +"\n--------------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
}
