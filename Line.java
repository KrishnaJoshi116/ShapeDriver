/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part.pkg3;

/**
 * This application will create a Line class with field members regarding  2 pairs of coordinates, slope, length, and y-intercept. It will also create a toString method and 
 * many methods for finding the point of intersection of the two lines, and the shortest distance of a point to a line.
 * @teacher Mr. Williamson
 * @author Krishna Joshi
 * @date 2021-06-21
 * @author Krishna
 */
public class Line {
    //declares variables for 2 points
    private Point start;
    private Point end;
    //declares veriables for slope, length, and y-intercept of the lines
    private double slope;
    private double length;
    private Point yIntercept;

    /**
     * constructor
     * pre: none
     * post: field members initialized
     * @param p1
     * @param p2
     */
    public Line(Point p1, Point p2){
        start = p1;
        end = p2;
        setSlope(slope);
        setYIntercept(yIntercept);
        setLength(length);
    }

    //set method that calculates slope
    //pre: slope variable declared
    //post: slope initialized
    private void setSlope (double slope){
        //slope is calculated and set using slope formula (y2-y1)/(x2-x1)
        this.slope = ((end.getY()- start.getY()) / (end.getX()- start.getX()));
    }

    //set method for length
    //pre: length variable declared
    // post: length initialized
    private void setLength (double length){
        //length is calculated and set using the distance formula
        this.length = Math.sqrt(Math.pow((end.getX()- start.getX()),2 )+Math.pow((end.getY()- start.getY()), 2));
     
    }
    
    /**
     * get method that returns the slope of the point.
     * pre: none
     * post: slope has been returned.
     * @return
     */
    public double getSlope(){
        return slope;
    }
    
    //set method for y-intercept
    //pre: yIntercept vaiable declared
    //post: yIntercept initialized
    private void setYIntercept (Point yIntercept){
        //y-value of y-iny calculated by rearranging y=mx+b formula and subbing in one point
        double yIntValue = -1*(getSlope()* end.getX() - end.getY());
        //sets point for y-int
        this.yIntercept = new Point (0,yIntValue);
    }
    
    /**
     * get method that returns the length value of the point.
     * pre: none
     * post: length has been returned.
     * @return
     */
    public double getLength(){
        return length;
    }
    
    /**
     * get method that returns the y-int of the point.
     * pre: none
     * post: y-int has been returned.
     * @return
     */
    public Point getYIntercept(){
        return yIntercept;
    }
    
    /**
     * finds the midpoint of the line
     * pre: none
     * post: midpoint found 
     * @return
     */
    public Point getMidPoint(){
        //calculates x-value of midpoint using formula (x1+x2)/2
        double midpointX = (start.getX()+ end.getX())/2;
        //calculates y-value of midpoint using formula (y1+y2)/2
        double midpointY = ((start.getY()+ end.getY())/2);
        //returns midpoint as a point
        return new Point(midpointX, midpointY);
        
    }

    /**
     * checks if 2 lines are parallel and returns true or false
     * pre: two line objects have to be created
     * post: result is returned
     * @param line
     * @return
     */
    public boolean isParallel(Line line){
     //result variable is declared
        boolean result;
    //checks if slope of two lines are the same
            if(getSlope() == line.getSlope()){
    //sets result to true if they are the same
                result = true;
            }
            
            else{
    //sets result to false if the slopes are not the same
                result = false;
   }
   //result is returned
        return result;
    }
   
    /**
     * finds the point fo intersection of two lines
     * pre: two line objects created
     * post: point of intersection found
     * @param otherLine
     * @return
     */
    public Point pointOfInterection(Line otherLine){
        //calculates x value of the point of intersection
        double x_interSection = -(this.getYIntercept().getY()-otherLine.getYIntercept().getY())/(Math.round((slope - otherLine.getSlope())*100)/100.0);      
        //calculates y value of the point of intersection
        double y_interSection = x_interSection*this.slope +this.yIntercept.getY();         
        //returns point of intersection as a point
        return new Point(x_interSection,y_interSection);  // return the point of intersection    
   }

    /**
     * find shortest distance from a point to a line
     * pre: line and point objects created
     * post: shortest distance found and returned
     * @param p
     * @return
     */
    public double shortestDistanceFromPoint(Point p){
        //initialized x and y value variables of target point
        double xTarget = p.getX();
        double yTarget = p.getY();
        //initialized original slope and y-intercept
        double LineSlope = this.slope;
        double yIntGiven = this.getYIntercept().getY();
        
        //declared variables for distance, the intersect x and y vales
        double xIntersect, yIntersect, distance;
        //initializes slope of the line perpendicular to given line
        double slopePerp = (double) - 1.0/(slope);
        //y-int of perdicular line is initialized
        double yIntPerp = yTarget - (xTarget * slopePerp);
       
        //intersect x and y values calculated and initialized
        xIntersect = -(yIntGiven-yIntPerp)/(slope - slopePerp);
        yIntersect = xIntersect*slope+yIntGiven;
        
        //point created for where it would intersect at shortest distance
        Point intersect = new Point (xIntersect, yIntersect);
        //line created
        Line perpLine = new Line(intersect, p);
        //shortest distance calculated
        distance = perpLine.getLength();
        
        return distance;
        
        
    }

    
    //creates text representation of a line
    //pre: none
    //post: details ready to be displayed 
    public String toString(){
        String picture = "Line ("+ start.getX()+ "," + start.getY() + ") to (" + end.getX() + "," + end.getY() + ")\n Length: " + length + "\n Slope: " + getSlope() + "\n Y-int: " + getYIntercept();
                         
        return picture;
    }
    
}

 