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

    public static void main(String[] args) {
        UserMap usermap = new UserMap();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to add a User?  Type YES or NO: ");
        String a = scanner.next();

        if (a.equalsIgnoreCase("yes")) {
            String b = scanner.nextLine();
            System.out.println("Enter a user name: ");
            String name = scanner.next();
            System.out.println("Enter password: ");
            String password = scanner.next();
            User user = new User(name,password);
            usermap.addUser(1,user);
        } else if (a.equalsIgnoreCase("no")) {
        }


    }



}
