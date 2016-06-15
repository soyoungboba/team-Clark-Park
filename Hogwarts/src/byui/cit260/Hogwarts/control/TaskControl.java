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
    // insert function task 1
    public double calcAreaOfTriangle(double base,double height){		
	if (height < 0 || height > 24) {	
            return -1;	
        }	
	if (base < 0 || base > 30) {	
            return -1;	
        }	
	double area = height*base/2;	
		
	return area;	
    }	
    
    // task 2
    public double calcVolumeOfRectangle(double width, double height, double length) {
        if (width < 0) {
            return -1;
        }
        if (height < 0 || height > 50) {
            return -1;
        }
        if (length < 0 || length > 30) {
            return -1;
        }
        double volume = width*height*length;
        
        return volume;
    }
    
    // task 3
    public double calcRadius(double circ, double diameter,double playerAnswer){
        if (circ < 1 || circ > 50){
            return -1;
        }
        if (diameter < 0){
            return -1;
        }
        double radius = (circ/(Math.PI))*.5;
        if (playerAnswer != radius){
            return -2;
        }
        
        return radius;
        
    }
        public double calcAreaOfTrapezoid(double base1, double base2, double height){		
	if (height < 1 || height > 24) {	
            return -1;	
        }	
	if (base1 < 1 || base1 > 30) {	
            return -1;	
        }
        
       if (base2 < 1 || base2 > 30) {	
            return -1;	
        }	
	double area = ((base1+base2)*height)/2;	
		
	return area;	
    }	
}
