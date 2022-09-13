
package part.pkg3;

import java.util.Scanner;

/**
 *
 * @author Krishna
 */
public class ShapeDriver extends java.lang.Object{
    
     //empty constructor to allow more options for instantiation
    public ShapeDriver(){}
    
    /**
     * models scenario one of assignment
     * pre: none
     * post: scenario1 is displayed
     * 
     */
    public static void Scenario1 (){
        //scanner created
        Scanner myScan = new Scanner(System.in);
        //points x and y values declared
        double x1, y1;
        double x2, y2;
        double x3, y3;
        //circle object
        Circle thisCircle;
        //declared radius
        double myRadius;
        
        //asks user for coordinates
        System.out.println("Enter a coordinate in form x,y for the first point: ");
        //stored the user input
        String linestring = myScan.nextLine();
        //split the user input so the x and y values are by themselves
        String Coordinates[] = linestring.split(",");
        String b = Coordinates[0].trim();
        x1 = Double.parseDouble(b);
        String c = Coordinates[1].trim();
        y1 = Double.parseDouble(c);
        
        //asks for user input for second coordinate
        System.out.println("Enter a coordinate in form x,y for the second point: ");
        //stores the uder input
        String linestring2 = myScan.nextLine();
        // splits the input to get the x and y values by themselves
        String Coordinates2[] = linestring2.split(",");
        String b2 = Coordinates2[0].trim();
        x2 = Double.parseDouble(b2);
        String c2 = Coordinates2[1].trim();
        y2 = Double.parseDouble(c2);
        
        //asks user input for radius of circle
        System.out.println(" Enter Circle Radius: ");
        //stores the user input
        myRadius = myScan.nextDouble();
        myScan.nextLine();
        //aks for coordinates of the center location of the circle
        System.out.println("Enter the coordinates of the center in the form x,y");
        //stores the user input
        String linestring3 = myScan.nextLine();
        // splits the input to get the x and y values by themselves
        String Coordinates3[] = linestring3.split(",");
        String b3 = Coordinates3[0].trim();
        x3 = Double.parseDouble(b3);
        String c3 = Coordinates3[1].trim();
        y3 = Double.parseDouble(c3);
        
        
        //creates 3 points, 1 line, and 1 circle objects
        Point mypoint1 = new Point (x1, y1);
        Point mypoint2 = new Point (x2, y2);
        Line myLine = new Line(mypoint1, mypoint2);
        Point centerPoint = new Point(x3, y3);
        thisCircle = new Circle(myRadius);
        thisCircle.setArea();
        thisCircle.setCircumference();
        thisCircle.setLocation(centerPoint);
        
        //displays information about scenario1
        System.out.println("***********************\n");
        System.out.println("Scenario 1*\n");
        System.out.println("***********************\n");
        System.out.printf("Point 1 is (%.1f,%.1f)\n", x1,y1);
        System.out.printf("Point 2 is (%.1f,%.1f)\n", x2,y2);
        System.out.printf("Distance of point 1 from origin is: %.1f\n", mypoint1.distanceFromOrigin());
        System.out.printf("Distance of point 2 from origin is: %.1f\n", mypoint2.distanceFromOrigin());
        System.out.printf("Line (%.1f, %.1f) to (%.1f, %.1f) Length: %.1f Slope: %.1f\n" , x1, y1, x2, y2, mypoint1.distanceFrom(mypoint2), myLine.getSlope());
        System.out.printf("The mid-point of this line segment p1-p2 is: (%.1f, %.1f)\n", myLine.getMidPoint().getX(), myLine.getMidPoint().getY());
        //checks if 2 points are equal and prints if they are or are not
        if (mypoint1.equals(mypoint2)== true){
            System.out.print("The two points are equal\n");
        }
        else{
            System.out.print("The two points are different\n");
        }
        
        //prints other circle information
        System.out.printf("The Circle Radius: %.1f The center is (%.1f, %.1f) \n", myRadius, x3, y3);
        System.out.printf("The Area of the Circle is: %.1f\n" , thisCircle.getArea());
        double circ = thisCircle.getCircumference();
        System.out.printf("The circumference of the circle is: %.1f \n", circ);
        
        //checks if a point is inside the circle and prints if it is or isn't
        if (thisCircle.isPointInside(mypoint1) == true) {
            System.out.println("Point 1 is inside the circle.");
        }
        else{
            System.out.println("Point 1 is not inside the circle");
        }
        //checks if another point is inside the circle and prints if it is or isn't
        if (thisCircle.isPointInside(mypoint2) == true) {
            System.out.println("Point 2 is inside the circle.");
        }
        else{
            System.out.println("Point 2 is not inside the circle");
        }
        
    }
    
