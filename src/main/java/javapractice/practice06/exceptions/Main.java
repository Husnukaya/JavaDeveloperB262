package javapractice.practice06.exceptions;

public class Main {
    public static void main(String[] args) {

        int age;

        // Create a class and ask for user's age. if it's less than 18, throw an AgeException error.
        getAge(2);
    }

    public static void getAge(int age){
        if (age<0 && age>100){

            try {
                throw new InvalidAgeException();
            } catch (InvalidAgeException e) {
                System.err.println("Age cannot be less than zero or more than 100");
            }
        }else {
            System.out.println("Age you entered: "+age);
        }

    }
}
