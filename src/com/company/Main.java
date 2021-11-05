package com.company;


public class Main {
    //private static Author author;
   // private Book book;

    public static void main(String[] args) {

        Author idiotAuthor = new Author("Федор", "Достоевский");
        Book idiot = new Book("Идиот", 1967, idiotAuthor);
        System.out.println(idiot);

        Author harryPotterAuthor = new Author("Дж", "Роулинг");
        Book harryPotter = new Book("Гарри Поттер", 1997, harryPotterAuthor);

        System.out.println(harryPotter);

        System.out.println(idiot.getBookName().equals(harryPotter.getBookName()));
        System.out.println(Author.authorName.equals(Author.authorName));
        System.out.println(idiot.hashCode());
        System.out.println(harryPotter.hashCode());
        System.out.println(idiotAuthor.hashCode());
        System.out.println(harryPotterAuthor.hashCode());


        //idiot.setPublishingYear(1900);
        //System.out.println("idiot.getPublishingYear() = " + idiot.getPublishingYear());


        //Book[] books = new Book[5];
        //books = addNewBook(books, idiot);
        //books = addNewBook(books, harryPotter);
        //printBooks(books, author, idiot);
    }

    //public static Book[] addNewBook(Book[] books, Book book) {
      //  for (int i = 0; i < books.length; i++) {
        //    if (books[i] == null)
          //      books[i] = book;
            //break;
        //}
        //return books;
    //}

    //public static void printBooks(Book[] books, Author author, Book idiot) {
      //  for(int i=0; i< books.length; i++)   {
        //    Book book = books[i];
          //  System.out.println(author.getAuthorName() + " " + author.getAuthorSurname() + ":" + book.getBookName() + ":" + book.getPublishingYear());
        //}
    }


