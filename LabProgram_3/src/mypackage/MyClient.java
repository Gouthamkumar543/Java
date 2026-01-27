//3. Write an RMI application using call back mechanism
package mypackage;

import java.rmi.*;

public class MyClient {
    public static void main(String args[]) {
        try {
            Adder st = (Adder) Naming.lookup("rmi://localhost:8000/add");
            System.out.println("Successfully Connected! using RMI");
            System.out.println("Result: " + st.add(34, 4));
        } catch (Exception e) {
            System.err.println("Client Side exception: " + e.toString());
            e.printStackTrace();
        }
    }
}