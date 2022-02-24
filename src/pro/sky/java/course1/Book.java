package pro.sky.java.course1;

public class Book {
    Author author = new Author();

    private final String name;
    private int yearOfPublication;

    //___конструкторы для класса Book
    public Book(String n, int year, String f, String s) {//если переменные названны по другому надобюнгость в this отпадает
        this.name = n;
        this.yearOfPublication = year;
        author.setName(f, s);
    }

    public Book(String name, String firstName, String surName) {
        this.name = name;
        author.setName(firstName, surName);
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

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
