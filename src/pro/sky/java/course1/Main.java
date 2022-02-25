package pro.sky.java.course1;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Douglas", "Adams");
        Author author2 = new Author("Александр", "Пушкин");
        Author author3 = new Author();

        Book book1 = new Book("Hitchhiker's guide to the galaxy", 1978, author1);
        System.out.print(book1.getName() + " " + book1.getYearOfPublication() + " " + book1.getFirstnameOfAuthor() + " " + book1.getSurNameOfAuthor());

        Book book2 = new Book("The Restaurant at the End of the Universe", 1981, author1);
        System.out.print("\n" + book2.getName() + " " + book2.getYearOfPublication() + " " + book2.getFirstnameOfAuthor() + " " + book2.getSurNameOfAuthor());

        book2.setYearOfPublication(1980);
        System.out.print("\n" + book2.getName() + " " + book2.getYearOfPublication() + " " + book1.getFirstnameOfAuthor() + " " + book1.getSurNameOfAuthor());

        Book book3 = new Book("Зимний вечер", author2);
        System.out.print("\n" + book3.getName() + " " + book3.getFirstnameOfAuthor() + " " + book3.getSurNameOfAuthor());

        Book book4 = new Book("Мертвые души");
        System.out.println("\n" + book4.getName());

//Задание 1.10, пеопределение методов
        System.out.println(book4);
        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println(book1.equals(book2));

        System.out.println(author3);
        System.out.println("author3.hashCode(): " + author3.hashCode());
        System.out.println(author1.equals(author2));

    }
}
