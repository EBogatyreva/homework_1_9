package pro.sky.java.course1;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setName("Douglas", "Adams");

        Author author2 = new Author();
        author2.setName("Александр", "Пушкин");

        Book book1 = new Book("Hitchhiker's guide to the galaxy", 1978, author1.getFirstname(), author1.getSurName());

        System.out.printf(book1.getName() + " " + book1.getYearOfPublication() + " " + book1.author.getFirstname() + " " + book1.author.getSurName());

        Book book2 = new Book("The Restaurant at the End of the Universe", 1981);
        System.out.printf("\n" + book2.getName() + " " + book2.getYearOfPublication() + " " + book1.author.getFirstname() + " " + book1.author.getSurName());

        book2.setYearOfPublication(1980);
        System.out.printf("\n" + book2.getName() + " " + book2.getYearOfPublication() + " " + book1.author.getFirstname() + " " + book1.author.getSurName());

        Book book3 = new Book("Зимний вечер", author2.getFirstname(), author2.getSurName());
        System.out.printf("\n" + book3.getName() + " " + book3.author.getFirstname() + " " + book3.author.getSurName());

        Book book4 = new Book("Мертвые души");
        System.out.printf("\n" + book4.getName());
    }
}
