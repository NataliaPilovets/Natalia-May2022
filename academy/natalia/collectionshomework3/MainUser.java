package com.academy.natalia.collectionshomework3;

import com.academy.natalia.collectionshomework3.entity.User;
import com.academy.natalia.collectionshomework3.implementation.UsersMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainUser {
    public static void main(String[] args) {
        List<User> users5 = new ArrayList<>();
        users5.add(new User("PITER"));
        users5.add(new User("RICHARD"));
        users5.add(new User("GUILFOY"));
        users5.add(new User("DINESH"));
        users5.add(new User("EARLICH"));

        List<User> users4 = new ArrayList<>();
        users4.add(new User("PITER", users5));
        users4.add(new User("RICHARD", users5));
        users4.add(new User("GUILFOY", users5));
        users4.add(new User("DINESH",users5));
        users4.add(new User("EARLICH",users5));

        List<User> users2 = new ArrayList<>();
        users2.add(new User("PITER", users5));
        users2.add(new User("RICHARD", users5));
        users2.add(new User("GUILFOY", users5));
        users2.add(new User("DINESH",users5));
        users2.add(new User("EARLICH",users5));

        List<User> users3= new ArrayList<>();
        users3.add(new User("ELIZABETH", users4));
        users3.add(new User("HUNTER", users4));
        users3.add(new User("PAUL", users4));
        users3.add(new User("RICHARD",users4));
        users3.add(new User("JENNIS",users4));

        List<User> users = new ArrayList<>();
        users.add(new User("ROSS", users2));
        users.add(new User("MONICA", users3));
        users.add(new User("PHOEBE", users4));
        users.add(new User("CHANDLER", users5));
        users.add(new User("JHOE", users2));

        User user = new User("RACHEL", users);

        //SHOW FRIENDS OF RACHEL//
        UsersMethod.showFriends(users);

        //SHOW FRIENDS OF FRIENDS OF FRIENDS OF RACHEL//
        System.out.println("FRIENDS OF FRIENDS: ");
        System.out.println(user.toString());
        }
    }

