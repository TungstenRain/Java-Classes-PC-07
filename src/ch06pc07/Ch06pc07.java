package ch06pc07;
import java.util.Scanner;
/**
 *
 * @author Frank
 * date 11/8/2017
 * purpose: to demonstrate the circle class
 */
public class Ch06pc07 {

    public static void main(String[] args) {
        //variables
        double rad;
        
        //create Scanner keyboard object
        Scanner keyboard = new Scanner(System.in);
        
        //request information
        System.out.print("Please enter the radius for the circle; ");
        rad = keyboard.nextDouble();
        
        //instantiate Circle class
        Circle cir = new Circle(rad);
        
        System.out.println("The radius is: " + rad);
        System.out.println("The diameter is: " + cir.getDiameter());
        System.out.println("The area is: " + cir.getArea());
        System.out.println("The circumference is: " + cir.getCircumference());
        
    }
    
}
