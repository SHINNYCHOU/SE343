import java.io.Serializable;

public class Book implements Serializable {
    private String isbn;
    private String name;
    private Integer store;
    private Double price;

    public Book(String isbn,String name,Integer store,Double price){
        this.isbn=isbn;
        this.name=name;
        this.store=store;
        this.price=price;
    }
}
