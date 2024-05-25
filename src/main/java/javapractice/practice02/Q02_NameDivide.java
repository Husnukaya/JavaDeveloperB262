package javapractice.practice02;

import java.util.Scanner;

public class Q02_NameDivide {
    public static void main(String[] args) {

    /*
            Divide the 2-word name and surname you will receive from the user into separate words.
            Print the name and surname on the screen separately.

            EXAMPLE:
            INPUT: John Doe

           OUTPUT:
           First name: John
           Surname: Doe
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your full name");
        String name = scanner.nextLine();

        name = name.replaceAll("\\s+", " ").trim(); // John Doe | John    Doe --> John Doe
        System.out.println(name);
        String firstName =name.split(" ")[0].substring(0,1).toUpperCase() + name.split(" ")[0].substring(1).toLowerCase();
        String lastName =name.split(" ")[1].substring(0,1).toUpperCase() + name.split(" ")[1].substring(1).toLowerCase();
        System.out.println("first name = " + firstName);
        System.out.println("last name = " + lastName);



    }
}