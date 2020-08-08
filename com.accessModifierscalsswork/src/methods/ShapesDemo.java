package methods;

public class ShapesDemo {

	int area;
	
	//area of square
		void area(int side)
		{
			area = side*side;
			System.out.println("Area of square is :"+area);
		}
		
	//area of rectangle
	void area(int length,int breadth)
	{
		area = length * breadth;
		System.out.println("Area of reactangle is : "+area);
	}
	
	//area of triangle
	void area(int base,int altitude,int side3)
	{
		float area1 = 0.5f *(base*altitude);
		System.out.println("Area of triangle is: "+area1);
	}
	

}
