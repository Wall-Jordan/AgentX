/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author matiasmikkola
 */
public class Location implements Serializable {
    private Boolean visited;
    private Boolean active;
    private Object boss;
    private int puzzle;
    private String description;
    private double fuel;

    ArrayList<String> toDoList = new ArrayList<>();
    ArrayList<String> collectItems = new ArrayList<>();

    public void addToDoListItem(String value) {
        toDoList.add(value);
    }

    public void addCollectItem(String value) {
        collectItems.add(value);
    }

    public void removeToDoListItem(String value) {
        toDoList.remove(value);
    }

    public void removeCollectItem(String value) {
        collectItems.remove(value);
    }

    public Location(Boolean visited, Boolean active, Object boss, int puzzle, String description, double fuel) {
        this.visited = visited;
        this.active = active;
        this.boss = boss;
        this.puzzle = puzzle;
        this.description = description;
        this.fuel = fuel;
    }

    public Location() {
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Object getBoss() {
        return boss;
    }

    public void setBoss(Object boss) {
        this.boss = boss;
    }

    public int getPuzzle() {
        return puzzle;
    }

    public void setPuzzle(int puzzle) {
        this.puzzle = puzzle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public ArrayList<String> getToDoList() {
        return toDoList;
    }

    public void setToDoList(ArrayList<String> toDoList) {
        this.toDoList = toDoList;
    }

    public ArrayList<String> getCollectItems() {
        return collectItems;
    }

    public void setCollectItems(ArrayList<String> collectItems) {
        this.collectItems = collectItems;
    }

}
