package package3;

import java.util.Scanner;

public class EmployeeDemo {
	
	protected int emp_id;
	public String emp_name;
    private	float emp_sal;
    String emp_deptt;
    
    //input method
 public   void inputData()
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter emp deptt.: ");
    	emp_deptt = sc.next();
    	
    	System.out.println("Enter emp_name: ");
    	emp_name = sc.next();
    	
    	System.out.println("Enter emp id: ");
    	emp_id = sc.nextInt();
    	
    	System.out.println("Enter emp salary: ");
    	emp_sal = sc.nextFloat();
    	
    }
 
    //public method
    public void doPublic()
    {
System.out.println("In PUBLIC method:");
System.out.println("Deppt: "+emp_deptt+" Name: "+emp_name+" Id: "+emp_id+" Salary: "+emp_sal);
    	
    	
    }
    //default method
    void doDefault()
    {
    	System.out.println("In DEFAULT method:");
    	System.out.println("Deppt: "+emp_deptt+" Name: "+emp_name+" Id: "+emp_id+" Salary: "+emp_sal);
	
    }
    //protected method
    protected void doProtected()
    {
    	System.out.println("In PROTECTED method:");
    	System.out.println("Deppt: "+emp_deptt+" Name: "+emp_name+" Id: "+emp_id+" Salary: "+emp_sal);

    	doPrivate();
    }
    //private method
    private void doPrivate()
    {
    	System.out.println("In PRIVATE method:");
    	System.out.println("Deppt: "+emp_deptt+" Name: "+emp_name+" Id: "+emp_id+" Salary: "+emp_sal);

    	
    }
    

}
