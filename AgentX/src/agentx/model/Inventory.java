package agentx.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Chris
 */
public class Inventory implements Serializable {

    private int quantity;
    private int type;

    public Inventory() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Inventory{" + "quantity=" + quantity + ", type=" + type + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.quantity;
        hash = 97 * hash + this.type;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        return true;
    }

}
