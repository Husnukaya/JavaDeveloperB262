package day31Iterators_enum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Fatma");
        myList.add("Veli");
        myList.add("Maryam");
        myList.add("Tom");
        myList.add("Emily");
        System.out.println(myList); // [Ali, Fatma, Veli, Maryam, Tom, Emily]


        ListIterator<String> myIter = myList.listIterator();
        while (myIter.hasNext()){
            String element = myIter.next();

            if (element.equals("Tom")){
                myIter.remove();
            }
        }
        System.out.println("myList = " + myList); // [Ali, Fatma, Veli, Maryam, Emily]


        List<String> yourList = new ArrayList<>(Arrays.asList("Tom", "Ali", "Veli"));
        System.out.println("yourList = " + yourList);  // [Tom, Ali, Veli]
        // Add an element in your list
        // set()
        ListIterator<String> listIter = yourList.listIterator();
        while (listIter.hasNext()){
            String element = listIter.next();
            listIter.set(element + "!");
        }
        System.out.println("yourList = " + yourList); // [Tom!, Ali!, Veli!]

        System.out.println("===============");
        // Print the element from th end of the list

        while (listIter.hasNext()){
            listIter.next(); // the pointer is at the end of list
        }
        System.out.println(yourList);

        while (listIter.hasPrevious()){
            String element = listIter.previous();
            System.out.println("reversed element = " + element);
        }


    }
}
