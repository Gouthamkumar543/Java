package mypackage;

import java.rmi.*;
import java.rmi.registry.*;

public class MyServer {
    public static void main(String args[]) {
        try {
            Adder stub = new AdderRemote();
            LocateRegistry.createRegistry(8000);
            Naming.rebind("rmi://localhost:8000/add", stub);
            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}