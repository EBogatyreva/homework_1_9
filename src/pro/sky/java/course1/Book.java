package pro.sky.java.course1;

public class Book {
    Author author1 = new Author();

    private final String name;
    private int yearOfPublication;


    public Book(String n, int year, String firstname, String surName) {
        this.name = n;
        this.yearOfPublication = year;
        this.author1.firstname = firstname;
        this.author1.surName = surName;
    }

    public String getName() {
        return name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int a) {
        this.yearOfPublication = a;
    }

    class Author {
        private String firstname;
        private String surName;

        public String getFirstname(){
            return firstname;
        }

        public String getSurName(){
            return surName;
        }
    }
}
