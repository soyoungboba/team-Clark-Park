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
public class Player implements Serializable{
    
    private String name;
    private Double coin;
    private String house;
    private String character;
    private int row;
    private int col;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.coin);
        hash = 83 * hash + Objects.hashCode(this.house);
        hash = 83 * hash + Objects.hashCode(this.character);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.house, other.house)) {
            return false;
        }
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        if (!Objects.equals(this.coin, other.coin)) {
            return false;
        }
        return true;
    }
    

    public String getHouse() {
        return house;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public void setHouse(String house) {
        this.house = house;
    }
    
    public Double getCoin() {
        return coin;
    }

    public void setCoin(Double coin) {
        this.coin = coin;
    }

    public Player() { 
        coin = 0.0;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
  
}
