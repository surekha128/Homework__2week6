package JavaPrograms;
                    //static method
//class declared as Program2
public class Program2
{
    /*
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
    */

//two static variables
     static int a=10;
     static int b=20;

//    static method
    static void s1()
    {
//     Call both static variables into the static method inside

        System.out.println(a);
        System.out.println(b);

    }
//    Main method
    public static void main(String[] args)
    {
//        Call the static method into the Main method
        s1();
    }

}
