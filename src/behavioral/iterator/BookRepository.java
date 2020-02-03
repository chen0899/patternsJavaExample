package behavioral.iterator;

import java.util.Iterator;

import static java.util.Objects.nonNull;

public class BookRepository implements Iterable<Book>{

    Book [] books = new Book[10];
    int index = 0;

    public void addBook (Book book) {
        books[index] = book;
        index++;
    }



    @Override
    public Iterator<Book> iterator() {
        return new Iterator<Book>() {

            int iteratorIndex = 0;

            @Override
            public boolean hasNext() {
                if (iteratorIndex < books.length && nonNull(books[iteratorIndex])) {
                    return true;
                }

                return false;
            }

            @Override
            public Book next() {
                return books[iteratorIndex++];
            }
        };
    }
}
