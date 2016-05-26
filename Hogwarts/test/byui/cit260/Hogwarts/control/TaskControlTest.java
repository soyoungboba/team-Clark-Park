/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cody
 */
public class TaskControlTest {
    
    public TaskControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcAreaOfTriangle method, of class TaskControl.
     */
    @Test
    public void testCalcAreaOfTriangle() {
        System.out.println("calcAreaOfTriangle");
        //test case1
        System.out.println("\tTest case 1");
        double base = 15;
        double height = 17;
        TaskControl instance = new TaskControl();
        double expResult = 127.5;
        double result = instance.calcAreaOfTriangle(base, height);
        assertEquals(expResult, result, 0.0);
        
        //test case 2
        System.out.println("\tTest case 2");
         base = 15;
         height = -1;
        
         expResult = -1;
         result = instance.calcAreaOfTriangle(base, height);
        assertEquals(expResult, result, 0.0);
        
        //test case 3
        System.out.println("\tTest case 3");
         base = -1;
         height = 15;
        
         expResult = -1;
         result = instance.calcAreaOfTriangle(base, height);
        assertEquals(expResult, result, 0.0);
        
        //test case 4
        System.out.println("\tTest case 4");
         base = 31;
         height = 17;
        
         expResult = -1;
         result = instance.calcAreaOfTriangle(base, height);
        assertEquals(expResult, result, 0.0);
        
        //test case 5
        System.out.println("\tTest case 5");
         base = 12;
         height = 0;
        
         expResult = 0;
         result = instance.calcAreaOfTriangle(base, height);
        assertEquals(expResult, result, 0.0);
        
        //test case 6
        System.out.println("\tTest case 6");
         base = 0;
         height = 24;
        
         expResult = 0;
         result = instance.calcAreaOfTriangle(base, height);
        assertEquals(expResult, result, 0.0);
        
        //test case 7
        System.out.println("\tTest case 7");
         base = 30;
         height = 24;
        
         expResult = 360;
         result = instance.calcAreaOfTriangle(base, height);
        assertEquals(expResult, result, 0.0);
    }
    
}
