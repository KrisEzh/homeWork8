package com.company;


public class Main {

    private static Author author;

    public static void main(String[] args) {


        Book idiot = new Book("Идиот", 1869, author);
        Author author = new Author("Федор", "Достоевский");
        System.out.println(author.getAuthorName() + " " + author.getAuthorSurname() + " " + " " + idiot.getBookName() + idiot.getPublishingYear());

        Book harryPotter = new Book("Гарри Поттер", 1997, author);
        Author author1 = new Author("Дж", "Роулинг");
        System.out.println(author.getAuthorName() + " " + author.getAuthorSurname() + " " + harryPotter.getBookName() + harryPotter.getPublishingYear());

        idiot.setPublishingYear(1900);
        System.out.println("idiot.getPublishingYear() = " + idiot.getPublishingYear());


        Book[] books = new Book[5];
        addNewBook(books, idiot);
        addNewBook(books,harryPotter);
        printBooks(books, idiot, harryPotter,author);
    }



    public static Book[] addNewBook(Book[] books, Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null)
                books[i] = book;
            break;
        } return books; }


    public static void printBooks(Book[] books, Book idiot, Book book, Author author) {
        for(int i=0; i< books.length; i++) {
            System.out.println(author.getAuthorName() + " " + author.getAuthorSurname() + ":" + book.getPublishingYear() + ":" + book.getPublishingYear());
        }
    }


}