package mypackage.oops;

public class StaticAndInstanceTest {
	int a = 10; //Instance variable 
	static int b = 20; //Static variable - this is global variable
	
	void function1() {  // This is Instance function declared without static so we have to create a object to access
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	static void function2() { //This is static function can access by calling function name or class.functionName
		System.out.println("b="+b);
	}
	
	public static void main(String []args) {
		StaticAndInstanceTest obj = new StaticAndInstanceTest();
		obj.function1(); //Instance Function Called using object
		function2(); ///Static function so called by function name
	}
}
