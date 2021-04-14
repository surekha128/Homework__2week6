package JavaPrograms;
//a Java program that takes three numbers as input to calculate and
//print the average of the numbers.
import java.util.Scanner;
//class defined as ThreeNumAsInput
public class ThreeNumAsInput
{
//    main method
    public static void main(String[] args)
    {
        double o,b,c;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first num: ");
        o = in.nextDouble();

        System.out.print("Enter second num: ");
        b = in.nextDouble();

        System.out.print("Enter third num: ");
        c = in.nextDouble();

        System.out.print("average val " + average(o, b, c)+"\n" );


    }

    public static double average(double o, double b, double c)
  {
      return ((o+b+c)/3);
  }




}