package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner anything = new Scanner(System.in);
        System.out.println("Enter Your Password");
        String inputFromUser = anything.nextLine();

        if (inputFromUser.equals("password"))
        {
            System.out.println("Access Granted");}
        else
            System.out.println("Denied");}
}