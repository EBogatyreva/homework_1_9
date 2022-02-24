package pro.sky.java.course1;

public class Author {
    private String firstName;
    private String surName;


    public Author(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    //_____________________________________________________________________________________________
    //почему у меня остались не удел вот эти методы? т.е. мы записываем  все через класс BOOK?
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
    //_____________________________________________________________________________________________

    public String getFirstname() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }
}
