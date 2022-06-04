package com.academy.natalia.collectionshomework3.implementation;

import com.academy.natalia.collectionshomework3.entity.Book;
import com.academy.natalia.collectionshomework3.entity.Student;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class BooksMethods {
    public static void showBook(List<Book> bookLinkedList) {
        for (Book b : bookLinkedList) {
            System.out.println(b);
        }
    }

    public static void showBookHashSet(HashSet<Book> bookHashSet) {
        for (Book b : bookHashSet) {
            System.out.println(b);
        }
    }

    public static void showBookVowelLetters(HashSet<Book> bookHashSet) {
        for (Book c : bookHashSet) {
            if (!c.getTitle().matches("^[^aeiouyAEIOUY]\\w++")) {
                System.out.println("Method showBook : " + c);
            }
        }
    }
}