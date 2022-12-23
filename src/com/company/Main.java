package com.company;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("John", "Milton");
        Author author2 = new Author("Mihail", "Lermontov");

        Book book1 = new Book("Потерянный рай", author1, 1660);
        Book book2 = new Book("Герой нашего времени", author2, 1840);
        book1.setYear(1674);

        System.out.println(book1 + "\n");
        System.out.println(book2 + "\n");
    }
}
