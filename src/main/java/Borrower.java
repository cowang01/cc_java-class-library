import java.util.ArrayList;

public class Borrower {

    private String name;
    private int id;
    private ArrayList<Book> collection;

    public Borrower (String name, int id){
        this.name = name;
        this.id = id;
        this.collection = new ArrayList<Book>();
    }


    public String getName(){
        return this.name;
    }
}
