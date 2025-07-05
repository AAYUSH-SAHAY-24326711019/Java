/*
*
* Date: 4-7-2025
* Programs on exception handling in java
* This program shows the happening of exceptions
* */
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        int divisor=0;
        System.out.print("User, enter a number->");
        int noInp=z.nextInt();
        try{
            int out=noInp/divisor;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
//output
//User, enter a number->10
//divide  by zero exception