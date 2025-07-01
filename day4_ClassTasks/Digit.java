/*
 * Program to find the no. of digits
 * Date : 1/07/2025
 * 
 */

import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        int n , c=0;
        Scanner z = new Scanner(System.in);
        System.out.println("Enter the number:");
        n=z.nextInt();
        if(n!=0){
        while(n>0){
            c++;
            n=n/10;
        }
        }
        else {
            System.out.println("1 digit");
        }
        System.out.println("Total no. of digits "+ c);

    }

}
//failure when 0 is the input then the input is 0
