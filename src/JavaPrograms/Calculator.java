package JavaPrograms;
/*
Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
    */

import java.util.Scanner;

public class Calculator
{

    //instance variables
    int a, b;
    public static void main(String[] args)
    {
        //static variables
        int  result;
        char ch;//(+,-,*,/)
        Scanner scan = new Scanner(System.in);
       Calculator obj = new Calculator();
        System.out.print("Enter obj.a : ");
        obj.a = scan.nextInt();
        System.out.print("Enter obj.b : ");
        obj.b = scan.nextInt();

        System.out.print("Enter Operator(+,-,*,/) : ");
        ch = scan.next().charAt(0);
        switch (ch)
        {
//            addition
            case '+':
                result = obj.a + obj.b;
                break;
//            subtraction
            case '-':
                result = obj.a - obj.b;
                break;
//            multiplication
            case '*':
                result = obj.a * obj.b;
                break;
//            division
            case '/':
                result = obj.a / obj.b;
                break;

            default:
                System.out.print("Error! Enter correct operator");
                return;
        }
        System.out.print(obj.a + " " + ch + " " + obj.b + " = " + result);


    }

}