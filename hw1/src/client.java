import javax.naming.*;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws NamingException, RemoteException {
        Context namingContext = new InitialContext();

        String url = "rmi://localhost/central_warehouse";
        Warehouse centralWarehouse = (Warehouse) namingContext.lookup(url);

//        NamingEnumeration<NameClassPair> e = namingContext.list("rmi://localhost/");
        Scanner in = new Scanner(System.in); System.out.print("Enter keywords: ");
        String keyword=in.next();
        Book book = centralWarehouse.getBook(keyword);
        System.out.println(book.toString());
    }
}
