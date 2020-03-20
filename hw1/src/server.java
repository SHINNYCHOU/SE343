import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;

public class server {
    public static void main(String[] args) throws
            RemoteException, NamingException {
        WarehouseImpl centralWarehouse = new WarehouseImpl();
        Context namingContext = new InitialContext();
        namingContext.bind("rmi:central_warehouse", centralWarehouse);

    }
}
