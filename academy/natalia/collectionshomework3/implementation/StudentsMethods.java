package com.academy.natalia.collectionshomework3.implementation;

import com.academy.natalia.collectionshomework3.entity.Book;
import com.academy.natalia.collectionshomework3.entity.Student;

import java.util.HashSet;
import java.util.TreeSet;

public class StudentsMethods {
    public static void showStudentTreeSet(TreeSet<Student> studentTreeSet) {
        for (Student s : studentTreeSet) {
            System.out.println(s);
        }
    }
}
