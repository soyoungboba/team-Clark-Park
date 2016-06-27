/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.model;
import java.io.Serializable;
import java.util.Arrays;
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
      this.noOfRows = noOfRows;
      this.noOfColumns = noOfColumns;
      
      this.locations = new Location[noOfRows][noOfColumns];
      for (int row = 0; row < noOfRows; row++){
          for(int column = 0; column < noOfColumns; column++){
              Location location = new Location();
              location.setColumn(column);
              location.setRow(row);
              location.setVisited(false);
              locations[row][column] = location;
          }
      }
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
}
