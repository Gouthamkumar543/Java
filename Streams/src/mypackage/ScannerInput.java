package mypackage;
import java.util.*;

public class ScannerInput {
	public static void main(String[] args) {	//by default it takes string values
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");	//This line says what to do for the user
		String str=sc.nextLine();	//next go to next line nd writes the string
		
		System.out.println("Enter Integer number");
		int num=sc.nextInt();	//go next line and converts default string to int
		
		System.out.println("Enter Float number");
		float real=sc.nextFloat();	//go next line and converts default string to float
		
		System.out.println("\n------------------------------------------");
		System.out.println("Entered String is "+ str);
		System.out.println("Entered Integer Number is "+ num);
		System.out.println("Entered Float Number is "+ real);
	}
}