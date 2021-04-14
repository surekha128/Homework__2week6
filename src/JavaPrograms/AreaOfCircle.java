package JavaPrograms;
/*Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r)*/
import java.util.Scanner;
//class defined as AreaOfCircle
public class AreaOfCircle
{
    //main method
    public static void main(String[] args)
    {
        int radius;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.println("radius ::");
        radius = sc.nextInt();
        area = Math.PI*(radius*radius);
        System.out.println("Area of circle A ::"+area);


    }


}
