
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
    public static Map createMap() {
        //create the map
        Map map = new Map(5,5);
        
        Scene[] scenes = createScenes();
        
        MapControl.assignScenesToLocations(map, scenes);
        
        return map;
    }

    

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Professor McGonagall's office."
        );
        startingScene.setMapSymbol("MO");
        startingScene.setBlocked(false);
        scenes[SceneType.Office_of_Professor_McGonagall.ordinal()] = startingScene; //starting scene
        
        Scene Gryffindor_Dormitory = new Scene();
        Gryffindor_Dormitory.setDescription(
                "Gryffindor Dormitory."
        );
        Gryffindor_Dormitory.setMapSymbol("GD");
        Gryffindor_Dormitory.setBlocked(false);
        scenes[SceneType.Gryffindor_Dormitory.ordinal()] = Gryffindor_Dormitory; //scene 2
        
        Scene Chamber_of_Secrets = new Scene();
        Chamber_of_Secrets.setDescription(
                "Chamber of Secrets."
        );
        Chamber_of_Secrets.setMapSymbol("CS");
        Chamber_of_Secrets.setBlocked(false);
        scenes[SceneType.Chamber_of_Secrets.ordinal()] = Chamber_of_Secrets; //scene 3
        
        Scene The_Green_Houses = new Scene();
        The_Green_Houses.setDescription(
                "The Green Houses."
        );
        The_Green_Houses.setMapSymbol("GH");
        The_Green_Houses.setBlocked(false);
        scenes[SceneType.The_Green_Houses.ordinal()] = The_Green_Houses; //scene 4
        
        Scene Black_Lake = new Scene();
        Black_Lake.setDescription(
                "Black Lake."
        );
        Black_Lake.setMapSymbol("BL");
        Black_Lake.setBlocked(false);
        scenes[SceneType.Black_Lake.ordinal()] = Black_Lake; //scene 5 
        
        Scene Classroom = new Scene();
        Classroom.setDescription(
                "Classroom."
        );
        Classroom.setMapSymbol("CR");
        Classroom.setBlocked(false);
        scenes[SceneType.Classroom.ordinal()] = Classroom; //scene 6 and 18
        
        Scene Stairway = new Scene();
        Stairway.setDescription(
                "Stairway."
        );
        Stairway.setMapSymbol("SW");
        Stairway.setBlocked(false);
        scenes[SceneType.Stairway.ordinal()] = Stairway; //scene 7
        
        Scene Library = new Scene();
        Library.setDescription(
                "Library."
        );
        Library.setMapSymbol("LB");
        Library.setBlocked(false);
        scenes[SceneType.Library.ordinal()] = Library; //scene 8
        
        Scene Hut_of_Hagrid = new Scene();
        Hut_of_Hagrid.setDescription(
                "Hagrid's Hut."
        );
        Hut_of_Hagrid.setMapSymbol("HH");
        Hut_of_Hagrid.setBlocked(false);
        scenes[SceneType.Hut_of_Hagrid.ordinal()] = Hut_of_Hagrid; //scene 9
        
        Scene Forbidden_Forest = new Scene();
        Forbidden_Forest.setDescription(
                "Forbidden Forest."
        );
        Forbidden_Forest.setMapSymbol("FF");
        Forbidden_Forest.setBlocked(false);
        scenes[SceneType.Forbidden_Forest.ordinal()] = Forbidden_Forest; //scene 10 and 15
        
        Scene Office_of_Dumbledore = new Scene();
        Office_of_Dumbledore.setDescription(
                "Dumbledore's Office."
        );
        Office_of_Dumbledore.setMapSymbol("DO");
        Office_of_Dumbledore.setBlocked(false);
        scenes[SceneType.Office_of_Dumbledore.ordinal()] = Office_of_Dumbledore; //scene 11
        
        Scene Hallway = new Scene();
        Hallway.setDescription(
                "Hallway."
        );
        Hallway.setMapSymbol("HW");
        Hallway.setBlocked(false);
        scenes[SceneType.Hallway.ordinal()] = Hallway; //scene 12 and 19
        
        Scene Great_Hall = new Scene();
        startingScene.setDescription(
                "Great Hall."
        );
        Great_Hall.setMapSymbol("GH");
        Great_Hall.setBlocked(false);
        scenes[SceneType.Great_Hall.ordinal()] = Great_Hall; //scene 13
        
        Scene Quidditch_Field = new Scene();
        Quidditch_Field.setDescription(
                "Quidditch Field."
        );
        Quidditch_Field.setMapSymbol("QF");
        Quidditch_Field.setBlocked(false);
        scenes[SceneType.Quidditch_Field.ordinal()] = Quidditch_Field; //scene 14
        
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
        Lavatory_of_Girls.setMapSymbol("LG");
        Lavatory_of_Girls.setBlocked(false);
        scenes[SceneType.Lavatory_of_Girls.ordinal()] = Lavatory_of_Girls; //scene 16
        
        Scene Hospital_Wing = new Scene();
        Hospital_Wing.setDescription(
                "Hospital Wing."
        );
        Hospital_Wing.setMapSymbol("HW");
        Hospital_Wing.setBlocked(false);
        scenes[SceneType.Hospital_Wing.ordinal()] = Hospital_Wing; //scene 17
        
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
        Front_Walk.setMapSymbol("FW");
        Front_Walk.setBlocked(false);
        scenes[SceneType.Front_Walk.ordinal()] = Front_Walk; //scene 20
        
        Scene Room_of_Requirement = new Scene();
        Room_of_Requirement.setDescription(
                "Room of Requirement."
        );
        Room_of_Requirement.setMapSymbol("RR");
        Room_of_Requirement.setBlocked(false);
        scenes[SceneType.Room_of_Requirement.ordinal()] = Room_of_Requirement; //scene 21
        
        Scene Office_of_Professor_Snape = new Scene();
        Office_of_Professor_Snape.setDescription(
                "Professor Snape's office."
        );
        Office_of_Professor_Snape.setMapSymbol("SO");
        Office_of_Professor_Snape.setBlocked(false);
        scenes[SceneType.Office_of_Professor_Snape.ordinal()] = Office_of_Professor_Snape; //scene 22
        
        Scene Slytherin_Dormitory = new Scene();
        Slytherin_Dormitory.setDescription(
                "Slytherin Dormitory."
        );
        Slytherin_Dormitory.setMapSymbol("SD");
        Slytherin_Dormitory.setBlocked(false);
        scenes[SceneType.Slytherin_Dormitory.ordinal()] = Slytherin_Dormitory; // scene 23
        
        Scene Dungeon = new Scene();
        Dungeon.setDescription(
                "Dungeon."
        );
        Dungeon.setMapSymbol("DG");
        Dungeon.setBlocked(false);
        scenes[SceneType.Dungeon.ordinal()] = Dungeon; // scene 24
        
        Scene finish = new Scene();
        finish.setDescription(
                "Congratulation! Well done."
        );
        finish.setMapSymbol("FN");
        finish.setBlocked(false);
        scenes[SceneType.Finish.ordinal()] = finish; 
        return scenes;
    }

   private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //start
        locations[0][0].setScene(scenes[SceneType.Office_of_Professor_McGonagall.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.Gryffindor_Dormitory.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.Chamber_of_Secrets.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.The_Green_Houses.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.Black_Lake.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.Classroom.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.Stairway.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.Library.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.Hut_of_Hagrid.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.Forbidden_Forest.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.Office_of_Dumbledore.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.Hallway.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.Great_Hall.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.Quidditch_Field.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.Forbidden_Forest.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.Lavatory_of_Girls.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.Hospital_Wing.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.Classroom.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.Hallway.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.Front_Walk.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.Room_of_Requirement.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.Office_of_Professor_Snape.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.Slytherin_Dormitory.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.Dungeon.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.Finish.ordinal()]);
    }
}
