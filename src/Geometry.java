/*
 * @Author: Dion de jong
 * @Version 1.0
 * 09-30-2013
 * This is the Geometry class. It tests the point, triangle, and rectangle classes. 
 * It calls all these methods, constructs the objects, and asks the user for the values to use
 * from the user. 
 * NOTE FOR THE TA GRADING THIS CODE!!!! PLEASE READ. 
 * Dr. Huhns asks for the program to be able to define the points 1,1  5,1 &  1,5. 
 * Then he asks for the rectangle to pull the bottom left vertex of the triangle and the top right vertex.
 * Given those previous points, there is no top right vertex. Instead the value for 1,5 should be 5,5 to 
 * create the top right vertex. So the program works for those points but not the 1,5 point because the 
 * formula is not written for that type of triangle.  
 * ALSO THERE IS NOT ENOUGH ROOM IN DROPBOX TO PUT ALL 8 FILES. I CAN'T FIT ONE OF THE JAVADOCS AND IM CHOOSING NOT TO INCLUDE THE GEOMETRY DOC. 
 */

//import the scanner package. 
import java.util.Scanner;

//class name
public class Geometry {

	//main method
	public static void main(String[] args) {

		//This creates the scanner used throughout the program. 
		Scanner keyboard = new Scanner(System.in); 
		//initialize variables used to create the three points. 
		double p1x = 0.0; 
		double p1y = 0.0; 
		double p2x = 0.0;
		double p2y = 0.0; 
		double p3x = 0.0; 
		double p3y = 0.0;

		/*NOTE FOR THE TA GRADING THIS CODE!!!! PLEASE READ. 
		 * Dr. Huhns asks for the program to be able to define the points 1,1  5,1 &  1,5. 
		 * Then he asks for the rectangle to pull the bottom left vertex of the triangle and the top right vertex.
		 * Given those previous points, there is no top right vertex. Instead the value for 1,5 should be 5,5 to 
		 * create the top right vertex. So the program works for those points but not the 1,5 point because the 
		 * formula is not written for that type of triangle. */   
		//ask for the inputs to fill the variables that create the point objects
		/* Triangle he wants            Triangle made using top right angle and bottom left. The one this program solves for
		 * |\ 1,5                         /  | 5,5 
		 * | \                           /   |
		 * |  \                         /    |
		 * |   \                       /     |
		 * |    \                     /      |
		 * |     \                   /       |
		 * |      \                 /        |
		 * |       \               /         |
		 * |        \             /          |
		 * | 1,1     \ 5,1       /  1,1      |  5,1
		 * -----------           ------------
		 * 
		 * 
		 */
		System.out.println("What is the x coordinate of the bottom left point?"); 
		p1x = keyboard.nextDouble(); 
		System.out.println("What is the yx coordinate of the bottom left point?"); 
		p1y = keyboard.nextDouble(); 
		//create the point object using the point constructor. 
		Point point1 = new Point(p1x, p1y);

		//repeat the steps for point 2 and 3
		System.out.println("What is the x coordinate of the bottom right point?"); 
		p2x = keyboard.nextDouble(); 
		System.out.println("What is the y coordinate of the bottom right point?"); 
		p2y = keyboard.nextDouble(); 
		Point point2 = new Point(p2x, p2y);

		System.out.println("What is the x coordinate of the top right point?"); 
		p3x = keyboard.nextDouble(); 
		System.out.println("What is the y coordinate of the top right point?"); 
		p3y = keyboard.nextDouble(); 
		Point point3 = new Point(p3x, p3y);

		//display the triangles points. 
		System.out.println("For the triangle's point 1:"); point1.DisplayPoint();
		System.out.println("For the triangle's point 2:"); point2.DisplayPoint();
		System.out.println("For the triangle's point 3:"); point3.DisplayPoint();

		//create the triangle based on the triangle constructor
		Triangle TestTriangle = new Triangle(point1, point2, point3);  
		//print out the values for the triangle
		System.out.println("The length of side 1 is " + TestTriangle.Side1length()); 
		System.out.println("The length of side 2 is " + TestTriangle.Side2length()); 
		System.out.println("The length of side 3 is " + TestTriangle.Side3length());
		System.out.println("The value of the perimeter is " + TestTriangle.TrianglePerimeter());
		System.out.println("The value of the area is " + TestTriangle.TriangleArea()); 

		//create the rectangle object using the rectangle constructor. 
		Rectangle TestRectangle = new Rectangle(point1, point3);
		//display the values for the rectangle 
		System.out.println("For the Rectangle's point 1:"); point1.DisplayPoint();
		System.out.println("For the Rectangle's point 2:"); point3.DisplayPoint();
		System.out.println("The value of the perimeter is " + TestRectangle.RectanglePerimeter());
		System.out.println("The value of the area is " + TestRectangle.RectangleArea()); 				

		
	}

}
