package io.pragra.learning.b25;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserMap {
    Map<String, User> userMap = new HashMap<>();



    public UserMap() {
        this.userMap = userMap;

    }

    public User getUserByName(String name){
        return userMap.get(name);
    }

    public void addUser(User user){
       userMap.put(user.getUserName(), user);
    }

    public void removeUser(int indexKey) {
        userMap.remove(indexKey);
    }





    public void printUserMap() {

        userMap.forEach((k,v)-> System.out.println("UserId: "+ k  + " User Details: "+v) );
    }






}
