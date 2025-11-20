package mypackage.oops;

public class ThisKeyword {
	float a = 10.9f; //Instance variable or global variable
	
	void showThis() {
		float a = 9.9f; //Local variable
		System.out.println("local variable = "+a); //This print only local variable
		System.out.println("global variable = "+this.a); //Using this keyword we can access the global variable
	}
	
	public static void main(String [] args) {
		ThisKeyword obj = new ThisKeyword();
		obj.showThis();
	}
}
