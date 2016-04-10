/*
 * @Author: Dion de jong
 * @Version 1.0
 * 09-30-2013
 * This is the triangle class. It allows you to construct a triangle object. It also has methods
 * to determine the lengths of the sides and the area and perimeter. It constructs the triangle
 * using 3 point objects. 
 */

//The triangle class
public class Triangle {

	//initialize the coordinate variables that make up the 3 point objects. 
	double Side1y = 0.0;
	double Side1x = 0.0;
	double Side2y = 0.0;
	double Side2x = 0.0;
	double Side3y = 0.0;
	double Side3x = 0.0;

	//Initialize the side variable used by the Side calculation methods. 
	double Side1 = 0.0;
	double Side2 = 0.0;
	double Side3 = 0.0;

	//Initialize the variables used by other methods in this class. 
	double TrianglePerimeter = 0.0; 
	double Area = 0.0; 
	double s = 0.0;

	//initialize the point object variables. 
	public Point point1;
	public Point point2;
	public Point point3; 

	//Constructor method for triangle. 
	public Triangle(Point point1, Point point2, Point point3)
	{
		//connect instance variables to variables within variables
		this.point1 = point1; 
		this.point2 = point2; 
		this.point3 = point3; 
	}

	//method for returning the length of Side 1 of the triangle
	public double Side1length()
	{
		//create formulas for x and y sides. 
		double Side1y = point3.y-point2.y;
		double Side1x = point3.x-point2.x;
		//formula for side length 
		double Side1 = Math.sqrt(Side1y*Side1y + Side1x*Side1x ); 
		return Side1; 
	}

	//method for returning the length of Side 2 of the triangle
	public double Side2length()
	{
		//create formulas for x and y sides. 
		double Side2y = point2.y-point1.y;
		double Side2x = point2.x-point1.x;
		//formula for side length 
		double Side2 = Math.sqrt(Side2y*Side2y + Side2x*Side2x ); 
		return Side2; 
	}

	//method for returning the length of Side 3 of the triangle
	public double Side3length()
	{
		//create formulas for x and y sides. 
		double Side3y = point3.y-point1.y;
		double Side3x = point3.x-point1.x;
		//formula for side length 
		double Side3 = Math.sqrt(Side3y*Side3y + Side3x*Side3x ); 
		return Side3; 
	}

	//method for determining the perimeter of the triangle
	public double TrianglePerimeter()
	{
		double TrianglePerimeter = Side1length() + Side2length() + Side3length(); 
		return TrianglePerimeter; 
	}

	//method for determining the area of the triangle
	public double TriangleArea()
	{
		double s = ((Side1length() + Side2length() + Side3length())/2); 
		double Area = Math.sqrt(s*(s - Side1length())*(s - Side2length())*(s -(Side3length()))); 
		return Area;
	}
}
