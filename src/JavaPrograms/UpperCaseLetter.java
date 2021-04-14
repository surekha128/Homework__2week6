package JavaPrograms;
//Write a program to convert the upper case to lower case.


import java.util.Scanner;
//class defined as UpperCaseLetter
public class UpperCaseLetter
{
//    main method
    public static void main(String[] input)
    {
        char ch;
        int temp;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a name in Uppercase :  ");
        ch = scan.next().charAt(0);

        temp = ch;
        temp = temp+32;
        ch = (char) temp;

        System.out.print("Equivalent name first Character in Lowercase : " + ch);
    }
}



