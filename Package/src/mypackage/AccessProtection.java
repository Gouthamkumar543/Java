package mypackage;

class ParentClass{
	int a = 10;	//This can access in same package not in other packages
	public int b = 20;	//Can be accessed by any one
	protected int c = 30;	//Can be accessed by parent, child, nonchild and child in other package
	private int d = 40;   //This can be accessed only by parent 
	
	void ParentData() {
		System.out.println("Inside ParentClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
}

class ChildClass extends ParentClass{
	void ChildData() {
		System.out.println("Inside ChildClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		//System.out.println("d = " + d); // d cant access becz it is private nd cant be accessed by any other class expect parent
	}
}

public class AccessProtection {
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.ParentData();
		obj.ChildData();
	}
}
