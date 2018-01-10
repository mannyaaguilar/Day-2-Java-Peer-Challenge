package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String password = "bacon";
        System.out.println("Enter your password");
        Scanner sc = new Scanner(System.in);
        String enteredPassword;
        enteredPassword = sc.nextLine();
        if (enteredPassword.equals(password)) {
            System.out.println("Gained Access");
        } else {
            System.out.println("Bzzzz! WRONG!");
        }
    }
// Bad code!
//        Scanner anything = new Scanner(System.in);
//        System.out.println("Enter Your Password");
//        String inputFromUser = anything.nextLine();
//
//        if (inputFromUser.equals("password"))
//        {
//            System.out.println("Access Granted");}
//        else
//            System.out.println("Denied");}
}