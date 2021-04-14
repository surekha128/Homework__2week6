package JavaPrograms;
//a Java program to swap two variables
//class defined as Swap
public class Swap
{
//    main method
    public static void main(String[] args)
    {
        int a,b,temp;
        a=15;
        b=30;

//swaping method for variable value
        temp=a;
        a=b;
        b=temp;

        System.out.print("a=");
        System.out.println(a);
        System.out.print("b=");
        System.out.println(b);

    }
}
