/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Hogwarts.control;

/**
 *
 * @author Cody
 */
public class TaskControl {

    //insert function
    public double calcAreaOfTriangle(double base, double height) {
        if (height < 0 || height > 24) {
            return -1;
        }
        if (base < 0 || base > 30) {
            return -1;
        }
        double area = height * base / 2;

        return area;
    }

    public double calcRadius(double circ, double diameter, double playerAnswer) {
        if (circ < 1 || circ > 50) {
            return -1;
        }
        if (diameter < 0) {
            return -1;
        }
        
        double radius = (circ / Math.PI) * 2;

        if (playerAnswer != radius) {
            return -2;
        }

        return radius;


      

    }
}
