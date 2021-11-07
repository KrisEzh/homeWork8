package com.company;

import java.util.Objects;

public class Book {
    private final Author author;
    private final String bookName;
    private int publishingYear;

    public Book(Author author, String bookName, int publishingYear) {
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;


    }

    public Author getAuthor() {
        return this.author;
    }

    public   String getBookName() {
        return this.bookName;
    }
    public  int getPublishingYear() {
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
        return Objects.equals(bookName, author) && Objects.equals(bookName, author);
    }


    @Override
    public int hashCode() {
        return Objects.hash(bookName,author);
    }
}