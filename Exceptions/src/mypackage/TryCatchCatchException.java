package mypackage;


// Multiple catch clauses
public class TryCatchCatchException {
	public static void main(String args[]) {
		try {
			int list[] = new int[5];
			list[2] = 10;
			list[4] = 2;
			list[3] = list[2]/2;
			System.out.println(list[3]);
			list[10] = list[2] / list[4];	//It will show array index out of bounds error in catch2
			System.out.println(list[10]);	//It only give first error exception, If any other error is present it throws exception only when before error is solved
			list[6] = list[2]/0;	//This is show catch1 error
			System.out.println(list[6]);	//This will print when above error is solved or else this lines will not execute
		}catch(ArithmeticException ae) {
			System.out.println("Value of divisor can not be ZERO.");
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("ArrayIndexOutOfBoundsException has occured.");
		}catch(Exception e) {
			System.out.println(" Unknown exception has occured.");
		}
	}
}
