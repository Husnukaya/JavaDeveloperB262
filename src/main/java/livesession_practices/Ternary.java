package livesession_practices;

public class Ternary {
    public static void main(String[] args) {

        // Example: If an integer is positive, print "The integer is positive". Otherwise, print "The integer is negative".

        int a =25;

       /* if (a>0){
            System.out.println("Integer is positive");
        }else {
            System.out.println("Integer is negative");
        }
*/

        String result =a>0 ? "Integer is positive": "Integer is negative";

        System.out.println("result = " + result);


        // Example: Type a code to print minimum of the values given (double data type).

        double b=5, c=10;
        double result1= b>c ? c : b;
        System.out.println("result1 = " + result1);

        // Example: Check if the given number is a digit or not. Use ternary

        int number=-1;

        String result2= Math.abs(number)>=0 && Math.abs(number)<10? "Given number is digit" : "Given number is not digit";

        System.out.println("result2 = " + result2);










    }
}
