package JavaPrograms;
/*
Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 8
 */
import java.util.Scanner;
//class defied as TableMultiplication
public class TableMultiplication
{
//    main mathod
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a num: ");
        int num1 = in.nextInt();

        for (int i=0;i<10;i++)
        {
            System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));
        }


    }
}
