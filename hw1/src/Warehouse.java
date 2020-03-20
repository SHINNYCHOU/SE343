import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Warehouse  extends Remote {
    Book getBook(String name)throws RemoteException;
}
