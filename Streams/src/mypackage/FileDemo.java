package mypackage;
import java.io.*;

public class FileDemo {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\gouth\\Desktop\\Goutham\\Java\\Streams\\Sample.txt");
		System.out.println("Existance : " + f.exists());
		System.out.println("Read mode : " + f.canRead());
		System.out.println("Write mode : " + f.canWrite());
		System.out.println("Executable File : " + f.canExecute());
		System.out.println("Name of the file : " + f.getName());
		System.out.println("Parent name : " + f.getParent());
		System.out.println("path of the File : " + f.getPath());
		System.out.println("Hidden File : " + f.isHidden());
		System.out.println("Length of the File : " + f.length());
		System.out.println("Last Modified : " + f.lastModified());
		System.out.println("It is a File : " + f.isFile());
	}
}