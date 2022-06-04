package com.academy.natalia.collectionshomework3;

import com.academy.natalia.collectionshomework3.entity.Book;
import com.academy.natalia.collectionshomework3.entity.Student;
import com.academy.natalia.collectionshomework3.implementation.BooksMethods;
import com.academy.natalia.collectionshomework3.implementation.StudentsMethods;
import com.academy.natalia.collectionshomework3.utility.BookGenerator;
import com.academy.natalia.collectionshomework3.utility.StudentGenerator;

import java.util.*;

import static java.lang.System.*;

public class Main {
         public static void main(String[] args) {

//      Create Linked List and Hash set Books

        List<Book> bookLinkedList = BookGenerator.storeAndDisplayBook();
        HashSet<Book> bookHashSet = BookGenerator.displayBookHashSet();
        List<Book> bookListToSort = BookGenerator.booksFromBookHashSetToList();

//      Display Linked list objects

        System.out.println("My Linked list objects");
        BooksMethods.showBook(bookLinkedList);

 //     Display Hash set objects

        System.out.println("My Hash set objects");
        BooksMethods.showBookHashSet(bookHashSet);

// As HasSet cannot be sorted, we can add the objects from hashset to TreeSet and implement Comparable
// Also the objects from HashSet can be added to List in order to try use comparator

//        Sort books from hashset added to list by name of author

        System.out.println("Sort Linked List by name");
        Collections.sort(bookListToSort, new Comparator<Book>() {
        @Override
        public int compare(Book book, Book t1) {
            int sortValue = book.getNameOfAuthor().compareTo(t1.getNameOfAuthor());
            return sortValue;
            }
        });
        for (Book book : bookListToSort) {
            out.println(book.toString());
        }

//        Sort books from hashset added to list  by surname of author

         System.out.println("Sort Linked List by surname");
         Collections.sort(bookListToSort, new Comparator<Book>() {
         @Override
         public int compare(Book book, Book t1) {
             int sortValue = book.getSurnameOfAuthor().compareTo(t1.getSurnameOfAuthor());
             return sortValue;
             }
         });
         for (Book book : bookListToSort) {
         System.out.println(book.toString());
         }
         
 //        Sort books from hashset added to list  by Second name of author

     System.out.println("Sort Linked List by second name");
     Collections.sort(bookListToSort, new Comparator<Book>() {
     @Override
     public int compare(Book book, Book t1) {
         int sortValue = book.getSecondNameOfAuthor().compareTo(t1.getSecondNameOfAuthor());
         return sortValue;
         }
     });
         for (Book book : bookListToSort) {
     System.out.println(book.toString());
         }

//       Remove 7th book from the list

         bookLinkedList.remove(7);
         System.out.println("Linked list after removing");
         BooksMethods.showBook(bookLinkedList);

//       Display books starting with vowel letters
         System.out.println("Books HashSet starting with Vowel Letter");
         BooksMethods.showBookVowelLetters(bookHashSet);

//      Create Tree Set for Student Class

         TreeSet<Student> studentsTreeSet = StudentGenerator.generateStudents(6);
         System.out.println("Student Tree Set");
         StudentsMethods.showStudentTreeSet(studentsTreeSet);

//     Remove each 2s student from Tree Set
//     Create other tree set and add every 2d element from the first tres set

        System.out.println("Student Tree Set after removing");
        TreeSet<Student> students2 = new TreeSet<>();
        int i = 1;
        for (Student s : studentsTreeSet){
                if(i%2 != 0)
                    students2.add(s);
                i++;
            }
         System.out.println(students2);
       }
    }