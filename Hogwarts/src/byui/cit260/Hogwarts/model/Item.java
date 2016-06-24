/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author boba
 */
public enum Item implements Serializable{
    Wand("Tool", 50),
    Invisibility_cloak("Tool", 50),
    Broomstick("Tool", 50),
    Gillyweed("Tool", 50);
    
    // class instance variables
   
    private String inventoryType;
    private double quantityInStock;

Item(String inventoryType, double quantityInStock) {
    this.inventoryType = inventoryType;
    this.quantityInStock = quantityInStock;
}

  
    //created array(list) of items
    /*Item[] items = new Item[4];
    
    Item wand = new Item();
    wand.setDescription("Wand");
    wand.setInventoryType(inventoryType);
    wand.setQuantityInStock(0);
    items[Item.wand.ordinal()] = wand;
   
    
    Item invisibility cloak  = new Item();
    invisibility_cloak.setDescription("Invisibility cloak");
    invisibility_cloak.setInventoryType(inventoryType);
    items[1] = invisibility_cloak;
    
    Item  = new Item();
    broomstick.setDescription("Broomstick");
    broomstick.setInventoryType(inventoryType);
    broomstick.setQuantityInStock(0);
    items[2] = broomstick;
    
    Item  = new Item();
    gillyweed.setDescription("Gillyweed");
    gillyweed.setInventoryType(inventoryType);
    gillyweed.setQuantityInStock(0);
    items[3] = gillyweed;
}*/

    public String getInventoryType() {
        return inventoryType;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

   /* @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.inventoryType);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.quantityInStock) ^ (Double.doubleToLongBits(this.quantityInStock) >>> 32));
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
        final Item other = (Item) obj;
        if (Double.doubleToLongBits(this.quantityInStock) != Double.doubleToLongBits(other.quantityInStock)) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + '}';
    }
    */
}
