import java.rmi.*;
import java.rmi.server.*;
public class RMIServer extends UnicastRemoteObject implements MyInterface {
RMIServer() throws RemoteException {
super();
}
public String countInput(String s) {
return "Length: " + s.length();
}
public static void main(String[] args) {
try {
Naming.rebind("rmiInterface", new RMIServer());
System.out.println("RMI Server Ready");
} catch (Exception e) {
System.out.println(e);
}
}
}