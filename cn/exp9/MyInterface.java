import java.rmi.*;
public interface MyInterface extends Remote {
public String countInput(String s) throws RemoteException;
}