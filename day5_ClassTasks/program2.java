/*
* Date 2/07/2025
*
* Program on the Static and Dynamic Declaration of Array
* */
import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        //example of static declaration of array
        int arr1[]=new int[10];// it is a null array

        //example of
        int arr2[]; int size;
        System.out.println("User , give size of array->");
        size = z.nextInt();
        arr2= new int[size];
        System.out.println("New Array create of size :"+arr2.length);

    }
}
//output
//User , give size of array->
//2
//New Array create of size :2
