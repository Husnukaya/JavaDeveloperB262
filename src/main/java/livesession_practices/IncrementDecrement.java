package livesession_practices;

public class IncrementDecrement {


    public static void main(String[]args){



        //Increment

        int s=6;

        System.out.println("Original value of s: "+s);//6

        //increment value of s variable by 2

        s=s+2;

        System.out.println("Increased of value of s variable: "+s);//8

        //Another way of doing increment

        s+=2;

        System.out.println("Value of s after second increment: "+s);//10

        //Decrement

        int d =10;

        System.out.println("Original value of d variable:"+d);//10

        //Decrease the value of d variable by 2

        d=d-2;

        System.out.println("Decreased value of d variable after decrement by 2: "+ d);//8

        //Another way of doing decrement

        d-=2;

        System.out.println("Value of d variable after second decrement:"+d);//6

        //Post increment
        int a=125;

        int b= a++;

        System.out.println("The value of a variable: "+a);//126
        System.out.println("The value of b after increment: "+b);//125

        //Pre increment
        int c=100;
        int e=++c;
        System.out.println("The value of c variable: "+c);//101
        System.out.println("The value of e variable after increment: "+e);//101

        //Post decrement

        int f=100;
        int g=f--;

        System.out.println(f);//99
        System.out.println(g);//100

        //Pre decrement

        int h= 125;
        int i=--h;

        System.out.println(h);//124
        System.out.println(i);//124






















    }
}
