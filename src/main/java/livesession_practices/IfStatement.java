package livesession_practices;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {



        if (3<8){

            System.out.println("If you see this message, that means the condition is true");
        }

        if (3>8){

            System.out.println("If you see this message, that means the condition is true");
        }

        int a=-15;

        if (a>0){

            System.out.println(a+": is a positive number");
        }


        if (a<0){

            System.out.println(a+": is a negative number");
        }


        // Example: Print "Digit" on the console if the given number is a digit

        int number=1;


        if (number<10 && number>0){

            System.out.println("Digit");
        }

        // Example: Check if the given number has three digits

        int num=155;
        if (num>99 && num<1000){
            System.out.println(num+": has three digits");
        }

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter any numbers");

        int num1= scanner.nextInt();

        if (num1%2==0){
            System.out.println(num1+": number You entered is even");
        }else {
            System.out.println(num1+": number you entered is odd");
        }


































    }
}
