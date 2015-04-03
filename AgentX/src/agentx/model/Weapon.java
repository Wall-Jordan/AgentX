/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.model;

import java.io.Serializable;

/**
 *
 * @author Chris
 */
public class Weapon implements Serializable {
    
    
    private String name;
    private int damage;

    public Weapon() {
    }

    public Weapon(String name, int damage) {
        this.damage = damage;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int quantity) {
        this.damage = quantity;
    }

}
