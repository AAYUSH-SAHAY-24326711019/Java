/*
 * Program to find the no. of digits
 * Date : 1/07/2025
 *  Find the no. of digits using the do while loop
 */




import java.util.Scanner;

public class Digit2 {
    public static void main(String[] args) {
        int n , c=0;
        Scanner z = new Scanner(System.in);
        System.out.println("Enter the number:");
        n=z.nextInt();

            do{
                c++;
                n=n/10;
            }while(n>0);


        System.out.println("Total no. of digits "+ c);

    }

}
//failure when 0 is the input then the input is 0
