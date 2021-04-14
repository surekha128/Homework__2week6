package JavaPrograms;
/*
a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog
 */
import java.util.Scanner;
//class defined as ConvertStringIntoLowercase
public class ConvertStringIntoLowercase
{
    //main method
    public static void main(String[] input)

    {

         String strUpper, strLower;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name in uppercase : ");
        strUpper = scan.nextLine();

        strLower = strUpper.toLowerCase();
        System.out.println(" " + strLower);


    }
}


