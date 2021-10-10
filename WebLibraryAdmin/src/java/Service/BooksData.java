package Service;

import java.util.HashMap;
import java.util.Map;
import Model.Books;

public class BooksData {

    final private Map<String, Books> books = new HashMap<>();
    final private static BooksData instance = new BooksData();

    BooksData() {
        books.put("The flash", new Books("The flash", "Comic", "american","5"));
        books.put("WW2", new Books("WW2","NonFiction","Wiki","7"));
        books.put("Little smile", new Books("Little smile", "looop", "Mr.Suenggi","8"));
    }

    public static BooksData getInstance() {
        return instance;
    }

    public Books getBooks(String name) {
        return books.get(name);
    }

}
