package methods;

import java.util.Scanner;

public class Student {
	
	String name;
	int rollNo;
	String contactNo;
	float totalMarks;
	
	void inputData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		name = sc.next();
		
		System.out.println("Enter rollNo: ");
		rollNo = sc.nextInt();
		
		System.out.println("Enter contact number: ");
		contactNo = sc.next();
		
		System.out.println("Enter total marks obtained : ");
		totalMarks = sc.nextFloat();
	}
	
	void displayData()
	{
		System.out.println("Name is : "+name);
		System.out.println("RollNo is : "+rollNo);
		System.out.println("Contact number is : "+contactNo);
		System.out.println("Total marks obtained is : "+totalMarks);
	}

}









