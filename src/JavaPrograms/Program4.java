package JavaPrograms;
                    //instance and static method
//class declared as Program4
public class Program4
{
    /*
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
    print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme
     */
//      two instance and two static variables
        int a=10;
        int b=20;
        static int s=30;
        static int y=40;

//      instance method
     void p()
     {
//         instance variables
         System.out.println(a);
         System.out.println(b);
//         static variables
         System.out.println(s);
         System.out.println(y);
     }

//     static method
    static void q()
    {
//        instance variables
        Program4 obj = new Program4();
        System.out.println(obj.a);
        System.out.println(obj.b);
//        static variables
        System.out.println(s);
        System.out.println(y);

    }
//    Main method
   public static void main(String[] args)
   {
//       Call both instance and static methods into the Main method
//       instance call
       Program4 obj = new Program4();
       obj.p();

//      static call
       q();
   }




}
