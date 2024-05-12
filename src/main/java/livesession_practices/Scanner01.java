package livesession_practices;

import java.util.Scanner;

public class Scanner01 {
    // Ask user to enter following credentials:
    // Firstname and lastname
    // Age
    // Height
    // Weight
    // Marital status => married, unmarried, do not want to mention
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter your full name");
        String fullName= scanner.nextLine();
        System.out.println("Your full name is: "+fullName);

        System.out.println("Please enter your age");
        byte age= scanner.nextByte();
        System.out.println("Your age is: "+age );


        System.out.println("Please enter your height");
        double height= scanner.nextDouble();
        System.out.println("your height is: "+height);


        System.out.println("Please enter your weight");
        double weight= scanner.nextDouble();
        System.out.println("Your weight is: "+weight);

        scanner.nextLine();


        System.out.println("Please enter your marital status as married, single, do not mention");
        String maritalStatus= scanner.nextLine();

        System.out.println("Your marital status is: "+maritalStatus);




















    }
}
