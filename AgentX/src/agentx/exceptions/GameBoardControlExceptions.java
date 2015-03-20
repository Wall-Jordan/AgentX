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
public class GameBoardControlExceptions extends Exception{

    public GameBoardControlExceptions() {
    }

    public GameBoardControlExceptions(String message) {
        super(message);
    }

    public GameBoardControlExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public GameBoardControlExceptions(Throwable cause) {
        super(cause);
    }

    public GameBoardControlExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
