/*
 * @Author: Dion de jong
 * @Version 1.0
 * 09-30-2013
 * This is the point class. It allows you to construct a point object. it also has a display method. 
 */

//Point class
public class Point {

	//initialize and declare the two points used in the point constructor. 
	public double x = 0.0;
	public double y = 0.0; 

	//The constructor for the point object. 
	public Point(double x, double y)
	{
		//associate the parameters with the public instance variables. 
		this.x = x;
		this.y = y;		
	}

	//The display method
	public void DisplayPoint()
	{
		//What the display method prints. 
		System.out.println("The coordinates are: " + x +"," + y);
	}


}