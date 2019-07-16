import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> stock;

    public Library (String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }


    public void addBook(Book book){
        if (this.stock.size() < this.capacity){
        this.stock.add(book);
    }}

    public String getName(){
        return this.name;
    }

    public int getNumberOfBooks(){
        return this.stock.size();
    }
}
