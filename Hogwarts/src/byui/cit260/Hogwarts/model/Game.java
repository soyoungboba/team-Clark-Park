/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.model;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
/**
 *
 * @author boba
 */
public class Game implements Serializable{
    
    // class instance variables
    private double startGame;
    private double endGame;
   
    private Player player;

    public Player getPlayer() {
        return player;
    }
    private Item[] item;
    private Map map;

    public Map getMap() {
        return map;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    public Game() {
    }

    public double getStartGame() {
        return startGame;
    }

    public void setStartGame(double startGame) {
        this.startGame = startGame;
    }

    public double getEndGame() {
        return endGame;
    }

    public void setEndGame(double endGame) {
        this.endGame = endGame;
    }

    
    

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.startGame) ^ (Double.doubleToLongBits(this.startGame) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.endGame) ^ (Double.doubleToLongBits(this.endGame) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.player);
        hash = 59 * hash + Arrays.deepHashCode(this.item);
        hash = 59 * hash + Objects.hashCode(this.map);
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.startGame) != Double.doubleToLongBits(other.startGame)) {
            return false;
        }
        if (Double.doubleToLongBits(this.endGame) != Double.doubleToLongBits(other.endGame)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Arrays.deepEquals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "startGame=" + startGame + ", endGame=" + endGame + ", player=" + player + ", item=" + item + ", map=" + map + '}';
    }
    
    
    
}
