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
    
    private int ordinalValue;
    private String name;

    public Item() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private boolean hasItem = false;
    
    public Item(int ordinalValue) {
        this.ordinalValue = ordinalValue;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.ordinalValue;
        hash = 59 * hash + (this.hasItem ? 1 : 0);
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
        if (this.ordinalValue != other.ordinalValue) {
            return false;
        }
        if (this.hasItem != other.hasItem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "ordinalValue=" + ordinalValue + ", hasItem=" + hasItem + '}';
    }

    public int getOrdinalValue() {
        return ordinalValue;
    }

    public void setOrdinalValue(int ordinalValue) {
        this.ordinalValue = ordinalValue;
    }

    public boolean isHasItem() {
        return hasItem;
    }

    public void setHasItem(boolean hasItem) {
        this.hasItem = hasItem;
    }
    
}

