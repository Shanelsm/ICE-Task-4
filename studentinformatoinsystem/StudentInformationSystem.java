/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentinformatoinsystem;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String fullName = sc.nextLine();

        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        if (username.length() < 5) {
            System.out.println("Username must be at least 5 characters long.");
            return;
        }

        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            return;
        }

        System.out.print("Confirm Password: ");
        String confirm = sc.nextLine();
        if (!password.equals(confirm)) {
            System.out.println("Password and Confirm Password must match.");
            return;
        }

        System.out.println("Registration successful!");
        System.out.println("Welcome " + fullName + ", username: " + username);
    }
}
