/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author boba
 */
public enum Character implements Serializable{
    
    Harry("Gryffindor student, Gryffindor Quidditch Seeker and captain, "
        + "leader of Dumbledore's Army."),
    Hermione("asdf."),
    Ron("asdf."),
    Cedric("Asdf,"),
    Cho("asdf."),
    Luna("asdf."),
    Draco("asdf."),
    Derrick("asdf.");
    
    
    //private String name;
    private final String description;
    private final Point coordinates;
    
    

    Character(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
*/
    public String getDescription() {
        return description;
    }

    /*public void setDescription(String description) {
        this.description = description;
    }*/

    public Point getCoordinates() {
        return coordinates;
    }

    /*public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }*/

    /*@Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + Objects.hashCode(this.coordinates);
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }*/

    @Override
    public String toString() {
        return "Character{" + "description= " + description + " coordinates=" + coordinates + '}';
    }
}
