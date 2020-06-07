package io.pragra.learning.b25;

/*User Account             //USER
  -- Add a user
  -- remove a user
  -- update user

 */

import java.util.Scanner;

public class User {
    private String userName;
    private String userPassword;

    public User(){
      userLogin();
    }



    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void printUser(){
        System.out.println("Your userName is: " +userName);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }

    public void userLogin() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to create a UserAccount?  " +
                "Type YES: to sign up or " +
                "NO: if you already have an account");

         String a = scanner.next();

            if (a.equalsIgnoreCase("yes")) {
                System.out.println("Enter a user name: ");
                userName = scanner.next();
                System.out.println("Enter password: ");
                userPassword = scanner.next();
//            User user = new User(userName,userPassword);


            } else if (a.equalsIgnoreCase("no")) {
                System.out.println("Enter curren user name: ");
                userName = scanner.next();
                System.out.println("Enter current password: ");
                userPassword = scanner.next();

            }



    }

    }


