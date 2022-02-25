package pro.sky.java.course1;

import java.util.Objects;

public class Book {
    private final String name;
    private int yearOfPublication;
    private Author author;
    private String yearOfPublicationIsEmpty;
    private String authorIsEmpty;

    //___конструкторы для класса Book
    public Book(String name, int year, Author author) {
        this.name = name;
        this.yearOfPublication = year;
        this.author = author;
    }

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, int yearOfPublication) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
    }

    public Book(String name) {
        this.name = name;
    }
//___________________________

    public String getName() {
        return name;
    }

    public String getFirstnameOfAuthor() {
        return author.getFirstname();
    }

    public String getSurNameOfAuthor() {
        return author.getSurName();
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    //переопределение методов
    public String toString() {
        if ((yearOfPublication == 0) && (author == null))
            yearOfPublicationIsEmpty = "- Год публикации не указан,";
        authorIsEmpty = "автор не указан";
        return name + " " + yearOfPublicationIsEmpty + " " + authorIsEmpty;
    }

    public int hashCode() {
        return Objects.hash(name, yearOfPublication, author);
    }


    public boolean equals(Book book) {
        if (this == book) {
            return true;
        }
        if (book == null)
            return false;
        return false;
    }

}
