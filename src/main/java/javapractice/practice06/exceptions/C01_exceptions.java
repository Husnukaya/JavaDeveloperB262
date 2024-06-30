package javapractice.practice06.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exceptions {
    public static void main(String[] args) {


        /*
                Write a Java program that prompts the user to enter an integer and performs a division operation.
                The program should handle potential exceptions that might occur during user input and division by zero.
         */

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter the dividend ");
            int dividend = scan.nextInt();

            System.out.print("Enter the divisor ");
            int divisor = scan.nextInt();

            int result = dividend / divisor;
            System.out.println("Result: " + dividend + " / " + divisor + " = " + result);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            scan.close();
        }
    }
}