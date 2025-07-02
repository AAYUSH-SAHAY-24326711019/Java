/*
* Date : 2/7/2025
* Program to create an array and to take input
* make the dynamic array
*
* */

import java.util.Scanner;
public class program3 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int size; int arr[];//null array
        System.out.println("User, Give the size of array->");
        size=z.nextInt();
        arr=new int[size];
        // code to take input in the array
        System.out.println("User enter "+size+" elements");
        for(int i=0; i<arr.length;i++){
            arr[i]=z.nextInt();
        }

        //code to show output in a line
        System.out.println("You entered the following numbers :");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }

    }

}
//User, Give the size of array-> 5
//
//User enter 5 elements
//1
//2
//3
//4
//5
//You entered the following numbers :
//        1, 2, 3, 4, 5,