    /**
     * models scenario one of assignment
     * pre: none
     * post: scenario2 is displayed
     */
    public static void Scenario2(){
        //creates scanner
        Scanner myScan = new Scanner(System.in);
        //declares point x and y value variables
        double x1, y1;
        double x2, y2;
        double x3, y3;
        //object circle
        Circle thisCircle;
        //declares radius
        double myRadius;
        
        //asks user for coordinates of a point
        System.out.println("Enter a coordinate in form x,y for the first point: ");
        //stores user input
        String linestring = myScan.nextLine();
        //splits user input so the x and y values are seperately stored
        String Coordinates[] = linestring.split(",");
        String b = Coordinates[0].trim();
        x1 = Double.parseDouble(b);
        String c = Coordinates[1].trim();
        y1 = Double.parseDouble(c);
        
         //asks user for coordinates of another point
        System.out.println("Enter a coordinate in form x,y for the second point: ");
        //stores user input
        String linestring2 = myScan.nextLine();
        //splits user input so the x and y values are seperately stored
        String Coordinates2[] = linestring2.split(",");
        String b2 = Coordinates2[0].trim();
        x2 = Double.parseDouble(b2);
        String c2 = Coordinates2[1].trim();
        y2 = Double.parseDouble(c2);
        
        //asks user to enter circle radius
        System.out.println(" Enter Circle Radius: ");
        //stores the user input
        myRadius = myScan.nextDouble();
        myScan.nextLine();
        //asks user to enter center location coorrdinates
        System.out.println("Enter the coordinates of the center in the form x,y");
        //user input is stored
        String linestring3 = myScan.nextLine();
        //splits user input so the x and y values are seperately stored
        String Coordinates3[] = linestring3.split(",");
        String b3 = Coordinates3[0].trim();
        x3 = Double.parseDouble(b3);
        String c3 = Coordinates3[1].trim();
        y3 = Double.parseDouble(c3);
        
        
        //creates 2 points and a line objects
        Point mypoint1 = new Point (x1, y1);
        Point mypoint2 = new Point (x2, y2);
        Line myLine = new Line(mypoint1, mypoint2);
        
        //creates point object for center location
        Point centerPoint = new Point(x3, y3);
        //circle object 
        thisCircle = new Circle(myRadius);
        thisCircle.setArea();
        thisCircle.setCircumference();
        thisCircle.setLocation(centerPoint);
        
        //displays information about scenario 2 
        System.out.println("***********************\n");
        System.out.println("Scenario 2*\n");
        System.out.println("***********************\n");
        
        System.out.printf("Point 1 is (%.1f,%.1f)\n", x1,y1);
        System.out.printf("Point 2 is (%.1f,%.1f)\n", x2,y2);
        //checks if 2 points equal each other and displays if it does or soesn't
        if (mypoint1.equals(mypoint2)== true){
            System.out.print("The two points are equal\n");
        }
        else{
            System.out.print("The two points are different\n");
        }
        
        //more information about scenario2 is displayed
        System.out.printf("Distance of line segment p1-p2 Length: %.1f\n", myLine.getLength());
        System.out.printf("The Circle Radius: %.1f The center is (%.1f, %.1f) \n", myRadius, x3, y3);
        System.out.printf("The Area of the Circle is: %.1f\n" , thisCircle.getArea());
        double circ = thisCircle.getCircumference();
        System.out.printf("The circumference of the circle is: %.1f \n", circ);
        
        //checks and displays if a point is inside the circle or not
        if (thisCircle.isPointInside(mypoint1) == true) {
            System.out.println("Point 1 is inside the circle.");
        }
        else{
            System.out.println("Point 1 is not inside the circle");
        }
        
    }
    
