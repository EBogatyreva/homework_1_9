package pro.sky.java.course1;

public class Author {
    private String firstName;
    private String surName;

    public void setName(String f, String s) {
        this.firstName = f;
        this.surName = s;
    }

    public String getFirstname() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }
}
