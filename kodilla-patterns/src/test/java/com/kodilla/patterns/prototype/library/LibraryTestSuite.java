package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {

        //given

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", LocalDate.of(1951, 12, 23));
        Book book2 = new Book("The Shining", "Stephen King", LocalDate.of(1977, 01, 28));
        Book book3 = new Book("The Lord of The Rings", "J.R.R. Tolkien", LocalDate.of(1954, 07, 29));

        Library library = new Library("Modern Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow clone
        Library clonedLibrary = null;

        try {
            clonedLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep clone
        Library deepClonedLibrary = null;

        try {
            deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then

        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
