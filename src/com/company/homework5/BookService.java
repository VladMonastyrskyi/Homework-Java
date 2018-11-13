package com.company.homework5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    private List<Book> books = new ArrayList<>();

    public BookService() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy");

        Book book1 = new Book();
        book1.setName("Анна Каренина");
        book1.getAuthors().add("Лев Толстой");
        book1.setPublishOffice("Издательство 1");
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(format.parse("1878"));
        book1.setPublishYear(calendar1);
        book1.setAmountOfPages(310);
        book1.setPrice(89.0);
        book1.setBindingType(Book.BindingType.INTEGRAL);
        books.add(book1);

        Book book2 = new Book();
        book2.setName("Преступление и наказание");
        book2.getAuthors().add("Федор Достоевский");
        book2.setPublishOffice("Издательство 2");
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(format.parse("1866"));
        book2.setPublishYear(calendar2);
        book2.setAmountOfPages(400);
        book2.setPrice(149.0);
        book2.setBindingType(Book.BindingType.INTEGRAL);
        books.add(book2);

        Book book3 = new Book();
        book3.setName("Война и мир");
        book3.getAuthors().add("Лев Толстой");
        book3.setPublishOffice("Издательство 3");
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(format.parse("1869"));
        book3.setPublishYear(calendar3);
        book3.setAmountOfPages(540);
        book3.setPrice(199.0);
        book3.setBindingType(Book.BindingType.SOLID);
        books.add(book3);

        Book book4 = new Book();
        book4.setName("Портрет Дориана Грея");
        book4.getAuthors().add("Оскар Уайльд");
        book4.setPublishOffice("Издательство 3");
        Calendar calendar4 = Calendar.getInstance();
        calendar4.setTime(format.parse("1890"));
        book4.setPublishYear(calendar4);
        book4.setAmountOfPages(420);
        book4.setPrice(169.0);
        book4.setBindingType(Book.BindingType.SOFT);
        books.add(book4);
    }

    public void getBooksByAuthor(String author) {
        List<Book> books = this.books.stream()
                .filter(book -> {
                    for (String a : book.getAuthors()) {
                        if (a.equals(author)) {
                            return true;
                        }
                    }
                    return false;
                })
                .collect(Collectors.toList());

        if (books.isEmpty()) {
            System.out.println("Список книг автора \'" + author + "\' пуст");
        } else {
            System.out.println("Список книг автора \'" + author + "\':");
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    public void getBooksByPublishOffice(String publishOffice) {
        List<Book> books = this.books.stream()
                .filter(book -> book.getPublishOffice().equals(publishOffice))
                .collect(Collectors.toList());

        if (books.isEmpty()) {
            System.out.println("Список книг выпущенных издательством \'" + publishOffice + "\' пуст");
        } else {
            System.out.println("Список книг выпущенных издательством \'" + publishOffice + "\':");
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    public void getBooksByPublishYear(String year) {
        List<Book> books = this.books.stream()
                .filter(book -> book.getPublishYear().get(Calendar.YEAR) >= Integer.valueOf(year))
                .collect(Collectors.toList());

        if (books.isEmpty()) {
            System.out.println("Список книг выпущенных после " + year + " года пуст");
        } else {
            System.out.println("Список книг выпущенных после " + year + " года:");
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }
}
