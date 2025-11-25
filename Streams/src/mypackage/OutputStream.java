package mypackage;
import java.io.*;

public class OutputStream {
	public static void main(String[] args) throws IOException{
		FileOutputStream f = new FileOutputStream("C:\\Users\\gouth\\Desktop\\Goutham\\Java\\Streams\\Sample.txt");
		
		String g = "Welcome to file Input and Output";	//Write method will rewrite the entire text means it erase the previous text and write new text 
		
		byte b[] = g.getBytes(); 	//Converting string into bytes
		
		f.write(b);	//to convert byte code to text, write auto converts byte into string
		f.flush();	//To send complete data at once or complete bytes in single go
		f.close();  //close the file
		
		System.out.println("Done write");	//To  get output after completing write method
	}

}
