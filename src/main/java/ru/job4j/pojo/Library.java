package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 50);
        Book one = new Book("1", 51);
        Book two = new Book("2", 52);
        Book three = new Book("3", 53);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = one;
        books[2] = two;
        books[3] = three;
        for (int i = 0; i < books.length; i++) {
            Book more = books[i];
            System.out.println("book name " + more.getName() + " " + "page " + more.getPage());
        }
        System.out.println("replace book");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book more = books[i];
            if (more.getName() == "Clean Code") {
                System.out.println(more.getName());
            }
        }
    }
}
