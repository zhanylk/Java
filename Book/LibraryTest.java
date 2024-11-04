package Tasks.Book;

import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();


        library.addBook(new Book("Абай жолы", "Мухтар Ауезов", 1960));
        library.addBook(new Book("Ботагоз", "Сабит Муханов", 1949));
        library.addBook(new Book("Война и мир", "Лев  Толстой", 1945));
        library.addBook(new Book("Вишневый сад", "Антон Чехов", 1813));

        System.out.println();
        library.displayAllBooks();


        System.out.println("\nПоиск книги Мухтара Ауезова:");
        List<Book> orwellBooks = library.searchByAuthor("Мухтар Ауезов");
        for (Book book : orwellBooks) {
            System.out.println(book);
        }
    }
}
