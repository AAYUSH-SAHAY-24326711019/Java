/*
* Date 29/06/2025
* purpose : to implement the static block in the program
* The use of the static block is that it runs even before the
* constructor , it runs when the class is being loaded by the
* jvm.
*
* Here the main method is left empty , still it will run.
*
* 2nd part that it will only be able to access the static members
* and not access the non-static members
* */

public class program7 {
    static{
        System.out.println("Hello World");
    }
    int a=10; static int b=20;
    static{
        //System.out.println("The output is : "+a+", "+b);
        // error:non-static variable a cannot
        // be referenced from a static context
        // solution : use the object of the class
        System.out.println("The output is : "+b);
    }

    public static void main(String[] args) {
    program7 obj = new program7();
    }
}
//outputs :
//Hello World
// output is : 20

