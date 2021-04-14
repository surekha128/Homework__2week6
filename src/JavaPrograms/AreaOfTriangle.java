package JavaPrograms;
// Write a program to calculate the area of a triangle.
import java.util.Scanner;
//class defined as AreaOfTriangle
public class AreaOfTriangle
{
    //main method
    public static void main(String[] args)
    {
        int height,base,area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height of the triangle ::");
        height = sc.nextInt();
        System.out.println("Enter base of the triangle ::");
        base = sc.nextInt();
        area = (height* base);
        System.out.println("area of the triangle id ::"+area);
    }

}
