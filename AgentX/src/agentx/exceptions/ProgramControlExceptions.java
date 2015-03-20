/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.exceptions;

/**
 *
 * @author matiasmikkola
 */
public class ProgramControlExceptions extends Exception{

    public ProgramControlExceptions() {
    }

    public ProgramControlExceptions(String message) {
        super(message);
    }

    public ProgramControlExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public ProgramControlExceptions(Throwable cause) {
        super(cause);
    }

    public ProgramControlExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
