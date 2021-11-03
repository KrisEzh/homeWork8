package com.company;

public class Book {

    private Author author;
    private String bookName;
    private static int publishingYear;
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

}