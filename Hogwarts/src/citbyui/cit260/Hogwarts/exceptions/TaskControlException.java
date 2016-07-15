/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Hogwarts.exceptions;

/**
 *
 * @author boba
 */
public class TaskControlException extends Exception {

    public TaskControlException() {
    }

    public TaskControlException(String message) {
        super(message);
    }

    public TaskControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public TaskControlException(Throwable cause) {
        super(cause);
    }

    public TaskControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
