/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.model;
import java.io.Serializable;
/**
 *
 * @author boba
 */
public class Game implements Serializable{
    
    // class instance variables
    private double startGame;
    private double endGame;
   
    private Player player;
    private Item[] item;
    private Map map;

    public Map getMap() {
        return new Map();
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

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.startGame) ^ (Double.doubleToLongBits(this.startGame) >>> 32));
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.endGame) ^ (Double.doubleToLongBits(this.endGame) >>> 32));
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
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "startGame=" + startGame + ", endGame=" + endGame + '}';
    }

    public void setPlayer(Player player) {
        System.out.println("\n*** called setPlayer() in Game ***");
    }

    public void setMap(Map map) {
        System.out.println("\n*** called setmap() in Game ***");
    }
    
    
    
}
