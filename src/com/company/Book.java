package com.company;

import static com.company.Author.authorName;
import static com.company.Author.authorSurname;

public class Book {
    private String authorName;
    private String authorSurname;
    Author author = new Author(authorName, authorSurname);
    private String bookName;
    private static int publishingYear;

    public Book(String bookName, int publishingYear, String authorName, String authorSurname) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.authorName = Author.authorName;
        this.authorSurname = Author.authorSurname;}

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