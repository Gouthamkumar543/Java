package mypackage;

public class ThrowException {

	static void Fuction(int age) {
		if(age < 18) {
			throw new ArithmeticException("Not eligible to vote");
		}else {
			System.out.println("Can vote");
		}
	}
	
	public static void main(String[] args) {
		Fuction(20);
		Fuction(25);
		Fuction(12);	//Once error occurred next lines will not execute 
		Fuction(32);
		Fuction(10);
	}

}
