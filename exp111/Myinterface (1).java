import java.rmi.*;

public interface Myinterface extends Remote {

    String countInput(String input) throws RemoteException;
}
