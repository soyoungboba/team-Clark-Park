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
 * @author Cody
 */
public class Scene implements Serializable{
    
    private String description;
    private boolean blockedLocation;
    private boolean displaySymbol;
    private String mapSymbol;

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }
    
    //public Scene() {
    //}

   public Scene() {
    
}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(boolean blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public boolean isDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(boolean displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public void setBlocked(boolean b) {
        //System.out.println("set blocked function called");   
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", blockedLocation=" + blockedLocation + ", displaySymbol=" + displaySymbol + ", mapSymbol=" + mapSymbol + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + (this.blockedLocation ? 1 : 0);
        hash = 89 * hash + (this.displaySymbol ? 1 : 0);
        hash = 89 * hash + Objects.hashCode(this.mapSymbol);
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
        final Scene other = (Scene) obj;
        if (this.blockedLocation != other.blockedLocation) {
            return false;
        }
        if (this.displaySymbol != other.displaySymbol) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        return true;
    }
    
    
    
}
