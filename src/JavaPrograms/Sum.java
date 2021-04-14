package JavaPrograms;
/*
a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5

 */
import java.util.Scanner;
//class defined as Sum
public class Sum
{
//    main method
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

//Addition
        System.out.println(num1 + " + " + num2 + " = " +
                (num1 + num2));
//Subtraction
        System.out.println(num1 + " - " + num2 + " = " +
                (num1 - num2));
//Multiplication
        System.out.println(num1 + " x " + num2 + " = " +
                (num1 * num2));
//Division
        System.out.println(num1 + " / " + num2 + " = " +
                (num1 / num2));
//Module
        System.out.println(num1 + " mod " + num2 + " = " +
                (num1 % num2));
    }


}

