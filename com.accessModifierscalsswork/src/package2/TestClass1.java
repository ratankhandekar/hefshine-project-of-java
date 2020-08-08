package package2;

import package1.Employee;

public class TestClass1 extends Employee {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.name);
		
		TestClass1 t = new TestClass1();
		System.out.println(t.name);
		t.m1();
	
		
	}

}
