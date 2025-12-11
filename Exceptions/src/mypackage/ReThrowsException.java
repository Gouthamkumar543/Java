package mypackage;

public class ReThrowsException {

	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}catch(ArithmeticException ae){
			throw new NumberFormatException();
		}
	}

}
