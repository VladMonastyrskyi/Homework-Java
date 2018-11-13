package com.company.homework5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Book {
    public enum BindingType {
        SOFT, SOLID, INTEGRAL
    }

    private long id;
    private String name;
    private List<String> authors = new ArrayList<>();
    private String publishOffice;
    private Calendar publishYear;
    private int amountOfPages;
    private double price;
    private BindingType bindingType;

    public Book() {
        this.id = new Date().getTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getPublishOffice() {
        return publishOffice;
    }

    public void setPublishOffice(String publishOffice) {
        this.publishOffice = publishOffice;
    }

    public Calendar getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Calendar publishYear) {
        this.publishYear = publishYear;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BindingType getBindingType() {
        return bindingType;
    }

    public void setBindingType(BindingType bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + authors +
                ", publishOffice='" + publishOffice + '\'' +
                ", publishYear=" + publishYear.get(Calendar.YEAR) +
                ", amountOfPages=" + amountOfPages +
                ", price=" + price +
                ", bindingType=" + bindingType +
                '}';
    }
}
