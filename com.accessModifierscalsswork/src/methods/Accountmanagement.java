package methods;

import java.util.Scanner;

public class Accountmanagement {
	
	String name;
	String accNo;
	String accType;
	String branch;
	float totalBalance=1000;
	float amount;
	
	
	  Scanner sc = new Scanner(System.in);
	   
   void insertData()
	{
	 
	   System.out.println("Enter Customer's Name: ");
	   name =sc.next();
	   
	   System.out.println("Enter Account number: ");
	   accNo=sc.next();
	
	   System.out.println("Enter Account Type: ");
	   accType = sc.next();
	
	   System.out.println("Enter branch: ");
	   branch = sc.next();	
	}
   
   void displayData()
   {
	   System.out.println("Customer Details are: ");
	   System.out.println("Name: "+name);
	   System.out.println("Account number: "+accNo);
	   System.out.println("Account type: "+accType);
	   System.out.println("Branch: "+branch);
   }
   void depositAmount()
   {
	   float tempAmount;
	   System.out.println("Enter amount you want to deposit: ");
	   tempAmount = sc.nextFloat();
	   totalBalance = totalBalance+tempAmount;
	   
   }
   void withdrawAmount()
   {
	   float tempWithdrawl;
	   System.out.println("Enter amount to be withdrawl: ");
	   tempWithdrawl =  sc.nextFloat();
	   totalBalance = totalBalance - tempWithdrawl;
	   
	   
   }
   void accountBalance()
   {
	   System.out.println("Available balance is : "+totalBalance);
   }

}
