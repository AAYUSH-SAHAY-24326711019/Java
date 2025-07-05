/*
* Date : 05-07-2025
* Program 1 : Array List is a class in java in the util package.
* its size will grow when element is added.
* Remove the element then the size will decrease.
* */

import java.util.ArrayList;
public class program1 {
    public static void main(String[] args) {
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
        int index=0;
        for(Integer p:z){
            System.out.printf("%d .  "+p+"[Index : %d]\n",(index+1),index);
            index=index+1;
        }
        System.out.println("Total "+(index)+" elements");
    }
}
//output
//1 .  123[Index : 0]
//2 .  345[Index : 1]
//3 .  543[Index : 2]
//4 .  367[Index : 3]
//Total 4 elements