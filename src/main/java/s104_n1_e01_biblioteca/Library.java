package s104_n1_e01_biblioteca;

import java.util.*;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        ensureTitleIsAvailable(book.title());
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return List.copyOf(this.books);
    }

    public String getTitleAt(int position) {
        return this.books.get(position).title();
    }

    public void addBookAt(int position, Book book) {
        ensureTitleIsAvailable(book.title());
        this.books.add(position, book);
    }

    public boolean removeByTitle(String title) {
        Iterator<Book> it = this.books.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            if (book.title().equals(title)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public List<Book> getBooksSortedByTitle() {
        List<Book> sorted = new ArrayList<>(this.books);
        sorted.sort(Comparator.comparing(Book::title, String.CASE_INSENSITIVE_ORDER));
        return List.copyOf(sorted);
    }

    private void ensureTitleIsAvailable(String title) {
        for (Book book : this.books) {
            if (book.title().equalsIgnoreCase(title)) {
                throw new IllegalArgumentException("A book with title '" + title + "' already exists");
            }
        }
    }
}
