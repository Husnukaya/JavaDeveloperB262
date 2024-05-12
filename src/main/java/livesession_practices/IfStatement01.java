package livesession_practices;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter a day name of the weekday");

        String dayName= scanner.next();

        if (dayName.equals("Monday")){
            System.out.println("weekday");
        } else if (dayName.equals("Tuesday")) {
            System.out.println("Weekday");
        }else if (dayName.equals("Wednesday")) {
            System.out.println("Weekday");
        }else if (dayName.equals("Thursday")) {
            System.out.println("Weekday");
        }else if (dayName.equals("Friday")) {
            System.out.println("Weekday");
        }else if (dayName.equals("Saturday")) {
            System.out.println("Weekend");
        }else if (dayName.equals("Sunday")) {
            System.out.println("Weekend");
        }else{
            System.out.println("Please enter a valid day");
        }


        boolean weekdayCondition= dayName.equalsIgnoreCase("Monday")|| dayName.equalsIgnoreCase("Tuesday")||
                dayName.equalsIgnoreCase("Wednesday")|| dayName.equalsIgnoreCase("Thursday")||dayName.equalsIgnoreCase("Friday");

        boolean weekendCondition= dayName.equalsIgnoreCase("Saturday")|| dayName.equalsIgnoreCase("Sunday");

        if (weekdayCondition){
            System.out.println("The day you entered is weekday");
        } else if (weekendCondition) {
            System.out.println("The day you entered is weekend");
        }else {
            System.out.println("Please enter a valid day");
        }


    }
}
