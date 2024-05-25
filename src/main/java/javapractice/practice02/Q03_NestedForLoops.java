package javapractice.practice02;

import java.util.Scanner;

public class Q03_NestedForLoops {
    public static void main(String[] args) {

    /*

            Write the code to ask user to enter the number of rows and print the
            shape below according to that number:
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
            16 17 18 19 20 21

     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int num = scan.nextInt();

        int counter = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++ ) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }

    }
}