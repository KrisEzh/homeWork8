package com.company;


public class Main {

    public static void main(String[] args) {


        Book idiot = new Book("Идиот", 1869, "Федор", "Достоевский");
        Author idiotAuthor = new Author("Федор", "Достоевский");
        System.out.println(idiotAuthor.getAuthorName() + " " + idiotAuthor.getAuthorSurname() + " " + idiot.getBookName() + idiot.getPublishingYear());

        Book harryPotter = new Book("Гарри Поттер", 1997, "Дж", "Роулинг");
        Author harryPotterAuthor = new Author("Дж", "Роулинг");
        System.out.println(harryPotterAuthor.getAuthorName() + " " + harryPotterAuthor.getAuthorSurname() + " " + harryPotter.getBookName() + harryPotter.getPublishingYear());

        idiot.setPublishingYear(1900);
        System.out.println("idiot.getPublishingYear() = " + idiot.getPublishingYear());


    }


}