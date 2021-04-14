package JavaPrograms;
                    //instance and static method
//class declared as Program3
public class Program3
{
    /*
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
    print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
     */
//    one instance and one static variable
           int r=4; //instance variable
    static int c=2; // static variable

//  instance method
    void i1()
    {
//        Call  instance variable into instance methods
        System.out.print(r);

    }
//  static method
    static void j()
    {
//  Call static variable into static methods
        System.out.print(c);

    }
//  instance and static methods into the Main method
    public static void main(String[] args)
    {
        //instance method call
        Program3 obj = new Program3();
        System.out.println(obj.r);
        //call static method
         j();


    }
}
