package com.company;


import java.awt.*;

public class Main {
    //private static Author author;
    // private Book book;

    public static void main(String[] args) {

        Author idiotAuthor = new Author("Федор", "Достоевский");
        Book idiot = new Book(idiotAuthor, "Идиот", 1867);
        System.out.println(idiot);

        Author harryPotterAuthor = new Author("Дж", "Роулинг");
        Book harryPotter = new Book(harryPotterAuthor, "Гарри Поттер", 1995);

        System.out.println(harryPotter);

        System.out.println(idiot.getBookName().equals(harryPotter.getBookName()));
        System.out.println(idiotAuthor.equals(harryPotterAuthor));
        System.out.println(idiot.hashCode());
        System.out.println(harryPotter.hashCode());
        System.out.println(idiotAuthor.hashCode());
        System.out.println(harryPotterAuthor.hashCode());


        //idiot.setPublishingYear(1900);
        //System.out.println("idiot.getPublishingYear() = " + idiot.getPublishingYear());
    } }

