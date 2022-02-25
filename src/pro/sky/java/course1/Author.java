package pro.sky.java.course1;
import java.util.Objects;
public class Author {
    private String firstName;
    private String surName;
    private String authorIsEmpty;

    public Author(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public Author() {

    }

    //_____________________________________________________________________________________________
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


    public String toString() {
        if ((firstName != null) && (surName != null)) {
            return firstName + " " + surName;
        } else if ((firstName == null) && (surName == null))
            authorIsEmpty = "автор не указан";
        return authorIsEmpty;
    }

    public int hashCode() {
        return Objects.hash(firstName, surName);
    }

    public boolean equals(Author author) {
        if ((this.firstName == author.firstName) && (this.surName == author.surName)) {
            return true;
        }
        return false;
    }
}
