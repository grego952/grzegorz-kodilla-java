package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;

public final class Book {

    final String title;
    final String author;
    final LocalDate publishYear;

    public Book(String title, String author, LocalDate publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublishYear() {
        return publishYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }
}
