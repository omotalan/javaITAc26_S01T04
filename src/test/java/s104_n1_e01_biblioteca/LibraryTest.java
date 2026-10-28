package s104_n1_e01_biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LibraryTest {

    private final Book warAndPeace = new Book("War and Peace");
    private final Book brothersKaramazov = new Book("Brothers Karamazov");
    private final Book theGambler = new Book("The Gambler");

    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    @DisplayName("La col·lecció no ha de ser nul·la després d’instanciar la classe.")
    void libraryIsNotNullAfterInstantiation() {
        assertNotNull(library);
    }

    @Test
    @DisplayName("La mida de la col·lecció és correcta després d’afegir diversos llibres.")
    void sizeIsCorrectAfterAddingSeveralBooks() {
        library.addBook(warAndPeace);
        library.addBook(brothersKaramazov);
        library.addBook(theGambler);

        assertEquals(3, library.getBooks().size());
    }

    @Test
    @DisplayName("Els llibres es troben a la posició esperada un cop afegits.")
    void booksKeepInsertionOrder() {
        library.addBook(warAndPeace);
        library.addBook(brothersKaramazov);
        library.addBook(theGambler);

        assertEquals(List.of(warAndPeace, brothersKaramazov, theGambler), library.getBooks());
    }

    @Test
    @DisplayName("El mètode per obtenir un llibre per posició retorna el títol correcte.")
    void getTitleAtReturnsCorrectTitle() {
        library.addBook(warAndPeace);
        library.addBook(brothersKaramazov);

        assertEquals("Brothers Karamazov", library.getTitleAt(1));
    }

    @Test
    @DisplayName("Afegir un llibre en una posició concreta modifica correctament la col·lecció.")
    void addBookAtPositionInsertsCorrectly() {
        library.addBook(warAndPeace);
        library.addBook(theGambler);

        library.addBookAt(1, brothersKaramazov);

        assertEquals(List.of(warAndPeace, brothersKaramazov, theGambler), library.getBooks());
    }

    @Test
    @DisplayName("Eliminar un llibre pel títol redueix la mida de la col·lecció.")
    void removeByTitleReducesSize() {
        library.addBook(warAndPeace);
        library.addBook(brothersKaramazov);

        boolean removed = library.removeByTitle("War and Peace");

        assertTrue(removed);
        assertEquals(1, library.getBooks().size());
        assertEquals(List.of(brothersKaramazov), library.getBooks());
    }

    @Test
    @DisplayName("La llista ordenada retorna els llibres en ordre alfabètic (sense modificar la col·lecció original).")
    void sortedBooksAreAlphabeticalAndOriginalUnchanged() {
        library.addBook(theGambler);
        library.addBook(warAndPeace);
        library.addBook(brothersKaramazov);

        List<Book> sorted = library.getBooksSortedByTitle();

        assertEquals(List.of(brothersKaramazov, theGambler, warAndPeace), sorted);
        assertEquals(List.of(theGambler, warAndPeace, brothersKaramazov), library.getBooks());
    }

    @Test
    @DisplayName("No s’han de permetre llibres amb títols duplicats.")
    void duplicateTitleIsRejected() {
        library.addBook(warAndPeace);

        assertThrows(IllegalArgumentException.class, () -> library.addBook(new Book("War and Peace")));
        assertEquals(1, library.getBooks().size());
    }
}
