package livesession_practices;

public class Variables {
    public static void main(String[] args) {

        int a=12;
        byte b=-128;

       long populationOfUK=2223456789999L;

       double item1=12.45;
       double item2=12.45;

        System.out.println(item1/item2);

        System.out.println(a+b+populationOfUK+item1);

        String str="Hello World!";
        int c=10;
        int d=20;

        System.out.println(str+c+d);//Hello World!1020
        System.out.println(str+(c+d));//Hello World!30
        System.out.println(c+str+d);//10Hello World!20
        System.out.println(c+d+str);//30Hello World!

        char initial='A';

        System.out.println(initial+c+d);//95

    }
}
