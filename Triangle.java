/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part.pkg3;

/**
 * This application will create a Triangle class with field members regarding 3 points, 3 lines, area, and perimeter. It will also create a toString method and 
 * many methods for finding the centroid, comparing area of two triangles, checking if two triangles are the same, and checking if triangles are valid.
 * @teacher Mr. Williamson
 * @author Krishna Joshi
 * @date 2021-06-21
 */
public class Triangle {
    //declaring variabls for three points
    private Point pA;
    private Point pB;
    private Point pC;
    
    //declaring variables for three lines
    private Line sideAB;
    private Line sideAC;
    private Line sideBC;
    
    //declaring variables for area and perimeter
    private double area;
    private double perimeter;

    /**
     * constructor
     * pre: none
     * post: field members are initialized
     * @param pA
     * @param pB
     * @param pC
     */
    public Triangle(Point pA, Point pB, Point pC){
        this.pA = pA;
        this.pB = pB;
        this.pC = pC;
        setArea();
        setPerimeter();
        setAB(sideAB);
        setAC(sideAC);
        setBC(sideBC);
    }
    
    /**
     * set method for point pA
     * pre: Point pA variable declared
     * post: point pA initialized
     * @param a
     */
    public void setA(Point a){
        this.pA = a;
    }
    
    /**
     * set method for point pB
     * pre: Point pB variable declared
     * post: point pB initialized
     * @param b
     */
    public void setB(Point b) {
        this.pB = b;
    }

    /**
     * set method for point pC
     * pre: Point pC variable declared
     * post: point pC initialized
     * @param c
     */
    public void setC(Point c) {
        this.pC =c;
    }
    
    /**
     * set method for lineAB
     * pre: Line created
     * post: lineAB initialized
     * @param ab
     */
    public void setAB(Line ab) {
        this.sideAB = new Line(pA,pB);
    }

    /**
     * set method for lineAC
     * pre: Line created
     * post: lineAC initialized
     * @param ac
     */
    public void setAC(Line ac) {
        this.sideAC = new Line(pA,pC);
    }

    /**
     * set method for lineBC
     * pre: Line created
     * post: lineBC initialized
     * @param bc
     */
    public void setBC(Line bc) {
        this.sideBC = new Line(pB,pC);
    }

    /**
     * get method that returns point pA
     * pre: none
     * post: point pA returned
     * @return
     */
    public Point getA(){
        return pA;
    }

    /**
     * get method that returns point pB
     * pre: none
     * post: point pB returned
     * @return
     */
    public Point getB(){
        return pB;
    }
    
    /**
     * get method that returns point pC
     * pre: none
     * post: point pC returned
     * @return
     */
    public Point getC(){
        return pC;
    }

    /**
     * get method that returns sideAB
     * pre: none
     * post: sideAB returned
     * @return
     */
    public Line getAB(){
        return sideAB;
    }

    /**
     * get method that returns sideAC
     * pre: none
     * post: sideAC returned
     * @return
     */
    public Line getAC(){
        return sideAC;
    }
    
    /**
     * get method that returns sideBC
     * pre: none
     * post: sideBC returned
     * @return
     */
    public Line getBC(){
        return sideBC;
    }

     //set method for lineAB
     //pre: none
     //post: area initialized
     private void setArea() {
        //calculates and sets the area
        this.area = (pA.getX()*(pB.getY()- pC.getY()) + pB.getX()*(pC.getY() - pA.getY()) + pC.getX()*(pA.getY() - pB.getY()))/2;
        //makes area a postive value if it is not already
        if (this.area < 0) {
            this.area = -1*((pA.getX()*(pB.getY()- pC.getY()) + pB.getX()*(pC.getY() - pA.getY()) + pC.getX()*(pA.getY() - pB.getY()))/2);
        }
     }

     
    //set method for perimeter
    //pre: none
    //post: initialized perimeter     
     private void setPerimeter() {
       this.perimeter = (Math.sqrt(Math.pow((pB.getX()-pA.getX()),2 )+Math.pow((pB.getY()-pA.getY()), 2)))+ (Math.sqrt(Math.pow((pC.getX()-pB.getX()),2 )+Math.pow((pC.getY()-pB.getY()), 2))) + (Math.sqrt(Math.pow((pA.getX()-pC.getX()),2 )+Math.pow((pA.getY()-pC.getY()), 2)));
     }

