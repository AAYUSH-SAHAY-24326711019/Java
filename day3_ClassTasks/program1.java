/*
* Date 30/06/2025
* Purpose : Code To use the scanner class to take input
* and perform the addition
* */
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int a , b;
        System.out.println("Enter 2 no. ->");
        a=z.nextInt();
        b=z.nextInt();
        System.out.println("The sum is="+(a+b));

    }
}

//output
//Enter 2 no. ->
//10
//20
//The sum is=30

