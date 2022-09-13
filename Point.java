/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part.pkg3;

/**
 * This application will create a point class with field members regarding a pair of coordinates. It will also create a toString method and 
 * many methods for finding the distance from the origin, finding distance between 2 points, and checking if the 2 points are equal
 * @teacher Mr. Williamson
 * @author Krishna Joshi
 * @date 2021-06-21
 * 
 */

public class Point {
    //declares variables for x and y coordinates of the point
    private double x;
    private double y;
    
    public Point(){
    this.x = 0;
    this.y = 0;
    }
    
    /**
     * Constructor
     * Pre: none
     * Post: field members initialized
     * @param x
     * @param y
     */
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * set method for position
     * Pre: none
     * Post: position of point initialized
     * @param y
     */
    public void setPosition(double x, double y){
        Point position = new Point(x,y);
    }
    
    /**
     * get method that returns the x value of the point.
     * pre: none
     * post: x has been returned.
     * @return
     */
    public double getX(){
        return x;
    }
    
    /**
     * get method that returns the y value of the point.
     * pre: none
     * post: y has been returned.
     * @return
     */
    public double getY(){
        return y;
    }
    
    /**
     * finds the distance of a point from the origin
     * pre: point must be initialized
     * post: distance from origin to point is returned
     * @return
     */
    public double distanceFromOrigin(){
        //calculates distance from origin using the distance formula
        return(Math.sqrt(Math.pow((0-x),2 )+Math.pow((0-y), 2)));
    }
   
    /**
     * distance between two points is calculated
     * pre: two point objects must be made
     * post: distance between two points is returned
     * @param p
     * @return
     */
    public double distanceFrom(Point p){
    //distance that the point is from another point
        double xcoord = p.getX();//get x component of other point
        double ycoord = p.getY();//get y component of other point
   //Calculate length using the distance formula 
        double distance = Math.sqrt(Math.pow((xcoord-x),2 )+Math.pow((ycoord-y), 2));
   // return distance       
        return  distance; 
   }
    
    /**
     * checks if two points are equal
     * pre: two point objects must be created 
     * post: result if points are equal or not returned
     * @param obj
     * @return
     */
    public boolean equals(Point obj){
        Point p = (Point)obj;
   boolean result;
   //checks if both points are the same
   if(x == p.x && y == p.y)
   //result is set to true if it is  
       result = true;
   else
    //result is set to false if they are not
      result = false;
   //the result is returned
   return result;

    } 

    //creates text representation of a point
    //pre: none
    //post: details ready to be displayed 
    public String toString(){
        
        String picture = " Point is at " + x + "," + y + "\n Distance of Point from the origin: " + distanceFromOrigin(); 
        
        return picture;    
                
    }
    
}
