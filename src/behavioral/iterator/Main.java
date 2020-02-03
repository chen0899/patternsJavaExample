package behavioral.iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Book1");
        Book book2 = new Book("Book2");
        Book book3 = new Book("Book3");

        BookRepository bookRepository = new BookRepository();

        bookRepository.addBook(book1);
        bookRepository.addBook(book2);
        bookRepository.addBook(book3);

       Iterator<Book> iterator = bookRepository.iterator();


        for (Book book: bookRepository) {
            System.out.println(book);
        } 
    }
}
