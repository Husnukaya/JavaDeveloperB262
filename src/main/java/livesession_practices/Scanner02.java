package livesession_practices;

import java.util.Scanner;

public class Scanner02 {
       /*
      Get two numeric values from the user, store them in double data type.
      Calculate their multiplication and division and print them on the console
       */

    public static void main(String[] args) {



        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter two numbers");

        double firstNumber= scanner.nextDouble();

        System.out.println("The first number you entered is: "+firstNumber);


        double secondNumber = scanner.nextDouble();
        System.out.println("The second number you entered is: "+secondNumber);

        System.out.println("Multiplication of the numbers you entered is: "+ String.format("%.3f",(firstNumber*secondNumber)));
        System.out.println("Division of the numbers you entered is: "+ String.format("%.3f",(firstNumber/secondNumber)));

        // Get the width and the length of a rectangle from the user and calculate its area. (Use float / double data)

        System.out.println("Please enter the length of the rectangle");
        float lengthOfRectangle= scanner.nextFloat();
        System.out.println("The length you entered is: "+lengthOfRectangle);

        System.out.println("Please enter the width of the rectangle");
        float widthOfRectangle=scanner.nextFloat();
        System.out.println("The width you entered is: "+widthOfRectangle);

        System.out.println("The area of rectangle: "+ String.format("%.3f",(widthOfRectangle*lengthOfRectangle)));

    }
}
