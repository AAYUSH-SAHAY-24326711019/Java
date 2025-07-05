/*
* Date : 05-07-2025
* Program 4
* For Showing all the elements inside the ArrayList
* using the standard for loop.
*
* For that we will require to utilize the
* arrayListObject.size(); method
* */
import java.util.Scanner;
import java.util.ArrayList;
public class program4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Array List uses the wrapper class
        ArrayList <Integer> z= new ArrayList<Integer>();
        //to add the elements inside the arraylist
        z.add(123);
        z.add(345);
        z.add(543);
        z.add(367);
        //there is no limitation of the size of the ArrayList
        // to print all the elements inside the
        //ArrayList
        for(int i=0; i<z.size(); i++){
            System.out.printf("Element %d  "+z.get(i)+"[index :%d]\n",(i+1),i);
        }

    }
}
/*output
* Element 1  123[index :0]
Element 2  345[index :1]
Element 3  543[index :2]
Element 4  367[index :3]*/