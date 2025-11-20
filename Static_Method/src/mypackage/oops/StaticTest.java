package mypackage.oops;

public class StaticTest {
	static void function() {
		System.out.println("Hello this is goutham");
	}
	static void function1() {
		System.out.println("Hiiii this is kumar");
	}
	public static void main(String [] args) {
		function(); //Accessing function directly
		StaticTest.function1(); //Accessing function with the help of class name
	}
}
