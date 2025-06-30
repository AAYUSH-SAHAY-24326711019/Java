/*
* Date : 30/06/2025
* Purpose : To use the ternary operator to find the
* largest of 2 numbers
* */
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int a , b, c;
        System.out.println( "Enter 2 numbers->");
        a=z.nextInt();
        b=z.nextInt();
        c = (a>b)?a:b;
        System.out.println("The Largest of 2 ="+c);
    }
}

//output
//Enter 2 numbers->
//10
//20
//The Largest of 2 =20
