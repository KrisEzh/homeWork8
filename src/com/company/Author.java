package com.company;

import java.util.Objects;

public class Author {

    public static String authorName;
    public static String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    @Override
    public String toString() {
        return this.getAuthorName() + " " + this.getAuthorSurname();
    }


    @Override
    public int hashCode() {
        return Objects.hash(authorName);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Author author = (Author) other;
        return authorName.equals(author.authorName);
    }
}
