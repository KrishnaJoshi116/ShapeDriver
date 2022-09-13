/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part.pkg3;

/**
 * This application will create a Circle class with field members regarding the area, circumference, radius and center location of a circle. It will also create a toString method and 
 * many methods for finding if a point is inside the circle or not.
 * @teacher Mr. Williamson
 * @author Krishna Joshi
 * @date 2021-06-21
 * @author Krishna
 */
public class Circle {
    //declares variables for the area, circumference, center location, and radius of a circle.
    private double area;
    private double circumference;
    private Point location;
    private double radius;

    /**
     * constructor
     * pre: none
     * post: field members initialized
     * @param r
     */
    public Circle(double r){
      this.radius = r;
      this.location = new Point (0.0, 0.0);
      setArea();
      setCircumference();
}

    /**
     * set method for y
     * Pre: radius variable declared
     * Post: radius of point initialized
     * @param r
     */
    public void setRadius (double r){
        this.radius = r;
    }
     
    /**
     * set method for location
     * Pre: variable location declared, point made
     * Post: location of point initialized
     * @param p
     */
    public void setLocation (Point p){
        this.location = new Point (p.getX(), p.getY());
    }
    
    /**
     * get method that returns the radius of the circle
     * pre: none
     * post: radius has been returned
     * @return
     */
    public double getRadius(){
        return radius;
    }
    
    /**
     * get method that returns the center location of the circle
     * pre: none
     * post: location has been returned
     * @return
     */
    public Point getLocation(){
        return location;
    }
    
    /**
     * set method for area
     * Pre: variable for area declared
     * Post: area initialized
     */
    public void setArea(){
        //area calculated and set using forumula a = pi*r^2
        this.area = Math.PI *(radius*radius);
    }

    /**
     * set method for circumference
     * Pre: variable for circumference declared
     * Post: circumference initialized
     */
    public void setCircumference(){
        //circumference calculated and set using formula c = 2*pi*r
        this.circumference = 2 * Math.PI * radius;
    }

    /**
     * get method that returns the area of the circle
     * pre: none
     * post: area has been returned.
     * @return
     */
    public double getArea(){
        return area;
    }
    
    /**
     * get method that returns the circumference of circle
     * pre: none
     * post: circumference has been returned.
     * @return
     */
    public double getCircumference(){
        return circumference;
    }

    /**
     * checks if a point is inside the circle and returns result
     * pre: point and circle object has to be created
     * post: result returned
     * @param p
     * @return
     */
    public boolean isPointInside(Point p){
       boolean result;
       //checks if point is at a distance less than the circle radius
       if ((Math.sqrt(Math.pow((getLocation().getX()- p.getX()),2 )+ Math.pow((getLocation().getX()-p.getY()), 2))) < radius){
           //result is set to true if distance is less than radius 
           result = true;
       }
       else{
           //result is set to false if distance is not less tha radius
            result = false;
    }
       //result is returned    
       return result;
  
     }

    
    //creates text representation of a circle
    //pre: none
    //post: details ready to be displayed 
    public String toString(){
        String Picture = "Radius: "+radius+"\n"+
                         "Center: "+ location +"\n"+  
                         "Circumference: "+ circumference +"\n"+
                         "Area: "+ area +"\n";
                               
               
        return Picture; 

    }
}


