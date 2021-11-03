package com.company;
public class Book {

    private String bookName;
    private static int publishingYear;

    public Book(String bookName, int publishingYear) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;

    }
    public String getBookName() {
        return this.bookName;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }

    public static void setPublishingYear(int publishingYear) {
        Book.publishingYear = publishingYear;
    }
}