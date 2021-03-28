package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdaptee;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> bookMap = new HashMap<>();
        for (Book theBook : bookSet) {
            bookMap.put(new BookSignature(theBook.getSignature()),
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(theBook.getAuthor(), theBook.getTitle(),
                            theBook.getPublicationYear()));
        }
        return medianPublicationYear(bookMap);
    }
}
