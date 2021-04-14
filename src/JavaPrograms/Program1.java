package JavaPrograms;
                        //instance method
//class declared as Program1
public class Program1
{
    /*
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
     */

//  two instance variables
    int x=9;
    int y=8;

//     one instance method
       void m1()
        {
//        Call both instance variables into the instance method

            System.out.println(x);
            System.out.println(y);

        }
        //Main method
    public static void main(String[] args)
    {
//      Call the instance method into the Main method
        Program1 obj = new Program1();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.m1();

    }

}
