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
public class House implements Serializable{
    
    private String houseName;

    public House() {
    }
        

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.houseName);
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
        final House other = (House) obj;
        if (!Objects.equals(this.houseName, other.houseName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "House{" + "houseName=" + houseName + '}';
    }
    
    
}
