package com.academy.natalia.collectionshomework3.utility;
import com.academy.natalia.collectionshomework3.entity.Book;
import com.academy.natalia.collectionshomework3.entity.Student;
import com.academy.natalia.homework2.entity.Car;

import java.util.*;

public class BookGenerator {
    public static List<Book> storeAndDisplayBook(){

        List<Book> bookLinkedList = new LinkedList<>();
        bookLinkedList.add(new Book("Финансист", "Теодор", "Драйзер", "No surname", 560, 400, 2019));
        bookLinkedList.add(new Book("Три сестры", "Антон", "Чехов", "Павлович", 20, 300, 2020));
        bookLinkedList.add(new Book("Идиот", "Федор", "Достоевский", "Kj", 30, 500, 2020));
        bookLinkedList.add(new Book("Война и мир", "Лев", "Толстой", "Николаевич", 256, 200, 1999));
        bookLinkedList.add(new Book("To Kill a Mockingbird", "Harper", "Lee", "Null", 350, 300, 2000));
        bookLinkedList.add(new Book("Harry Potter and the Philosopher's Stone", "Joanne", "Rowling", "K", 455, 300, 2022));
        bookLinkedList.add(new Book("Сто лет одиночества", "Габриэль", "Маркес", "Гарсиа", 200, 300, 2000));
        bookLinkedList.add(new Book("Нетерпение сердца", "Стефан", "Цвейг", "Kj", 207, 300, 2010));
        bookLinkedList.add(new Book("Архипелаг Гулаг", "Александр", "Солженицын", "Сергеевич", 210, 305, 2000));
        bookLinkedList.add(new Book("Тайные виды на гору Фудзи", "Виктор", "Пелевин", "Олегович", 210, 300, 2000));
        bookLinkedList.add(new Book("The Da Vinci Code", "Dan", "Brown", "Null", 345, 360, 2006));
        bookLinkedList.add(new Book("Собачье сердце", "Михаил", "Булгаков", "Яковлевич", 210, 300, 2000));
        bookLinkedList.add(new Book("Мастер и Маргарита", "Михаил", "Булгаков", "Яковлевич", 320, 300, 2000));
        bookLinkedList.add(new Book("The Trial ", "Franz", "Kafka", "KK", 170, 100, 2001));
        bookLinkedList.add(new Book("ESplendeurs et misères des courtisanes", "Honoré", "de Balzak", "Kj", 800, 510, 2000));
        bookLinkedList.add(new Book("Осень патриарха", "Габриэль", "Маркес", "Гарсиа", 270, 330, 2003));
        bookLinkedList.add(new Book("Wuthering Heights", "Emily", "Bronte", "Kj", 20, 300, 2000));
        bookLinkedList.add(new Book("Atlas Shrugged", "Ayn", "Rand", "Null", 1200, 600, 2000));
        bookLinkedList.add(new Book("Becoming", "Michell", "Obama", "L", 230, 300, 2001));
        bookLinkedList.add(new Book("Восстань и убей певрвым", "Ронен", "Бергман", "B", 900, 500, 2000));

        return bookLinkedList;
    }
    public static HashSet<Book> displayBookHashSet() {

        HashSet<Book> bookHashSet = new HashSet<>();
        bookHashSet.add(new Book("Финансист", "Теодор", "Драйзер", "No surname", 560, 400, 2019));
        bookHashSet.add(new Book("Три сестры", "Антон", "Чехов", "Павлович", 20, 300, 2020));
        bookHashSet.add(new Book("Идиот", "Федор", "Достоевский", "Kj", 30, 500, 2020));
        bookHashSet.add(new Book("Война и мир", "Лев", "Толстой", "Николаевич", 256, 200, 1999));
        bookHashSet.add(new Book("To Kill a Mockingbird", "Harper", "Lee", "Null", 350, 300, 2000));
        bookHashSet.add(new Book("Harry Potter and the Philosopher's Stone", "Joanne", "Rowling", "K", 455, 300, 2022));
        bookHashSet.add(new Book("Сто лет одиночества", "Габриэль", "Маркес", "Гарсиа", 200, 300, 2000));
        bookHashSet.add(new Book("Нетерпение сердца", "Стефан", "Цвейг", "Kj", 207, 300, 2010));
        bookHashSet.add(new Book("Архипелаг Гулаг", "Александр", "Солженицын", "Сергеевич", 210, 305, 2000));
        bookHashSet.add(new Book("Тайные виды на гору Фудзи", "Виктор", "Пелевин", "Олегович", 210, 300, 2000));
        bookHashSet.add(new Book("The Da Vinci Code", "Dan", "Brown", "Null", 345, 360, 2006));
        bookHashSet.add(new Book("Собачье сердце", "Михаил", "Булгаков", "Яковлевич", 210, 300, 2000));
        bookHashSet.add(new Book("Мастер и Маргарита", "Михаил", "Булгаков", "Яковлевич", 320, 300, 2000));
        bookHashSet.add(new Book("The Trial ", "Franz", "Kafka", "KK", 170, 100, 2001));
        bookHashSet.add(new Book("Splendeurs et misères des courtisanes", "Honoré", "de Balzak", "Kj", 800, 510, 2000));
        bookHashSet.add(new Book("Осень патриарха", "Габриэль", "Маркес", "Гарсиа", 270, 330, 2003));
        bookHashSet.add(new Book("Wuthering Heights", "Emily", "Bronte", "Kj", 20, 300, 2000));
        bookHashSet.add(new Book("Atlas Shrugged", "Ayn", "Rand", "Null", 1200, 600, 2000));
        bookHashSet.add(new Book("Atlas Shrugged", "Ayn", "Rand", "Null", 1200, 600, 2000));
        bookHashSet.add(new Book("Atlas Shrugged", "Ayn", "Rand", "Null", 1200, 600, 2000));
        bookHashSet.add(new Book("Atlas Shrugged", "Ayn", "Rand", "Null", 1200, 600, 2000));
        bookHashSet.add(new Book("Atlas Shrugged", "Ayn", "Rand", "Null", 1200, 600, 2000));
        bookHashSet.add(new Book("Atlas Shrugged", "Ayn", "Rand", "Null", 1200, 600, 2000));
        bookHashSet.add(new Book("Becoming", "Michell", "Obama", "L", 230, 300, 2001));
        bookHashSet.add(new Book("Восстань и убей певрвым", "Ронен", "Бергман", "B", 900, 500, 2000));

        return bookHashSet;
}
    public static List<Book> booksFromBookHashSetToList() {

        List<Book> bookListToSort = new LinkedList<>();
        bookListToSort.add(new Book("Финансист", "Теодор", "Драйзер", "No surname", 560, 400, 2019));
        bookListToSort.add(new Book("Три сестры", "Антон", "Чехов", "Павлович", 20, 300, 2020));
        bookListToSort.add(new Book("Идиот", "Федор", "Достоевский", "Kj", 30, 500, 2020));
        bookListToSort.add(new Book("Война и мир", "Лев", "Толстой", "Николаевич", 256, 200, 1999));
        bookListToSort.add(new Book("To Kill a Mockingbird", "Harper", "Lee", "Null", 350, 300, 2000));
        bookListToSort.add(new Book("Harry Potter and the Philosopher's Stone", "Joanne", "Rowling", "K", 455, 300, 2022));
        bookListToSort.add(new Book("Сто лет одиночества", "Габриэль", "Маркес", "Гарсиа", 200, 300, 2000));
        bookListToSort.add(new Book("Нетерпение сердца", "Стефан", "Цвейг", "Kj", 207, 300, 2010));
        bookListToSort.add(new Book("Архипелаг Гулаг", "Александр", "Солженицын", "Сергеевич", 210, 305, 2000));
        bookListToSort.add(new Book("Тайные виды на гору Фудзи", "Виктор", "Пелевин", "Олегович", 210, 300, 2000));
        bookListToSort.add(new Book("The Da Vinci Code", "Dan", "Brown", "Null", 345, 360, 2006));
        bookListToSort.add(new Book("Собачье сердце", "Михаил", "Булгаков", "Яковлевич", 210, 300, 2000));
        bookListToSort.add(new Book("Мастер и Маргарита", "Михаил", "Булгаков", "Яковлевич", 320, 300, 2000));
        bookListToSort.add(new Book("The Trial ", "Franz", "Kafka", "KK", 170, 100, 2001));
        bookListToSort.add(new Book("Splendeurs et misères des courtisanes", "Honoré", "de Balzak", "Kj", 800, 510, 2000));
        bookListToSort.add(new Book("Осень патриарха", "Габриэль", "Маркес", "Гарсиа", 270, 330, 2003));
        bookListToSort.add(new Book("Wuthering Heights", "Emily", "Bronte", "Kj", 20, 300, 2000));
        bookListToSort.add(new Book("Atlas Shrugged", "Ayn", "Rand", "Null", 1200, 600, 2000));
        bookListToSort.add(new Book("Atlas Shrugged", "Ayn", "Rand", "Null", 1200, 600, 2000));
        bookListToSort.add(new Book("Atlas Shrugged", "Ayn", "Rand", "Null", 1200, 600, 2000));
        bookListToSort.add(new Book("Atlas Shrugged", "Ayn", "Rand", "Null", 1200, 600, 2000));
        bookListToSort.add(new Book("Atlas Shrugged", "Ayn", "Rand", "Null", 1200, 600, 2000));
        bookListToSort.add(new Book("Atlas Shrugged", "Ayn", "Rand", "Null", 1200, 600, 2000));
        bookListToSort.add(new Book("Becoming", "Michell", "Obama", "L", 230, 300, 2001));
        bookListToSort.add(new Book("Восстань и убей певрвым", "Ронен", "Бергман", "B", 900, 500, 2000));

        return bookListToSort;
    }

   }
