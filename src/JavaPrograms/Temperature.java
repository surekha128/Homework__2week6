package JavaPrograms;

import java.io.PrintStream;
import java.util.Scanner;

/*
Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
//class defined as Temperature
public class Temperature
{
    static double F;
//    main method
     public static void main(String[] args)
     {
         double a,d;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter fahrenheit temperature");
            a= sc.nextDouble();
         System.out.println("Celsius temperature is = "+celsius(a));


     }
      static double celsius(double F)
     {
         return (F-32)*5/9;
     }

}

