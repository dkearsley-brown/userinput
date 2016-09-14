package userinput;

import java.util.Scanner;
public class UserInput {
    
    public static void main(String[] args) {
        System.out.println("Please enter the following information.");
        System.out.println("First Name:");
        Scanner firstName = new Scanner(System.in);
        String firstNameanswer = firstName.nextLine();
        System.out.println("Surname:");
        Scanner surname = new Scanner(System.in);
        String surnameanswer = surname.nextLine();
        System.out.println("Age:");
        Scanner age = new Scanner(System.in);
        String ageanswer = age.nextLine();
        System.out.println("School Year:");
        Scanner sYear = new Scanner(System.in);
        String sYearanswer = sYear.nextLine();
        System.out.println("Login:");
        Scanner login = new Scanner(System.in);
        String loginanswer = login.nextLine();
        
        System.out.println("");
        System.out.println("I have obtained the following information");
        System.out.println("");
        System.out.println("First Name: "+firstNameanswer);
        System.out.println("Surname: "+surnameanswer);
        System.out.println("Age: "+ageanswer);
        System.out.println("School Year: "+sYearanswer);
        System.out.println("Login: "+login);
    }
    
}
