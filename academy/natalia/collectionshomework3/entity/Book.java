package com.academy.natalia.collectionshomework3.entity;

import java.util.Objects;

public class Book {
    private String title;
    private String nameOfAuthor;
    private String surnameOfAuthor;
    private String secondNameOfAuthor;
    private int numberOfPages;
    private double weight;
    private int yearOfPublication;

    public Book(String title, String nameOfAuthor, String surnameOfAuthor, String secondNameOfAuthor, int numberOfPages, double weight, int yearOfPublication) {
        this.title = title;
        this.nameOfAuthor = nameOfAuthor;
        this.surnameOfAuthor = surnameOfAuthor;
        this.secondNameOfAuthor = secondNameOfAuthor;
        this.numberOfPages = numberOfPages;
        this.weight = weight;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public void setNameOfAuthor(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
    }

    public String getSurnameOfAuthor() {
        return surnameOfAuthor;
    }

    public void setSurnameOfAuthor(String surnameOfAuthor) {
        this.surnameOfAuthor = surnameOfAuthor;
    }

    public String getSecondNameOfAuthor() {
        return secondNameOfAuthor;
    }

    public void setSecondNameOfAuthor(String secondNameOfAuthor) {
        this.secondNameOfAuthor = secondNameOfAuthor;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getNumberOfPages() == book.getNumberOfPages() && Double.compare(book.getWeight(), getWeight()) == 0 && getYearOfPublication() == book.getYearOfPublication() && getTitle().equals(book.getTitle()) && getNameOfAuthor().equals(book.getNameOfAuthor()) && getSurnameOfAuthor().equals(book.getSurnameOfAuthor()) && getSecondNameOfAuthor().equals(book.getSecondNameOfAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getNameOfAuthor(), getSurnameOfAuthor(), getSecondNameOfAuthor(), getNumberOfPages(), getWeight(), getYearOfPublication());
    }

    @Override
    public String toString() {
        return "Display Book" + ": " + "Title of the book" + ": " + title + ";  " + "Name of Author" + ": " + nameOfAuthor + '\'' + surnameOfAuthor + '\'' + secondNameOfAuthor + '\'' + "Year of publication: " + yearOfPublication + '\'' + "Weight: " + weight + '\'' + "Pages:" + numberOfPages + " pages" + '\'';
    }
}
