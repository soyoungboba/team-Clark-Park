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

    /**
     * Test of calcVolumeOfRectangle method, of class TaskControl.
     */
    @Test
    public void testCalcVolumeOfRectangle() {
        System.out.println("calcVolumeOfRectangle");
        double width = 18;
        double height = 30;
        double length = 19;
        TaskControl instance = new TaskControl();
        double expResult = 10260;
        double result = instance.calcVolumeOfRectangle(width, height, length);
        assertEquals(expResult, result, 0.0);
        
        //test case 2
        System.out.println("\tTest case 2");
         width = -1;
         height = 16;
         length = 10;
                 
         expResult = -1;
         result = instance.calcVolumeOfRectangle(width, height, length);
        assertEquals(expResult, result, 0.0);
        
        //test case 3
        System.out.println("\tTest case 3");
         width = 15;
         height = -1;
         length = 14;
                 
         expResult = -1;
         result = instance.calcVolumeOfRectangle(width, height, length);
        assertEquals(expResult, result, 0.0);
        
        //test case 4
        System.out.println("\tTest case 4");
         width = 17;
         height = 18;
         length = -1;
                 
         expResult = -1;
         result = instance.calcVolumeOfRectangle(width, height, length);
        assertEquals(expResult, result, 0.0);
        
        //test case 5
        System.out.println("\tTest case 5");
         width = 13;
         height = 51;
         length = 4;
                 
         expResult = -1;
         result = instance.calcVolumeOfRectangle(width, height, length);
        assertEquals(expResult, result, 0.0);
        
        //test case 6
        System.out.println("\tTest case 6");
         width = 0;
         height = 50;
         length = 20;
                 
         expResult = 0;
         result = instance.calcVolumeOfRectangle(width, height, length);
        assertEquals(expResult, result, 0.0);
        
        //test case 7
        System.out.println("\tTest case 7");
         width = 29;
         height = 0;
         length = 30;
                 
         expResult = 0;
         result = instance.calcVolumeOfRectangle(width, height, length);
        assertEquals(expResult, result, 0.0);
        
        //test case 8
        System.out.println("\tTest case 8");
         width = 24;
         height = 50;
         length = 0;
                 
         expResult = 0;
         result = instance.calcVolumeOfRectangle(width, height, length);
        assertEquals(expResult, result, 0.0);
        
        //test case 9
        System.out.println("\tTest case 9");
         width = 15;
         height = 50;
         length = 30;
                 
         expResult = 22500;
         result = instance.calcVolumeOfRectangle(width, height, length);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcRadius method, of class TaskControl.
     */
    @Test
    public void testCalcRadius() {
        System.out.println("calcRadius");
        //test case1
        System.out.println("\tTest case 1");
        double circ = 47;
        double diameter = 14.9605;
        double playerAnswer = 17;
        TaskControl instance = new TaskControl();
        double expResult = -2;
        double result = instance.calcRadius(circ, diameter, playerAnswer);
        assertEquals(expResult, result, 0.001);
        
        
        //test case2
        System.out.println("\tTest case 2");
        circ = 0;
        diameter = 15;
        playerAnswer = 5;
        expResult = -1;
        result = instance.calcRadius(circ, diameter, playerAnswer);
        assertEquals(expResult, result, 0.001);
        
        //test case3
        System.out.println("\tTest case 3");
        circ = 15;
        diameter = -1;
        playerAnswer = 5;
        expResult = -1;
        result = instance.calcRadius(circ, diameter, playerAnswer);
        assertEquals(expResult, result, 0.001);
        
        //test case4
        System.out.println("\tTest case 4");
        circ = 51;
        diameter = 16.2338;
        playerAnswer = 5;
        expResult = -1;
        result = instance.calcRadius(circ, diameter, playerAnswer);
        assertEquals(expResult, result, 0.001);
        
        //test case5
        System.out.println("\tTest case 5");
        circ = 1;
        diameter = .318309886;
        playerAnswer = .159;
        expResult = -2;
        result = instance.calcRadius(circ, diameter, playerAnswer);
        assertEquals(expResult, result, 0.0001);
        
        //test case6
        System.out.println("\tTest case 6");
        circ = 3.141592654;
        diameter = 1;
        playerAnswer = 5;
        expResult = -2;
        result = instance.calcRadius(circ, diameter, playerAnswer);
        assertEquals(expResult, result, 0.0001);
        
        //test case7
        System.out.println("\tTest case 7");
        circ = 50;
        diameter = 15.91549431;
        playerAnswer = 7.96;
        expResult = -2;
        result = instance.calcRadius(circ, diameter, playerAnswer);
        assertEquals(expResult, result, 0.01);
    }
    @Test
    public void testCalcAreaOfTrapezoid() {
        System.out.println("calcAreaOfTrapezoid");
        //test case1
        System.out.println("\tTest case 1");
        double base1 = 17;
        double base2 = 15;
        double height = 12;
        TaskControl instance = new TaskControl();
        double expResult = 192;
        double result = instance.calcAreaOfTrapezoid(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        
        //test case 2
        System.out.println("\tTest case 2");
         base1 = -1;
         base2 = 15;
         height = 12;
        
         expResult = -1;
         result = instance.calcAreaOfTrapezoid(base1,base2, height); 
        assertEquals(expResult, result, 0.0);
        
        //test case 3
        System.out.println("\tTest case 3");
         base1 = 15;
         base2 =  -1;
         height = 12;
        
         expResult = -1;
         result = instance.calcAreaOfTrapezoid(base1,base2, height);
        assertEquals(expResult, result, 0.0);
        
        //test case 4
        System.out.println("\tTest case 4");
         base1 = 17;
         base2 = 31;
         height = 14;
        
         expResult = -1;
         result = instance.calcAreaOfTrapezoid(base1,base2, height);
        assertEquals(expResult, result, 0.0);
        
        //test case 5
        System.out.println("\tTest case 5");
         base1 = 0;
         base2= 12;
         height = 20;
        
         expResult = 0;
         result = instance.calcAreaOfTrapezoid(base1,base2, height);
        assertEquals(expResult, result, 0.0);
        
        //test case 6
        System.out.println("\tTest case 6");
         base1 = 24;
         base2 = 0;
         height = 20;
        
         expResult = 0;
         result = instance.calcAreaOfTrapezoid(base1,base2, height);
        assertEquals(expResult, result, 0.0);
        
        //test case 7
        System.out.println("\tTest case 7");
         base1 = 24;
         base2 = 30;
         height = 0;
        
         expResult = 0;
         result = instance.calcAreaOfTrapezoid(base1, base2, height);
        assertEquals(expResult, result, 0.0);
    }
 
    }
    

