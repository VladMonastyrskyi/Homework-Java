package com.company.homework5;

import java.text.ParseException;

public class Homework5 {

    public static void main(String[] args) throws ParseException {
        BookService bookService = new BookService();
        bookService.getBooksByAuthor("Федор Достоевский");
        System.out.println();
        bookService.getBooksByPublishOffice("Издательство 3");
        System.out.println();
        bookService.getBooksByPublishYear("1869");

        /*
        Результат

        Список книг автора 'Федор Достоевский':
        Book{id=1541428571252, name='Преступление и наказание', authors=[Федор Достоевский], publishOffice='Издательство 2', publishYear=1866, amountOfPages=400, price=149.0, bindingType=INTEGRAL}

        Список книг выпущенных издательством 'Издательство 3':
        Book{id=1541428571252, name='Война и мир', authors=[Лев Толстой], publishOffice='Издательство 3', publishYear=1869, amountOfPages=540, price=199.0, bindingType=SOLID}
        Book{id=1541428571252, name='Портрет Дориана Грея', authors=[Оскар Уайльд], publishOffice='Издательство 3', publishYear=1890, amountOfPages=420, price=169.0, bindingType=SOFT}

        Список книг выпущенных после 1869 года:
        Book{id=1541428571249, name='Анна Каренина', authors=[Лев Толстой], publishOffice='Издательство 1', publishYear=1878, amountOfPages=310, price=89.0, bindingType=INTEGRAL}
        Book{id=1541428571252, name='Война и мир', authors=[Лев Толстой], publishOffice='Издательство 3', publishYear=1869, amountOfPages=540, price=199.0, bindingType=SOLID}
        Book{id=1541428571252, name='Портрет Дориана Грея', authors=[Оскар Уайльд], publishOffice='Издательство 3', publishYear=1890, amountOfPages=420, price=169.0, bindingType=SOFT}
        */
    }

}
