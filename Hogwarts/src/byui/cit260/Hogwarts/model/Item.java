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
public class Item implements Serializable{
    
    // class instance variables
    private String inventoryType;
    private double quantityInStock;

public static Item[] createItem() {

    //created array(list) of items
    Item[] item = new Item[3];
    
    Item wand = new Item();
    wand.setDescription("Wand");
    wand.setInventoryType(inventoryType);
    wand.setQuantityInStock(0);
    item[0] = wand;
    
    Item invisibility cloak  = new Item();
    invisibility_cloak.setDescription("Invisibility cloak");
    invisibility_cloak.setInventoryType(inventoryType);
    item[1] = invisibility_cloak;
    
    Item  = new Item();
    broomstick.setDescription("Broomstick");
    broomstick.setInventoryType(inventoryType);
    broomstick.setQuantityInStock(0);
    item[2] = broomstick;
    
    Item  = new Item();
    gillyweed.setDescription("Gillyweed");
    gillyweed.setInventoryType(inventoryType);
    gillyweed.setQuantityInStock(0);
    item[3] = gillyweed;
}

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Item() {
    }

    @Override
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
    
    
}
