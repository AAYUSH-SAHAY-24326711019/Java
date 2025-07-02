/*
* Date : 02-07-2025
* To use the for each loop to print all the elements
*  Make the array , take input , show by enhanced for
* */


import java.util.Scanner;
public class program4 {
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

        //code to show output in a line using for-each loop
        System.out.println("You entered the following numbers :");
        for(int k:arr){
            System.out.print(k+",");
        }

    }

}
/*output
* User enter 3 elements
1
2
3
You entered the following numbers :
1,2,3,*/
