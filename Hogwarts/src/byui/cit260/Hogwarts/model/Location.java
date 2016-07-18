/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Cody
 */
public class Location implements Serializable{
   
    private double row;
    private double column;
    private boolean visited;
    private float amountRemaining;
    private Item item;
    private boolean hasItem;
    private Scene scene;
    private ArrayList<Character> character;
    private boolean hasObstacle;

    public void displayMathQuestion() {
        System.out.println("You have an opportunity to gain coins or a tool. Do you wish to continue? (y or n)");
        
        String input;
     
       Scanner scanIn = new Scanner(System.in);
       input = scanIn.nextLine();

       scanIn.close();
       
       if (input == "y") {
           System.out.println("What is 1 + 1?");
       }
    }
    public ArrayList<Character> getCharacter() {
        return character;
    }

    public void setCharacter(ArrayList<Character> character) {
        this.character = character;
    }

    public boolean hasObstacle() {
        return hasObstacle;
    }

    public void setObstacle(boolean hasObstacle) {
        this.hasObstacle = hasObstacle;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
    public Location() {
        hasObstacle = false;
    }

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public float getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(float amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public Item getItem() {
        return item;
    }
    
    public void setHasItem(boolean hasItem) {
        this.hasItem = hasItem;
    }

    public boolean hasItem() {
        return this.hasItem;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }

    void hasObstacle(boolean b) {
        System.out.println("obstacle function called");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (Float.floatToIntBits(this.amountRemaining) != Float.floatToIntBits(other.amountRemaining)) {
            return false;
        }
        if (this.hasObstacle != other.hasObstacle) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", amountRemaining=" + amountRemaining + ", scene=" + scene + ", character=" + character + ", hasObstacle=" + hasObstacle + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
        hash = 89 * hash + (this.visited ? 1 : 0);
        hash = 89 * hash + Float.floatToIntBits(this.amountRemaining);
        hash = 89 * hash + Objects.hashCode(this.scene);
        hash = 89 * hash + Objects.hashCode(this.character);
        hash = 89 * hash + (this.hasObstacle ? 1 : 0);
        return hash;
    }
    
    
}
