package com.company.homework7.model;

public class Composition {

    public enum Style {
        CLASSIC, POP, RAP
    }

    private String name;
    private String author;
    private Style style;
    private int length;

    public Composition(String name, String author, Style style, int length) {
        this.name = name;
        this.author = author;
        this.style = style;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Composition{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", style=" + style +
                ", length=" + length +
                '}';
    }
}