    /**
     * get method that returns value for area
     * pre: none
     * post: area returned
     * @return
     */
    public double getArea(){
         return area;
     }

    /**
     * get method that returns value for perimeter
     * pre: none
     * post: perimeter returned
     * @return
     */
    public double getPerimeter(){
         return perimeter;
     }
     
    /**
     * checks and returns if triangle is valid
     * pre: none
     * post:true or false returned
     * @return
     */
    public boolean isTriangleValid() {
         //three sidelengths are calculated
         double a = (Math.sqrt(Math.pow((pC.getX()-pB.getX()),2 )+Math.pow((pC.getY()-pB.getY()), 2)));
         double b = (Math.sqrt(Math.pow((pA.getX()-pC.getX()),2 )+Math.pow((pA.getY()-pC.getY()), 2)));
         double c = (Math.sqrt(Math.pow((pB.getX()-pA.getX()),2 )+Math.pow((pB.getY()-pA.getY()), 2)));
         //slopes of three lines are calculated
         double slopeA = (pC.getY()- pB.getY()) / (pC.getX()- pB.getY());
         double slopeB = (pA.getY()- pC.getY()) / (pA.getX()- pC.getY());
         double slopeC = (pB.getY()- pA.getY()) / (pB.getX()- pA.getY());
        
         //checks if the sum of two sides of the triangle is always greater than the third and if all the slopes are not the same
         if ((a+b) > c && (a+c)>b && (b+c)>a && slopeA != slopeB && slopeA != slopeC && slopeB != slopeC){
            //returns true if conditions are met
             return true;
        }
         //returns false if conditions are not met
         else {
            return false;
        }
    }

    /**
     * calculates and returns the centroid of a triangle
     * pre: none
     * post: centroid returned
     * @return
     */
    public Point centroid(){
         return new Point ((pA.getX()+pB.getX()+pC.getX())/3, (pA.getY()+pB.getY()+pC.getY())/3);
     }

    /**
     * compares area of two triangles 
     * pre: triangle object created
     * post: 1 or -1 is returned as result of comparison
     * @param other
     * @return
     */
    public int compareTo(Triangle other){
        //if area of triangle one is greater than the other, it returns 1
        if (area > other.area){
             return 1;
         }
        // if the area isn't greater then -1 is returned
         else {
             return -1;
         }
}
     
    /**
     * checks and returns if triangle is same another one
     * pre: triangle objects created
     * post: returns if triangle is the same as another
     * @param other
     * @return
     */
    public boolean equals(Triangle other){
         boolean result;
         //creates triangle object
         Triangle triangle = (Triangle)other;
         
         //checks and reuns true if triangle is equal to other one
         if (this == other){
             result = true;
         }
         
         //specifically checks if the points in both tringales are the same and returns it
         if ((pA == triangle.getA()) && (pB == triangle.getB()) && (pC == triangle.getC())){
             result = true;
         }
         else{
             result = false;
         }
         return result;
     }
     
    
    //creates text representation of a triangle
    //pre: none
    //post: details ready to be displayed 
     public String toString(){
         String picture = "Vertex A is ( " + pA.getX() + "," + pA.getY() + ")" + "\n" +
                          "Vertex B is ( " + pB.getX() + "," + pB.getY() + ")" + "\n" +
                          "Vertex C is ( " + pC.getX() + "," + pC.getY() + ")" + "\n" +
                          "Side AC is from ( " + pA.getX() + "," + pA.getY() + ")" + " to ( " + pC.getX() + "," + pC.getY() + ") Length: " + sideAC.getLength() + "\n" +
                          "Side AB is from ( " + pA.getX() + "," + pA.getY() + ")" + " to ( " + pB.getX() + "," + pB.getY() + ") Length: " + sideAB.getLength() + "\n" +
                          "Side BC is from ( " + pB.getX() + "," + pB.getY() + ")" + " to ( " + pC.getX() + "," + pC.getY() + ") Length: " + sideBC.getLength() + "\n" +
                          "Area of Triagnle: " + area + "\n"+
                          "Perimeter of Triangle: " + perimeter;
         return picture;
                          
                 
     }
}

