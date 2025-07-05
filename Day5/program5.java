/*
* Date :4-7-2025
* Program to show the use of the multiple try and catch block
* */

public class program5 {
    public static void main(String[] args) {
        // divide by 0 exception module
        try{
            int a=10; int b=0; int c;
            c=a/b;
            System.out.println(c);
        }catch(ArithmeticException ae){
            System.out.println( ae.getMessage());
        }
        //array out of bounds exception
        try{
            int aa[]={10,20,30,40};
            System.out.println(aa[4]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
//output
// / by zero
//Index 4 out of bounds for length 4