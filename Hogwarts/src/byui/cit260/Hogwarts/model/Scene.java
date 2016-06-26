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
public enum Scene implements Serializable{
    Office_of_Professor_McGonagall("."),
    Gryffindor_Dormitory("."),
    Chamber_of_Secrets(""),
    The_Green_Houses(""),
    Black_Lake(""),
    Classroom(""),
    Stairway(""),
    Library(""),
    Hut_of_Hagrid(""),
    Forbidden_Forest(""),
    Office_of_Dumbledore(""),
    Hallway(""),
    Great_Hall(""),
    Quidditch_Field(""),
    Lavatory_of_Girls(""),
    Hospital_Wing(""),
    Front_Walk(""),
    Room_of_Requirement(""),
    Office_of_Professor_Snape(""),
    Slytherin_Dormitory(""),
    Dungeon(""),
    Garden("");
    
    
    private String description;
    private boolean blockedLocation;
    private boolean displaySymbol;

    //public Scene() {
    //}

    Scene(String description) {
    this.description = description;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + (this.blockedLocation ? 1 : 0);
        hash = 59 * hash + (this.displaySymbol ? 1 : 0);
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
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", blockedLocation=" + blockedLocation + ", displaySymbol=" + displaySymbol + '}';
    }
    
    
}
