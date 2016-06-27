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
        
        Scene Gryffindor_Dormitory = new Scene();
        Gryffindor_Dormitory.setDescription(
                "Gryffindor Dormitory."
        );
        Gryffindor_Dormitory.setMapSymbol("");
        Gryffindor_Dormitory.setBlocked(false);
        scenes[SceneType.Gryffindor_Dormitory.ordinal()] = startingScene; //scene 2
        
        Scene Chamber_of_Secrets = new Scene();
        Chamber_of_Secrets.setDescription(
                "Chamber of Secrets."
        );
        Chamber_of_Secrets.setMapSymbol("");
        Chamber_of_Secrets.setBlocked(false);
        scenes[SceneType.Chamber_of_Secrets.ordinal()] = startingScene; //scene 3
        
        Scene The_Green_Houses = new Scene();
        The_Green_Houses.setDescription(
                "The Green Houses."
        );
        The_Green_Houses.setMapSymbol("");
        The_Green_Houses.setBlocked(false);
        scenes[SceneType.The_Green_Houses.ordinal()] = startingScene; //scene 4
        
        Scene Black_Lake = new Scene();
        Black_Lake.setDescription(
                "Black Lake."
        );
        Black_Lake.setMapSymbol("");
        Black_Lake.setBlocked(false);
        scenes[SceneType.Black_Lake.ordinal()] = startingScene; //scene 5 
        
        Scene Classroom = new Scene();
        Classroom.setDescription(
                "Classroom."
        );
        Classroom.setMapSymbol("");
        Classroom.setBlocked(false);
        scenes[SceneType.Classroom.ordinal()] = startingScene; //scene 6 and 18
        
        Scene Stairway = new Scene();
        Stairway.setDescription(
                "Stairway."
        );
        Stairway.setMapSymbol("");
        Stairway.setBlocked(false);
        scenes[SceneType.Stairway.ordinal()] = startingScene; //scene 7
        
        Scene Library = new Scene();
        Library.setDescription(
                "Library."
        );
        Library.setMapSymbol("");
        Library.setBlocked(false);
        scenes[SceneType.Library.ordinal()] = startingScene; //scene 8
        
        Scene Hut_of_Hagrid = new Scene();
        Hut_of_Hagrid.setDescription(
                "Hagrid's Hut."
        );
        Hut_of_Hagrid.setMapSymbol("");
        Hut_of_Hagrid.setBlocked(false);
        scenes[SceneType.Hut_of_Hagrid.ordinal()] = startingScene; //scene 9
        
        Scene Forbidden_Forest = new Scene();
        Forbidden_Forest.setDescription(
                "Forbidden Forest."
        );
        Forbidden_Forest.setMapSymbol("");
        Forbidden_Forest.setBlocked(false);
        scenes[SceneType.Forbidden_Forest.ordinal()] = startingScene; //scene 10 and 15
        
        Scene Office_of_Dumbledore = new Scene();
        Office_of_Dumbledore.setDescription(
                "Dumbledore's Office."
        );
        Office_of_Dumbledore.setMapSymbol("");
        Office_of_Dumbledore.setBlocked(false);
        scenes[SceneType.Office_of_Dumbledore.ordinal()] = startingScene; //scene 11
        
        Scene Hallway = new Scene();
        Hallway.setDescription(
                "Hallway."
        );
        Hallway.setMapSymbol("");
        Hallway.setBlocked(false);
        scenes[SceneType.Hallway.ordinal()] = startingScene; //scene 12 and 19
        
        Scene Great_Hall = new Scene();
        startingScene.setDescription(
                "Great Hall."
        );
        Great_Hall.setMapSymbol("");
        Great_Hall.setBlocked(false);
        scenes[SceneType.Great_Hall.ordinal()] = startingScene; //scene 13
        
        Scene Quidditch_Field = new Scene();
        Quidditch_Field.setDescription(
                "Quidditch Field."
        );
        Quidditch_Field.setMapSymbol("");
        Quidditch_Field.setBlocked(false);
        scenes[SceneType.Quidditch_Field.ordinal()] = startingScene; //scene 14
        
        /*Scene Forbidden_Forest = new Scene();
        Forbidden_Forest.setDescription(
                "Forbidden Forest."
        );
        Forbidden_Forest.setMapSymbol("");
        Forbidden_Forest.setBlocked(false);
        scenes[SceneType.Forbidden_Forest.ordinal()] = startingScene; //scene 15*/
        
        Scene Lavatory_of_Girls = new Scene();
        Lavatory_of_Girls.setDescription(
                "Lavatory of girls."
        );
        Lavatory_of_Girls.setMapSymbol("");
        Lavatory_of_Girls.setBlocked(false);
        scenes[SceneType.Lavatory_of_Girls.ordinal()] = startingScene; //scene 16
        
        Scene Hospital_Wing = new Scene();
        Hospital_Wing.setDescription(
                "Hospital Wing."
        );
        Hospital_Wing.setMapSymbol("");
        Hospital_Wing.setBlocked(false);
        scenes[SceneType.Hospital_Wing.ordinal()] = startingScene; //scene 17
        
        /*Scene Classroom = new Scene();
        startingScene.setDescription(
                "Classroom."
        );
        Classroome.setMapSymbol("");
        Classroom.setBlocked(false);
        scenes[SceneType.Classroom.ordinal()] = startingScene; // scene 18
        
        Scene Hallway = new Scene();
        Hallway.setDescription(
                "Hallway."
        );
        Hallway.setMapSymbol("");
        Hallway.setBlocked(false);
        scenes[SceneType.Hallway.ordinal()] = startingScene; // scene 19*/
        
        Scene Front_Walk = new Scene();
        Front_Walk.setDescription(
                "Front Walk."
        );
        Front_Walk.setMapSymbol("");
        Front_Walk.setBlocked(false);
        scenes[SceneType.Front_Walk.ordinal()] = startingScene; //scene 20
        
        Scene Room_of_Requirement = new Scene();
        Room_of_Requirement.setDescription(
                "Room of Requiremente."
        );
        Room_of_Requirement.setMapSymbol("");
        Room_of_Requirement.setBlocked(false);
        scenes[SceneType.Room_of_Requirement.ordinal()] = startingScene; //scene 21
        
        Scene Office_of_Professor_Snape = new Scene();
        Office_of_Professor_Snape.setDescription(
                "Professor Snape's office."
        );
        Office_of_Professor_Snape.setMapSymbol("");
        Office_of_Professor_Snape.setBlocked(false);
        scenes[SceneType.Office_of_Professor_Snape.ordinal()] = startingScene; //scene 22
        
        Scene Slytherin_Dormitory = new Scene();
        Slytherin_Dormitory.setDescription(
                "Slytherin_Dormitory."
        );
        Slytherin_Dormitory.setMapSymbol("");
        Slytherin_Dormitory.setBlocked(false);
        scenes[SceneType.Slytherin_Dormitory.ordinal()] = startingScene; // scene 23
        
        Scene Dungeon = new Scene();
        Dungeon.setDescription(
                "Dungeon."
        );
        Dungeon.setMapSymbol("");
        Dungeon.setBlocked(false);
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