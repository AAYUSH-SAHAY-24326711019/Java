/*
/*
 * Program to find the sum  of digits in a number
 * Date : 1/07/2025
 * 
 Also find the reverse of the number

* 128 = 1+2+8=11

*/
import java.util.Scanner;

public class SumOfDigits{
    public static void main(String[] args) {
        int n , s=0,r;
        Scanner z = new Scanner(System.in);
        System.out.println("Enter the number:");
        n=z.nextInt();

        do{
            r=n%10;
            //s=s+r; // reverse of digit is
             s=s*10+r;
            n=n/10;
        }while(n>0);


        //System.out.println("Total sum of digits "+ s);
        System.out.println("Reverse of the digit is :"+s);
    }

}
//sum of odd and sum of even




