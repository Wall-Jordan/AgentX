/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.exceptions;

/**
 *
 * @author Jordan
 */
public class PuzzleControlExceptions extends Exception{

    public PuzzleControlExceptions() {
    }

    public PuzzleControlExceptions(String message) {
        super(message);
    }

    public PuzzleControlExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public PuzzleControlExceptions(Throwable cause) {
        super(cause);
    }

    public PuzzleControlExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
