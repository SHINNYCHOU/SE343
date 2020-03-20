import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class WarehouseImpl extends UnicastRemoteObject implements Warehouse{

    private Map<String,Book> books;
    protected WarehouseImpl() throws RemoteException {
        books= new HashMap<String, Book>();
        Book tem1=new Book("572819293", "java入门",3,32.3);
        Book tem2=new Book("572459293", "简爱",22,22.9);
        books.put("java入门",tem1);
        books.put("简爱",tem2);

    }

    public Book getBook(String name) throws RemoteException {
//        写成book service.findbookRemote,上面的构造为空。
//        相当于server调用service里的findbookRemote（一个新写的rmi函数，内部逻辑调用service本来的find就行）。
//        如果要把rmi整合到ebook，就是一个server文件夹一个client，每个里面都放上jndi properties，
//        server文件夹再包含warehouse和impl这两个去调用service里的具体函数
        return books.get(name);
    }
}
