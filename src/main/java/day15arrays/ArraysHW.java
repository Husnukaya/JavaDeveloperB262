package day15arrays;

import java.util.Scanner;

public class ArraysHW {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);

        // Get the number of students from the user
        System.out.println("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create an array to store student names
        String[] studentNames = new String[numberOfStudents];

        // Loop to get names from the user
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.next();
        }

        // Print all student names
        System.out.println("Student Names:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        scanner.close(); // Close the Scanner resource
    }
















    }

