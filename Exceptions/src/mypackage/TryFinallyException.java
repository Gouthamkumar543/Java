package mypackage;

public class TryFinallyException {

	public static void main(String[] args) {
		try {
			int a = 2;
			int b = 3;
			System.out.println(a+b);	//It will output becz no error 
			System.out.println(a/0);	//It wont execute becz of error so catch block will be executed
		}catch(ArithmeticException ae) {
			System.out.println("Cant divisible by 0");
		}finally {
			System.out.println("Finally first block");	//Finally block will executed in any case
		}
		
		
		try {
			int a = 4;
			int b = 8;
			System.out.println(a+b);
		}finally {
			System.out.println("Finally second block");
		}

	}

}
