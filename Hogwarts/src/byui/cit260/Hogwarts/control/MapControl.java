/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.control;
import byui.cit260.Hogwarts.model.Map;
import byui.cit260.Hogwarts.model.Player;
import hogwarts.Hogwarts;
/**
 *
 * @author boba
 */
public class MapControl {
    public static Map createMap() throws MapControlException {
        //create the map
        Map map = null;
        
        System.out.println("\n*** createMap() called ***");
        
        return map;
    }

    static void moveCharactersToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class MapControlException extends Exception {

        public MapControlException() {
        }
    }
}
