package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Hitchhiker's guide to the galaxy", 1978, "Douglas", "Adams");

        System.out.printf(book1.getName() + " " + book1.getYearOfPublication() + " " + book1.author1.getFirstname() + " " + book1.author1.getSurName());

        Book book2 = new Book("The Restaurant at the End of the Universe", 1981, "Douglas", "Adams");
        System.out.printf("\n" + book2.getName() + " " + book2.getYearOfPublication() + " " + book1.author1.getFirstname() + " " + book1.author1.getSurName());

        book2.setYearOfPublication(1980);
        System.out.printf("\n" + book2.getName() + " " + book2.getYearOfPublication() + " " + book1.author1.getFirstname() + " " + book1.author1.getSurName());

    }
}
