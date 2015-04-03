/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.model;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author matiasmikkola
 */
public class Location implements Serializable {
    private boolean visited;
    private boolean active;
    private double fuel;
    private boolean complete;

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

    public Location(boolean visited, boolean active, double fuel, boolean complete) {
        this.visited = visited;
        this.active = active;
        this.fuel = fuel;
        this.complete = complete;
    }

    public Location() {
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
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
