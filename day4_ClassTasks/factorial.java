/*
 * Date 01-07-2025
 * Purpose to find the factorial using the for loop
 * */
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        int n,i,f=1;
        System.out.println("Enter the no. ->");
        n=z.nextInt();
        for(i=1;i<=n;i++){
            f=f*i;
            //or f*=i;
            // is compound assignment
        }
        System.out.println("The factorial is ="+f);
    }
}
//output
//Enter the no. ->
//        4
//The factorial is =24
