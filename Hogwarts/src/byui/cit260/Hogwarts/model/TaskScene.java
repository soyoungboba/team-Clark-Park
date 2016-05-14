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
public class TaskScene implements Serializable{
    
    private double amountAvailable;
    private double resourcesNeeded;
    private String attribute;

    public TaskScene() {
    }

    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public double getResourcesNeeded() {
        return resourcesNeeded;
    }

    public void setResourcesNeeded(double resourcesNeeded) {
        this.resourcesNeeded = resourcesNeeded;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.amountAvailable) ^ (Double.doubleToLongBits(this.amountAvailable) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.resourcesNeeded) ^ (Double.doubleToLongBits(this.resourcesNeeded) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.attribute);
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
        final TaskScene other = (TaskScene) obj;
        if (Double.doubleToLongBits(this.amountAvailable) != Double.doubleToLongBits(other.amountAvailable)) {
            return false;
        }
        if (Double.doubleToLongBits(this.resourcesNeeded) != Double.doubleToLongBits(other.resourcesNeeded)) {
            return false;
        }
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TaskScene{" + "amountAvailable=" + amountAvailable + ", resourcesNeeded=" + resourcesNeeded + ", attribute=" + attribute + '}';
    }
    
    
    
}
