package methods;

public class Test {

	public static void main(String[] args) {
		Accountmanagement customer = new Accountmanagement();
		customer.insertData();
		customer.displayData();
		customer.depositAmount();
		customer.accountBalance();
		customer.withdrawAmount();
		customer.accountBalance();
	}

}
