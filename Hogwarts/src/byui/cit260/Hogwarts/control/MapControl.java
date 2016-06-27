/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.control;
import byui.cit260.Hogwarts.model.Location;
import byui.cit260.Hogwarts.model.Map;
import byui.cit260.Hogwarts.model.Player;
import byui.cit260.Hogwarts.model.Scene;
import byui.cit260.Hogwarts.model.SceneType;
import hogwarts.Hogwarts;
/**
 *
 * @author boba
 */
public class MapControl {
    public static Map createMap() throws MapControlException {
        //create the map
        Map map = new Map(5,5);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }

    static void moveCharactersToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finish = new Scene();
        scenes[SceneType.finish.ordinal()] = finish;
        return scenes;
    }

   private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][]locations = map.getLocations();
        
        //start
        locations[0][0].setScene(scenes[SceneType.office,ordinal()]);
        locations[0][1].setScene(scenes[SceneType.office,ordinal()]);
        locations[0][2].setScene(scenes[SceneType.office,ordinal()]);
        locations[0][3].setScene(scenes[SceneType.office,ordinal()]);
        locations[0][4].setScene(scenes[SceneType.office,ordinal()]);
        locations[1][0].setScene(scenes[SceneType.office,ordinal()]);
        locations[1][1].setScene(scenes[SceneType.office,ordinal()]);
        locations[1][2].setScene(scenes[SceneType.office,ordinal()]);
        locations[1][3].setScene(scenes[SceneType.office,ordinal()]);
        locations[1][4].setScene(scenes[SceneType.office,ordinal()]);
        locations[2][0].setScene(scenes[SceneType.office,ordinal()]);
        locations[2][1].setScene(scenes[SceneType.office,ordinal()]);
        locations[2][2].setScene(scenes[SceneType.office,ordinal()]);
        locations[2][3].setScene(scenes[SceneType.office,ordinal()]);
        locations[2][4].setScene(scenes[SceneType.office,ordinal()]);
        locations[3][0].setScene(scenes[SceneType.office,ordinal()]);
        locations[3][1].setScene(scenes[SceneType.office,ordinal()]);
        locations[3][2].setScene(scenes[SceneType.office,ordinal()]);
        locations[3][3].setScene(scenes[SceneType.office,ordinal()]);
        locations[3][4].setScene(scenes[SceneType.office,ordinal()]);
        locations[4][0].setScene(scenes[SceneType.office,ordinal()]);
        locations[4][1].setScene(scenes[SceneType.office,ordinal()]);
        locations[4][2].setScene(scenes[SceneType.office,ordinal()]);
        locations[4][3].setScene(scenes[SceneType.office,ordinal()]);
        locations[4][4].setScene(scenes[SceneType.finish,ordinal()]);
    }
}
