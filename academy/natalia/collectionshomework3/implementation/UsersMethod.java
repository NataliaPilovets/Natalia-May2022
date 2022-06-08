package com.academy.natalia.collectionshomework3.implementation;

import com.academy.natalia.collectionshomework3.entity.User;

import java.util.List;

public class UsersMethod {
    public static void showFriends(List<User> users, int count) {

        for (User u : users) {
            System.out.print(u.toStringOnlyName());
            if (u.getFriends().size() != 0) {
                count++;
                System.out.println(count);
                showFriends(u.getFriends(), count);
            }
        }
        System.out.println("");
    }
}
