package javapractice.practice03;

import java.util.Scanner;

public class Q02_ForLoop_PerfectNumber {
    public static void main(String[] args) {
        /*
            Write the code to ask user to enter an integer and check if it is 'Perfect Number' or not.
            A perfect number is a positive integer that is equal to the sum of all its proper divisors.
            6 = 1+2+3, 28 = 1 + 2 + 4 + 7 + 14, (496 and 8128)
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to see if it is a perfect number");
        int num = scan.nextInt();

        int sum = 0;
        for (int i = 1; i < num; i++)
        {
            if (num % i == 0){
                System.out.print(i+" ");
                sum = sum + i;
            }

        }

        if (sum == num)
            System.out.println (num + " Is a perfect number");
        else
            System.out.println (num + " Is not a perfect number");
    }
}