    /**
     * models scenario one of assignment
     * pre: none
     * post: scenario1 is displayed
     */
    public static void Scenario3(){
        //creates scanner
        Scanner myScan = new Scanner(System.in);
        //dcelares point x and y variables 
        double x1, y1;
        double x2, y2;
        double x3, y3;
        double x4, y4;
        
        //aks user input for a point on a line
        System.out.println("Enter the first end point coordinate for line 1 in form x,y: ");
        //stores the input
        String linestring = myScan.nextLine();
         //splits user input so the x and y values are seperately stored
        String Coordinates[] = linestring.split(",");
        String b = Coordinates[0].trim();
        x1 = Double.parseDouble(b);
        String c = Coordinates[1].trim();
        y1 = Double.parseDouble(c);
        
        //asks the user to input another point on the line
        System.out.println("Enter the second end point coordinate for line 1 in form x,y:  ");
        //user input is stored
        String linestring2 = myScan.nextLine();
        //splits user input so the x and y values are seperately stored
        String Coordinates2[] = linestring2.split(",");
        String b2 = Coordinates2[0].trim();
        x2 = Double.parseDouble(b2);
        String c2 = Coordinates2[1].trim();
        y2 = Double.parseDouble(c2);
        
        //asks the user to input a point the line2
        System.out.println("Enter the first end point coordinate for line 2 in form x,y: ");
        //stores the input
        String linestring3 = myScan.nextLine();
         //splits user input so the x and y values are seperately stored
        String Coordinates3[] = linestring3.split(",");
        String b3 = Coordinates3[0].trim();
        x3 = Double.parseDouble(b3);
        String c3 = Coordinates3[1].trim();
        y3 = Double.parseDouble(c3);
        
        //asks the user to input another point on line2
        System.out.println("Enter the second end point coordinate for line 2 in form x,y: ");
        //stores the input
        String linestring4 = myScan.nextLine();
         //splits user input so the x and y values are seperately stored
        String Coordinates4[] = linestring4.split(",");
        String b4 = Coordinates4[0].trim();
        x4 = Double.parseDouble(b4);
        String c4 = Coordinates4[1].trim();
        y4 = Double.parseDouble(c4);
        
        //creates 4 point objects
        Point mypoint1 = new Point (x1, y1);
        Point mypoint2 = new Point (x2, y2);
        Point mypoint3 = new Point (x3, y3);
        Point mypoint4 = new Point (x4, y4);
        //creates 2 line objects using points as parameters
        Line myLine1 = new Line(mypoint1, mypoint2);
        Line myLine2 = new Line(mypoint3, mypoint4);

        
        //displays scenario3 information
        System.out.println("***********************\n");
        System.out.println("Scenario 3*\n");
        System.out.println("***********************\n");
        System.out.printf("Line (%.1f,%.1f) to (%.1f,%.1f) Length: %.1f Slope: %.1f\n", x1,y1, x2, y2, mypoint1.distanceFrom(mypoint2), myLine1.getSlope());
        System.out.printf("Line (%.1f,%.1f) to (%.1f,%.1f) Length: %.1f Slope: %.1f\n", x3,y3, x4, y4,mypoint3.distanceFrom(mypoint4), myLine2.getSlope());
        //checks if 2 lines are parallel and displays if they are or not
        if (myLine1.isParallel(myLine2) == true) {
            System.out.println("Parallel");
        }
        else{
            System.out.println("Not parallel");
        }
      
}
     
