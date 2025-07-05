/*
 * Date : 05-07-2025
 * Program 5
 * For removing the elements at the index
 * or clearing the entire Array List
 * */
import java.util.Scanner;
import java.util.ArrayList;

public class program5 {
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
        System.out.println("User give index [for deleting]:");
        newIndex=s.nextInt();
        System.out.println("Deleting "+z.get(newIndex)+" at index"+newIndex);
        z.remove(newIndex);
        System.out.println("==Result after Remove operation==");
        index=0;
        for(Integer p:z){
            System.out.printf("%d .  "+p+"[Index : %d]\n",(index+1),index);
            index=index+1;
        }
        System.out.println("Total "+(index)+" elements");
        String confirmation=null;
        System.out.println("User Are you sure to clear all {1/y/Y}");
        confirmation=s.next();
        if(confirmation.equals("1")||confirmation.equals("y")||confirmation.equals("Y")){
            z.clear();
        }
        index=0;
        for(Integer p:z){
            System.out.printf("%d .  "+p+"[Index : %d]\n",(index+1),index);
            index=index+1;
        }
        System.out.println("Total "+(index)+" elements");

    }
}
/*output
* 1 .  123[Index : 0]
2 .  345[Index : 1]
3 .  543[Index : 2]
4 .  367[Index : 3]
Total 4 elements
User give index [for deleting]:
0
Deleting 123 at index0
==Result after Remove operation==
1 .  345[Index : 0]
2 .  543[Index : 1]
3 .  367[Index : 2]
Total 3 elements
User Are you sure to clear all {1/y/Y}
1
Total 0 elements
* */