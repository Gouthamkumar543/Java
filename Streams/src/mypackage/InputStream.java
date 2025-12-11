package mypackage;
import java.io.*;

public class InputStream {
	public static void main(String[] args) throws IOException{

		FileInputStream f = new FileInputStream("C:\\Users\\gouth\\Desktop\\Goutham\\Java\\Streams\\Sample.txt");
		System.out.println("Available letters in the file: " + f.available());
		
		byte b[] = new byte[100];  //If we take 10 we will get only 10 letters from the file
		
		f.read(b);
		String data = new String(b); // Convert byte array into string
		
		System.out.println("Data read from the file");
		System.out.println(data);
		
		f.close(); // Close the file
	}

}
