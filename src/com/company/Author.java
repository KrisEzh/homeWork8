package com.company;
public class Author {
    private static String authorName;
    private static String authorSurname;

    public Author(String authorName, String authorSurname){
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    public String getAuthorName() {
        return authorName;
    }
    public String getAuthorSurname() {
        return authorSurname;
    }


}
