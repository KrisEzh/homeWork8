package com.company;


import static com.company.Author.authorName;

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


    }


}