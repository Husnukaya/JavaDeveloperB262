package javapractice.practice02;

import java.util.Scanner;

public class Q01_IfStatements {
    // psvm / main
    public static void main(String[] args) {

    /*
                A company decided to give bonus of 5% of salary to the employee if his/her year of
                service is 5 or more than 5 years.

                Ask user for their salary and year of service and print the net bonus amount.
                If employee can not get bonus, print how many years he/she should work more.

                EXAMPLE:
                INPUT  :   Year     => 4 years service
                           Salary   => 4000

                OUTPUT:   You need to work for 1 more year(s) to get a bonus
     */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your salary: ");
        double salary = scan.nextDouble();

        System.out.println("Please enter your years of service: ");
        int years = scan.nextInt();

        if (years < 5) {
            System.out.println("You need to work " + (5-years) + " year(s) to get bonus");
        } else {
            salary = salary * 5/100;
            System.out.println("Good! You have the right to get bonus. Your bonus is " + salary);
        }


    }
}