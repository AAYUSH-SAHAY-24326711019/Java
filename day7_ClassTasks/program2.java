/*
* Date 05-07-2025
* Program 2
* Array list add method
*
* */
import java.util.ArrayList;
import java.util.Scanner;

public class program2 {
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
        int index=0;
        for(Integer p:z){
            System.out.printf("%d .  "+p+"[Index : %d]\n",(index+1),index);
            index=index+1;
        }
        System.out.println("Total "+(index)+" elements");
        //to add at an index
        int value,newIndex;
        System.out.println("User give index & value:");
        newIndex=s.nextInt();
        value=s.nextInt();
        System.out.println("adding "+value+" at index");
        z.add(newIndex,value);

        index=0;
        for(Integer p:z){
            System.out.printf("%d .  "+p+"[Index : %d]\n",(index+1),index);
            index=index+1;
        }
        System.out.println("Total "+(index)+" elements");


    }
}
/*output
*
1 .  123[Index : 0]
2 .  345[Index : 1]
3 .  543[Index : 2]
4 .  367[Index : 3]
Total 4 elements
User give index & value:
0
999
adding 999 at index
1 .  999[Index : 0]
2 .  123[Index : 1]
3 .  345[Index : 2]
4 .  543[Index : 3]
5 .  367[Index : 4]
Total 5 elements
* */

