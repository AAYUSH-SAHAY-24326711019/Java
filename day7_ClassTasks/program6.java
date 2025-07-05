/*
 * Date : 05-07-2025
 * Program 6
 * Using the java.util.Collections package to
 * initiate the sorting of the elements inside
 * the Array List.
 *
 * The collections package creates a framework
 * of all the list classes like the
 * ArrayList , vector , stack and others and provide the
 * feature that can help us to sort all the data
 * through the methods it contains.
 * */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class program6 {
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
        System.out.println("Here is an ArrayList i.e unsorted");
        int index=0;
        for(Integer p:z){
            System.out.printf("%d .  "+p+"[Index : %d]\n",(index+1),index);
            index=index+1;
        }
        System.out.println("Total "+(index)+" elements");
        System.out.println("==Result after Sort operation==");
        Collections.sort(z);
        index=0;
        for(Integer p:z){
            System.out.printf("%d .  "+p+"[Index : %d]\n",(index+1),index);
            index=index+1;
        }
        System.out.println("Total "+(index)+" elements");

    }
}
/*
* Here is an ArrayList i.e unsorted
1 .  123[Index : 0]
2 .  345[Index : 1]
3 .  543[Index : 2]
4 .  367[Index : 3]
Total 4 elements
==Result after Sort operation==
1 .  123[Index : 0]
2 .  345[Index : 1]
3 .  367[Index : 2]
4 .  543[Index : 3]
Total 4 elements*/