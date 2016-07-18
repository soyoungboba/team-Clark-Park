/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.model;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author boba
 */
public class Map implements Serializable{
    
    // class instance variables
    private double noOfRows;
    private double noOfColumns;
    private Location locations[][];

    public Location[][] getLocations() {
        return locations;
    }

    public Map() { 
    }
    
    public Map(int noOfRows, int noOfColumns){
      if (noOfRows < 1 || noOfColumns <1){
          System.out.println("The number of rows and columns must be > zero");
          return;
      }  
      
        int[] intArray = new int[6];

        Random randomGenerator = new Random();

        for (int idx = 0; idx < 6; idx++) {
          intArray[idx] = randomGenerator.nextInt(5);
        }

        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;

        this.locations = new Location[noOfRows][noOfColumns];

        for (int row = 0; row < noOfRows; row++) {
            for(int column = 0; column < noOfColumns; column++) {

                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                location.setObstacle(true);
                location.setHasItem(false);
                locations[row][column] = location;
            }
        }


        locations[intArray[0]][intArray[1]].hasObstacle(false);
        locations[intArray[2]][intArray[3]].hasObstacle(false);
        locations[intArray[4]][intArray[5]].hasObstacle(false);


        int[] randumNumbers = new int[8];
    Random randomGenerator2 = new Random();
        for (int i = 0; i < 8; i++) {
          randumNumbers[i] = randomGenerator2.nextInt(3);
        }
 
        
        
        Item[] items = new Item[ItemType.values().length];
        
        items[ItemType.Broomstick.ordinal()] = new Item();
       items[ItemType.Gillyweed.ordinal()] = new Item();
       items[ItemType.Invisibility_cloak.ordinal()] = new Item();
       items[ItemType.Wand.ordinal()] = new Item();

        items[ItemType.Broomstick.ordinal()].setName(ItemType.Broomstick.toString());
       items[ItemType.Gillyweed.ordinal()].setName(ItemType.Gillyweed.toString());
       items[ItemType.Invisibility_cloak.ordinal()].setName(ItemType.Invisibility_cloak.toString());
       items[ItemType.Wand.ordinal()].setName(ItemType.Wand.toString());

        locations[randumNumbers[0]][randumNumbers[1]].setItem(items[ItemType.Broomstick.ordinal()]);
       locations[randumNumbers[2]][randumNumbers[3]].setItem(items[ItemType.Gillyweed.ordinal()]);
      locations[randumNumbers[4]][randumNumbers[5]].setItem(items[ItemType.Invisibility_cloak.ordinal()]);
      locations[randumNumbers[6]][randumNumbers[7]].setItem(items[ItemType.Wand.ordinal()]);
        
       locations[randumNumbers[0]][randumNumbers[1]].setHasItem(true);
      locations[randumNumbers[2]][randumNumbers[3]].setHasItem(true);
      locations[randumNumbers[4]][randumNumbers[5]].setHasItem(true);
     locations[randumNumbers[6]][randumNumbers[7]].setHasItem(true);
              
    }

    
    
    @Override
    public String toString() {
        return "Map{" + "noOfRows=" + noOfRows + ", noOfColumns=" + noOfColumns + ", locations=" + locations + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.noOfRows) ^ (Double.doubleToLongBits(this.noOfRows) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.noOfColumns) ^ (Double.doubleToLongBits(this.noOfColumns) >>> 32));
        hash = 97 * hash + Arrays.deepHashCode(this.locations);
        return hash;
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.noOfRows) != Double.doubleToLongBits(other.noOfRows)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noOfColumns) != Double.doubleToLongBits(other.noOfColumns)) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

    public double getRowCount() {
        return noOfRows;
    }

    public void setRowCount(double rowCount) {
        this.noOfRows = rowCount;
    }

    public double getColumnCount() {
        return noOfColumns;
    }

    public void setColumnCount(double columnCount) {
        this.noOfColumns = columnCount;
    }

    public int getNoOfRows() {
        return (int) noOfRows;
    }

    public int getNoOfColumns() {
       return (int) noOfColumns; 
    }
}
