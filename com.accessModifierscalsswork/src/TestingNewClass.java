import package3.EmployeeDemo;

public class TestingNewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDemo emp1 = new EmployeeDemo();
		emp1.inputData();//public
		emp1.doPublic();//public
	//	emp1.doDefault();//not accessible
		//emp1.doProtected();//not accessible
		// emp1.doprivate(); not accessible

	}

}
