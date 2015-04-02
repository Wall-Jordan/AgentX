/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.model;

import java.io.Serializable;

/**
 *
 * @author Jordan
 */
public class Boss implements Serializable {

    private String bossName;
    private double damage;
    private int y;
    private int x;
    private int health;

    public Boss() {
    }

    public Boss(String bossName, double damage, int health) {
        this.bossName = bossName;
        this.damage = damage;
        this.health = health;
    }

    public Boss(String bossName, double damage, int y, int x) {
        this.bossName = bossName;
        this.damage = damage;
        this.y = y;
        this.x = x;
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int[] getBossDamage() {
        int[] bossDamage = new int[3];
        bossDamage[0] = 1;
        bossDamage[1] = 2;
        bossDamage[2] = 4;

        return bossDamage;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    
    @Override
    public String toString() {
        return "Boss{" + "damage=" + damage + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.damage) ^ (Double.doubleToLongBits(this.damage) >>> 32));
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
        final Boss other = (Boss) obj;
        if (Double.doubleToLongBits(this.damage) != Double.doubleToLongBits(other.damage)) {
            return false;
        }
        return true;
    }

}
