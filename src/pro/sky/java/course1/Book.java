package pro.sky.java.course1;

public class Book {
    Author author = new Author();

    private final String name;
    private int yearOfPublication;

    //___конструкторы для класса Book
    public Book(String n, int year, String f, String s) {
        this.name = n;
        this.yearOfPublication = year;
        author.setName(f, s);
    }

    public Book(String n, String f, String s) {
        this.name = n;
        author.setName(f, s);
    }

    public Book(String n, int year) {
        this.name = n;
        this.yearOfPublication = year;
    }

    public Book(String n) {
        this.name = n;
    }
//___________________________

    public String getName() {
        return name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int a) {
        this.yearOfPublication = a;
    }
}