    /**
     * models scenario one of assignment
     * pre: none
     * post: scenario4 is displayed
     */
    public static void Scenario4(){
        //creates scanner
        Scanner myScan = new Scanner(System.in);
        //declares point x and y value variables
        double x1, y1;
        double x2, y2;
        double x3, y3;
        
        //asks user for the first point
        System.out.println("Enter a coordinate in form x,y for the first point: ");
        //stores user input
        String linestring = myScan.nextLine();
        //splits user input so the x and y values are seperately stored
        String Coordinates[] = linestring.split(",");
        String b = Coordinates[0].trim();
        x1 = Double.parseDouble(b);
        String c = Coordinates[1].trim();
        y1 = Double.parseDouble(c);
        
        //asks user for second point
        System.out.println("Enter a coordinate in form x,y for the second point: ");
        //stores user input
        String linestring2 = myScan.nextLine();
        //splits user input so the x and y values are seperately stored
        String Coordinates2[] = linestring2.split(",");
        String b2 = Coordinates2[0].trim();
        x2 = Double.parseDouble(b2);
        String c2 = Coordinates2[1].trim();
        y2 = Double.parseDouble(c2);
        
        //asks user for third point
        System.out.println("Enter the coordinates of the center in the form x,y");
        //stores user input
        String linestring3 = myScan.nextLine();
        //splits user input so the x and y values are seperately stored
        String Coordinates3[] = linestring3.split(",");
        String b3 = Coordinates3[0].trim();
        x3 = Double.parseDouble(b3);
        String c3 = Coordinates3[1].trim();
        y3 = Double.parseDouble(c3);
        
        
        //creates 3 point objects
        Point mypoint1 = new Point (x1, y1);
        Point mypoint2 = new Point (x2, y2);
        Point mypoint3 = new Point(x3, y3);
        //triangle object made using points as parameters
        Triangle tri = new Triangle (mypoint1, mypoint2, mypoint3);
        
        //displays triangle information
        System.out.println("***********************\n");
        System.out.println("Scenario 4*\n");
        System.out.println("***********************\n");
        System.out.printf("Vertex A is (%.1f,%.1f)\n", x1,y1);
        System.out.printf("Vertex B is (%.1f,%.1f)\n", x2,y2);
        System.out.printf("Vertex C is (%.1f,%.1f)\n", x3,y3);
        System.out.printf("The perimeter of the triangle is: %.2f units\n", tri.getPerimeter());
        System.out.printf("The area of the triangle is: %.1f units squared\n", tri.getArea());
        
        //creates array of sidelengths
        double [] myArray = {tri.getAB().getLength(),tri.getAC().getLength(),tri.getBC().getLength()};
        double longestSide = 0;
       //checks for longest sidelength one by one in the for loop
        for  (int  i = 0;  i < myArray.length;  i++)  { 
       if (myArray[i] > longestSide){
           //if the sidelength is longer than the assigned one, the longer one will be assigned
           longestSide = myArray[i];
       }
}
       
       double shortestSide = myArray[0];
       //for loop checks for shortest sidelength
       for  (int  i = 0;  i < myArray.length;  i++)  { 
        //if sidelength is shorter than one assigned, the shorter one will be assigned
           if (myArray[i] < shortestSide){
           shortestSide = myArray[i];
       }
       }

     //longest and shortest sidelengths are displayed with more information
     System.out.printf("The longest side is %.2f units \n", longestSide);
     System.out.printf("The shortest side is %.2f units \n", shortestSide);
        System.out.printf("The location at the centroid is (%.2f, %.2f)\n", tri.centroid().getX(), tri.centroid().getY());
       
        //initializes array for slopes
         double [] myArray2 = {tri.getAB().getSlope(),tri.getAC().getSlope(),tri.getBC().getSlope()};
        boolean rightAngle = false;
        double slopeCheck = myArray2[0];
        //for loop checks if any slopes are negative reciprocals of each other
        for  (int  i = 0;  i < myArray2.length;  i++)  { 
       //if a negative reciprocal slope is found, the triangle is a right triangle
       if (myArray2[0] == (-1/(slopeCheck))){
           rightAngle = true;
        }
        }
        //checks remaining 2 array comparison if its a right triangle
        if (myArray2[1] == (-1/myArray2[2])){
            rightAngle = true;
        }
        //if rightAngle is true than display triangle is a right one
        if (rightAngle == true){
            System.out.printf("The triangle is a right triangle: True\n");
       }
       else{
           //if not than it is not a right triangle
           System.out.printf("The triangle is a right triangle: False\n");
       }
        
        //displays that its a valid triangle if condition is met
        if (tri.isTriangleValid() == true){
            System.out.printf("The triangle is a valid triangle: True\n");
     }
        //if not true than it displays that it is not a valid one
        else{
            System.out.printf("The triangle is a valid triangle: False\n");
        }
     }
     
