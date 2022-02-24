package pro.sky.java.course1;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Douglas", "Adams");
        Author author2 = new Author("Александр", "Пушкин");

        Book book1 = new Book("Hitchhiker's guide to the galaxy", 1978, author1);
        System.out.printf(book1.getName() + " " + book1.getYearOfPublication() + " " + book1.getFirstnameOfAuthor() + " " + book1.getSurNameOfAuthor());

        Book book2 = new Book("The Restaurant at the End of the Universe", 1981, author1);
        System.out.printf("\n" + book2.getName() + " " + book2.getYearOfPublication() + " " + book2.getFirstnameOfAuthor() + " " + book2.getSurNameOfAuthor());

        book2.setYearOfPublication(1980);
        System.out.printf("\n" + book2.getName() + " " + book2.getYearOfPublication() + " " + book1.getFirstnameOfAuthor() + " " + book1.getSurNameOfAuthor());

        Book book3 = new Book("Зимний вечер", author2);
        System.out.printf("\n" + book3.getName() + " " + book3.getFirstnameOfAuthor() + " " + book3.getSurNameOfAuthor());

        Book book4 = new Book("Мертвые души");
        System.out.printf("\n" + book4.getName());
    }
}
