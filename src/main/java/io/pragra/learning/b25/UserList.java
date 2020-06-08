package io.pragra.learning.b25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserList {
    List<User> userList = new ArrayList<>();

    public UserList() {
        this.userList = userList;
    }

    public void addUser(User user) {
        userList.add(userList.size(), user);
    }

    public void removeUser(int index) {
        userList.remove(index);
    }

    public void updateUser(User user, String userName, String userPassword) {
        user.setUserName(userName);
        user.setUserPassword(userPassword);
    }

    public void printUserList() {
        userList.forEach(System.out::println);
    }

    public int userListSize() {
        return userList.size();
    }







    }
