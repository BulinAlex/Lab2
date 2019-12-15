package Book;

import Book.Book;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Как создать GitHub", "Булин Александр Александрович", 200, "Программирование");
        Book b2 = new Book("100 лучших ларьков с шаурмой", "Булин Александр Александрович", 101, "Кулинария");

        b2.setPagesCount(100);

        System.out.println(b1);
        System.out.println(b2);
    }
}