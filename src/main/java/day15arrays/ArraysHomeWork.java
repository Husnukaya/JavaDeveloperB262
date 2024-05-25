package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysHomeWork {
    public static void main(String[] args) {


        // HW: Create an array to store names of students.
        // Ask user to enter the names
        // Use loops to get the names from the user
        // Print all the names of the students on the console

        Scanner scanner= new Scanner(System.in);


        String[] students= new String[5];


        System.out.println(Arrays.toString(students));//[null, null, null, null, null]


        int index=0;

        do {

            System.out.println("Please enter the student name.............");
            students[index]=scanner.next();
            index++;


        }while (index<students.length);

        System.out.println(Arrays.toString(students));

        for (String w: students){

            scanner.next();
        }




    }
}
