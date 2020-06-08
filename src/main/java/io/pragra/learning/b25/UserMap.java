package io.pragra.learning.b25;
/*This class has been created to learn maps and not used in project
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserMap {
    Map<Integer, User> userMap = new HashMap<>();



    public UserMap() {
        this.userMap = userMap;
    }

    public void addUser(int indexKey,User user){
       userMap.put(indexKey, user);
    }

    public void removeUser(int indexKey) {
        userMap.remove(indexKey);
    }

    public void updateUser(int indexKey,User user) {
        userMap.get(indexKey);
        userMap.put(indexKey,user);
//        user.setUserName(userName);
//        user.setUserPassword(userPassword);
    }
    public void printUserMap() {

        userMap.forEach((k,v)-> System.out.println("index: "+ k  + "User: "+v) );
    }




}
