package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapteeTestSuite {

    @Test
    void testMedianAdapteeMethods() {
        //Given
        MedianAdaptee medianAdaptee = new MedianAdaptee();
        Book book1 = new Book("Test Author1", "Test Title1", 1999);
        Book book2 = new Book("Test Author2", "Test Title2", 2000);
        Book book3 = new Book("Test Author3", "Test Title3", 2001);
        BookSignature bookSignature1 = new BookSignature("001");
        BookSignature bookSignature2 = new BookSignature("002");
        BookSignature bookSignature3 = new BookSignature("003");
        Map<BookSignature, Book> books = new HashMap<>();
        books.put(bookSignature1, book1);
        books.put(bookSignature2, book2);
        books.put(bookSignature3, book3);

        //When
        int averageResult = medianAdaptee.averagePublicationYear(books);
        int medianResult = medianAdaptee.medianPublicationYear(books);


        //Then
        assertEquals(2000, averageResult);
        assertEquals(2000, medianResult);
    }
}
