package javapractice.practice03;

import java.util.Arrays;

public class Q03_Arrays_Anagram {
    public static void main(String[] args) {
        /*
            Write the code to check if two Strings are Anagram or not

            Anagram: A word or phrase made by using the letters of another word/phrase in a different order.
            Ex:
            dormitory -> dirty room
            debit card -> bad credit
            eleven plus two -> twelve plus one
            a decimal point -> I'm a dot in place
            vacation time -> I am not active
        */

        String str1 = "dirty room";
        String str2 = "dormitory";

        String[] arr1 = str1.toLowerCase().replaceAll("[^a-z]", "").split(""); // dirtyroom
        String[] arr2 = str2.toLowerCase().replaceAll("[^a-z]", "").split("");

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        if (arr1.length==arr2.length){
            for (int i=0; i<arr1.length; i++){

                if (!arr1[i].equals(arr2[i])){
                    System.out.println("They are not equal!");
                    break;
                }

            }
            System.out.println("They are equal!");
        }

        if (Arrays.equals(arr1, arr2)){
            System.out.println("Hey they are equal!");
        }else{
            System.out.println("No, they're not equal :(");
        }



    }
}