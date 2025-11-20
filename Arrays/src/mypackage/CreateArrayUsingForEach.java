package mypackage;

public class CreateArrayUsingForEach {
	public static void main(String[] args) {
		int marks[] = {19,287,928,989,909};
		
		for(int i:marks){ //No need to give for each directly add mark in one variable
			System.out.println(i);
		}
	}

}
