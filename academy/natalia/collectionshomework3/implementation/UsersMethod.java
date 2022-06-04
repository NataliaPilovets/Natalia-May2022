package com.academy.natalia.collectionshomework3.implementation;

import com.academy.natalia.collectionshomework3.entity.Student;
import com.academy.natalia.collectionshomework3.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class UsersMethod {
    public static void showFriends(List<User> users) {
        System.out.println("FRIENDS OF RACHEL: ");
        for (User u : users) {
            System.out.print(u.toStringOnlyName());
        }
        System.out.println("");

    }
}
