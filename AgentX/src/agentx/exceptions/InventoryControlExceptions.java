/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.exceptions;

/**
 *
 * @author Chris
 */
public class InventoryControlExceptions extends Exception{

    public InventoryControlExceptions() {
    }

    public InventoryControlExceptions(String message) {
        super(message);
    }

    public InventoryControlExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public InventoryControlExceptions(Throwable cause) {
        super(cause);
    }

    public InventoryControlExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
