package day19methodcreation_overloading;

public class MethodOverLoading01 {
    public static void main(String[] args) {

        System.out.println(add(5,3));
        System.out.println(add(3,2.5));

        System.out.println(add(2.5,3.5));

        System.out.println(add(5,5,5));



    }

    public static  int add(int a, int b){
        return a+b;
    }

    public static  double add(int a, double b){
        return a+b;
    }
    public static  double add(double a, double b){
        return a+b;
    }

    public static  double add(int a, int b, double c){
        return a+b+c;
    }

}
