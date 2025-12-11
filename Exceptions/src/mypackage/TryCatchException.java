package mypackage;


//Try Catch
public class TryCatchException {
	public static void main(String args[]) {
		try {
			int list[] = new int[5];
			list[2] = 10;
			list[4] = 0;
			list[3] = list[2]/2;
			System.out.println(list[3]);	//It will execute until no errors, if any error found goes to catch
			list[10] = list[2]/list[4];
			System.out.println(list[10]);	//Lines present after lines will also not execute
		}catch(ArithmeticException ae) {
			System.out.println("value cant not divisible by 0");
		}
	}
}
