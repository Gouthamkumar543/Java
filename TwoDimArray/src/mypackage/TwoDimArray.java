package mypackage;

public class TwoDimArray {

	public static void main(String[] args) {
		int a[][] = {{1,2,4,5457,54},{35,356,86,79}};
		for(int i=0;i < a.length;i++) {
			for(int j= 0; j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
