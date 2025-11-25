package mypackage;
import java.io.*;

public class WriteReadDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\gouth\\Desktop\\Goutham\\Java\\Streams\\File.txt");
		FileReader fr = new FileReader("C:\\Users\\gouth\\Desktop\\Goutham\\Java\\Streams\\File.txt");
		
		fw.write(78);	//returns ascii values
		fw.write("\n");
		
		fw.write("My name is Goutham Kumar.gandikota");
		fw.write("\n");
		
		char ch[] = {'a','b','c'};
		fw.write(ch);
		
		fw.flush();
		
		int i = fr.read();
		while(i != -1) {
			System.out.print((char)i);
			i=fr.read();
		}
		
		fw.close();
	}
}