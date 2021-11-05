package com.company;

import java.util.Objects;

public class Book {
    private Author author;
    private String bookName;
    private int publishingYear;

    public Book(String bookName, int publishingYear, Author author) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.author = author;

    }

    public String getBookName() {
        return this.bookName;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return this.bookName + ": " + this.publishingYear + ": " + this.author;

    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return bookName.equals(book.bookName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }
}