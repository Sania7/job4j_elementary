package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Clean code", 450);
        Book book1 = new Book("Chess", 470);
        Book book2 = new Book("Algorithms", 550);
        Book book3 = new Book("Regular expressions", 600);
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        for (int index = 0; index < books.length; index++) {
            Book bks = books[index];
            System.out.println(bks.getName() + " - " + bks.getNumberOfPages() + " страниц.");
        }
        System.out.println();
        System.out.println("Поменять местами индексы 0 и 3");
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getNumberOfPages() + " страниц.");
        }
        System.out.println();
        System.out.println("Проверка наличия книги.");
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book bok = books[i];
            if (bok.getName().equals("Clean code")) {
                System.out.println(bok.getName() + " - " + bok.getNumberOfPages() + " страниц.");
            }
        }
    }
}
