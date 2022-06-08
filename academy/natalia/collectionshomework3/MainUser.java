package com.academy.natalia.collectionshomework3;

import com.academy.natalia.collectionshomework3.entity.User;
import com.academy.natalia.collectionshomework3.implementation.UsersMethod;

import java.util.ArrayList;
import java.util.List;

public class MainUser {
    public static void main(String[] args) {
        List<User> users2 = new ArrayList<>();
        users2.add(new User("PITER"));
        users2.add(new User("RICHARD"));
        users2.add(new User("GUILFOY"));
        users2.add(new User("DINESH"));
        users2.add(new User("EARLICH"));

        List<User> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add(new User());
            users.get(i).setFriends(users2);
        }
        users.add(new User("ROSS", users2));
        users.add(new User("MONICA", users2));
        users.add(new User("PHOEBE", users2));
        users.add(new User("CHANDLER", users2));
        users.add(new User("JHOE", users2));

        //SHOW FRIENDS//
        int count = 0;
        UsersMethod.showFriends(users, count);
    }
    }

