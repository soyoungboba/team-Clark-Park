/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.control;
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
        startingScene.setDescription(
                "Professor McGonagall's office."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Office_of_Professor_McGonagall.ordinal()] = startingScene; //starting scene
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Gryffindor Dormitory."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Gryffindor_Dormitory.ordinal()] = startingScene; //scene 2
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Chamber of Secrets."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Chamber_of_Secrets.ordinal()] = startingScene; //scene 3
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "The Green Houses."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.The_Green_Houses.ordinal()] = startingScene; //scene 4
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Black Lake."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Black_Lake.ordinal()] = startingScene; //scene 5
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Classroom."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Classroom.ordinal()] = startingScene; //scene 6
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Stairway."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Stairway.ordinal()] = startingScene; //scene 7
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Library."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
//        scenes[SceneType.Library.ordinal()] = startingScene; //scene 8
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Hagrid's Hut."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Hut_of_Hagrid.ordinal()] = startingScene; //scene 9
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Forbidden Forest."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Forbidden_Forest.ordinal()] = startingScene; //scene 10
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Dumbledore's Office."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Office_of_Dumbledore.ordinal()] = startingScene; //scene 11
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Hallway."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Hallway.ordinal()] = startingScene; //scene 12
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Great Hall."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Great_Hall.ordinal()] = startingScene; //scene 13
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Quidditch Field."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Quidditch_Field.ordinal()] = startingScene; //scene 14
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Forbidden Forest."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Forbidden_Forest.ordinal()] = startingScene; //scene 15
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Lavatory of girls."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Lavatory_of_Girls.ordinal()] = startingScene; //scene 16
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Hospital Wing."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Hospital_Wing.ordinal()] = startingScene; //scene 17
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Classroom."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Classroom.ordinal()] = startingScene; // scene 18
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Hallway."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Hallway.ordinal()] = startingScene; // scene 19
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Front Walk."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Front_Walk.ordinal()] = startingScene; //scene 20
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Room of Requiremente."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Room_of_Requirement.ordinal()] = startingScene; //scene 21
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Professor Snape's office."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Office_of_Professor_Snape.ordinal()] = startingScene; //scene 22
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Slytherin_Dormitory."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Slytherin_Dormitory.ordinal()] = startingScene; // scene 23
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Dungeon."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.Dungeon.ordinal()] = startingScene; // scene 24
        
        Scene finish = new Scene();
        startingScene.setDescription(
                "Congratulation! Well done."
        );
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.finish.ordinal()] = finish; 
        return scenes;
    }

    public static class MapControlException extends Exception {

        public MapControlException() {
        }
    }
}
