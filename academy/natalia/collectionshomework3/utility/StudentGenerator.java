package com.academy.natalia.collectionshomework3.utility;

import com.academy.natalia.collectionshomework3.entity.Student;

import java.util.TreeSet;
public class StudentGenerator {
    public static TreeSet<Student> generateStudents(int count) {
        String [] names = new String[] {"Уинстон", "Владимир", "Фидель", "Че", "Уго", "Барак", "Крокодил"};
        String [] surnames = new String[] {"Черчилль", "Зеленский", "Кастро", "Гевара", "Чавес", "Обама", "Гена"};
        Integer [] age = new Integer[] {21, 22, 23, 24, 26, 18, 18};
        TreeSet<Student> students = new TreeSet<>();
        for (int i = 0; i < count; i++) {
            Student student = new Student();
            student.setName(names[i]);
            student.setSurname(surnames[i]);
            student.setAge(age[i]);
            students.add(student);
        }
        return students;
    }
}