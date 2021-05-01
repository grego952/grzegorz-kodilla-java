package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.MedianAdapter;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("J.R.R. Tolkien", "Lord of THe Rings", 1938, "001"));
        books.add(new Book("Terry Pratchett", "The Colour of Magic", 1991, "002"));
        books.add(new Book("Stephen King", "The Shining", 1978, "003"));

        MedianAdapter adapter = new MedianAdapter();

        //When
        int result = adapter.publicationYearMedian(books);

        //Then
        assertEquals(1978, result);

    }
}
