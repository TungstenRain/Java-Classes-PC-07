package ch06pc07;

/**
 *
 * @author Frank
 * date 11/8/2017
 * purpose class for a circle
 */
public class Circle {
    //fields
    private double radius;
    private final double PI = 3.14159;
    
    //constructors
    public Circle()
    {
        radius = 0.0;
    }
    public Circle(double rad)
    {
        radius = rad;
    }
    
    //methods
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double rad)
    {
        radius = rad;
    }
    
    public double getArea()
    {
        double area = PI * (Math.pow(radius, 2));
        return area;
    }
    
    public double getDiameter()
    {
        double diameter = radius *2;
        return diameter;
    }
    
    public double getCircumference()
    {
        double circumference = 2 * PI * radius;
        return circumference;
    }
}
