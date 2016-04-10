/*
 * @Author: Dion de jong
 * @Version 1.0
 * 09-30-2013
 * This is the Rectangle class. It allows you to construct a Rectangle object. 
 * It also has methods that find the area and the perimeter of the rectangle object.
 * It constructs the rectangle using two point objects. 
 */

public class Rectangle {

	//initialize the point object variables. 
	private Point point1;
	private Point point2;
	private Point point3; 

	//Constructor method for rectangle. 
	public Rectangle(Point point1, Point point3)
	{
		this.point1 = point1; 
		this.point3 = point3; 
	}
	//x1, y2    x2, y2
	//----------
	//|         |
	//|         | 
	//----------
	//x1,y1     x2, y1
	//Perimeter method

	//The method for determining the perimeter
	public double RectanglePerimeter()
	{
		double length = point3.x - point1.x; 
		double height = point3.y - point1.y; 
		double RectanglePerimeter = length + length + height + height; 
		return RectanglePerimeter; 
	}

	//the method for the area of the rectangle. 
	public double RectangleArea()
	{
		double length = point3.x - point1.x; 
		double height = point3.y - point1.y; 
		double RectangleArea = length * height;
		return RectangleArea; 
	}
}
