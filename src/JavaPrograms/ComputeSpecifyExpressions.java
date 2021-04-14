package JavaPrograms;
/*
2. Write a Java program to compute the specified expressions and print the
output.
Test Data:
    a           b               c   d
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889

 */
// class defined as ComputeSpecifyExpressions
public class ComputeSpecifyExpressions
{
    //main method
    public static  void main(String[] args)
    {
        double a=25.5;
        float b=3.5f;
        double c=40.5;
        float d=4.5f;
        double e;

        e=(a*b-b*b)/(c-d);

                System.out.print(e);


    }


}