    /**
     * models scenario one of assignment
     * pre: none
     * post: scenario5 is displayed
     */
    public static void Scenario5(){
        //creates scanner
        Scanner myScan = new Scanner(System.in);
        //declares x and y value variables 
        double x1, y1;
        double x2, y2;
        double x3, y3;
        double x4, y4;
        double xOther, yOther;
      
        //asks user for first coordinate of a line
        System.out.println("Enter the first end point coordinate for line 1 in form x,y: ");
        //stores user input
        String linestring = myScan.nextLine();
        //splits user input so the x and y values are seperately stored
        String Coordinates[] = linestring.split(",");
        String b = Coordinates[0].trim();
        x1 = Double.parseDouble(b);
        String c = Coordinates[1].trim();
        y1 = Double.parseDouble(c);
        
        //asks user for end coordinate of the line
        System.out.println("Enter the second end point coordinate for line 1 in form x,y:  ");
        //stores user input
        String linestring2 = myScan.nextLine();
        //splits user input so the x and y values are seperately stored
        String Coordinates2[] = linestring2.split(",");
        String b2 = Coordinates2[0].trim();
        x2 = Double.parseDouble(b2);
        String c2 = Coordinates2[1].trim();
        y2 = Double.parseDouble(c2);
        
        //asks user input first coordinate of another line
        System.out.println("Enter the first end point coordinate for line 2 in form x,y: ");
        //stores user input
        String linestring3 = myScan.nextLine();
        //splits user input so the x and y values are seperately stored
        String Coordinates3[] = linestring3.split(",");
        String b3 = Coordinates3[0].trim();
        x3 = Double.parseDouble(b3);
        String c3 = Coordinates3[1].trim();
        y3 = Double.parseDouble(c3);
        
        //asks user for a second coordinate for another line
        System.out.println("Enter the second end point coordinate for line 2 in form x,y: ");
        //stores user input
        String linestring4 = myScan.nextLine();
        //splits user input so the x and y values are seperately stored
        String Coordinates4[] = linestring4.split(",");
        String b4 = Coordinates4[0].trim();
        x4 = Double.parseDouble(b4);
        String c4 = Coordinates4[1].trim();
        y4 = Double.parseDouble(c4);
        
        //asks user for another point
        System.out.println("Enter any other point in form x,y:  ");
        //stores user input
        String linestring5 = myScan.nextLine();
        //splits user input so the x and y values are seperately stored
        String Coordinates5[] = linestring5.split(",");
        String b5 = Coordinates5[0].trim();
        xOther = Double.parseDouble(b5);
        String c5 = Coordinates5[1].trim();
        yOther = Double.parseDouble(c5);
        
        //5 point objects created
        Point mypoint1 = new Point (x1, y1);
        Point mypoint2 = new Point (x2, y2);
        Point mypoint3 = new Point (x3, y3);
        Point mypoint4 = new Point (x4, y4);
        Point mypoint5 = new Point (xOther,yOther);
        //2 line objects created
        Line myLine1 = new Line(mypoint1, mypoint2);
        Line myLine2 = new Line(mypoint3, mypoint4);
        
        //displays scenario 5 information
        System.out.println("***********************\n");
        System.out.println("Scenario 5*\n");
        System.out.println("***********************\n");
        System.out.printf("Line (%.1f,%.1f) to (%.1f,%.1f) Length: %.1f Slope: %.2f\n", x1,y1, x2, y2, mypoint1.distanceFrom(mypoint2), myLine1.getSlope());
        System.out.printf("Line (%.1f,%.1f) to (%.1f,%.1f) Length: %.1f Slope: %.1f\n", x3,y3, x4, y4,mypoint3.distanceFrom(mypoint4), myLine2.getSlope());
        
        //checks if 2 lines are parallel and displays if they are or are not
        if (myLine1.isParallel(myLine2) == true) {
            System.out.println("Parallel");
        }
        else{
            System.out.println("Not parallel");
        }
        
        System.out.printf("Shortest distance from (%.1f,%.1f) to the general line for the real set that is colinear to Line 1: %.1f\n ", xOther, yOther, myLine1.shortestDistanceFromPoint(mypoint5));
        System.out.printf("Shortest distance from (%.1f,%.1f) to the general line for the real set that is colinear to Line 2: %.2f\n", xOther, yOther, myLine2.shortestDistanceFromPoint(mypoint5));
        System.out.printf("The point of intersection of L1 and L2: (%.1f,%.1f)\n", myLine1.pointOfInterection(myLine2).getX(),  myLine1.pointOfInterection(myLine2).getY());

        
    }
    
    /**
     * acts as a menu for shapeDriver
     * pre: none
     * post: scenarios called, menu used
     * @param args
     */
    public static void main(String[] args){
        //set menuOption to 0
        int menuOption = 0;
        //this menu continues to run until user presses 6 to quit
        while (menuOption != 6) {
        
        //creates scanner
        Scanner myScan = new Scanner(System.in);
        //asks user menu options
        System.out.println("**************************************");
        System.out.println("Which Scenario would you like to run? \n 1 - Scenario 1 \n 2 - Scenario 2 \n 3 - Scenario 3 \n 4 - Scenario 4 \n 5 - Scenario 5 \n 6 - Quit");
        //stores user input
        menuOption = myScan.nextInt();
        
        //if user input was 1, scenario 1 is called 
        if (menuOption == 1) {
           Scenario1();
        }
        //if user input was 2, scenario 2 is called 
        else if (menuOption == 2) {
           Scenario2();
        }
        //if user input was 3, scenario 3 is called 
        else if (menuOption == 3) {
           Scenario3();
        }
        //if user input was 4, scenario 4 is called 
        else if (menuOption == 4) {
           Scenario4();
        }
        //if user input was 5, scenario 5 is called 
        else if (menuOption == 5) {
           Scenario5();
        }
        }
        //when user presses 6, the program says farewell
        System.out.println("You have chosen to quit - Thank you for using ShapeDriver!");
        }
}

    



  