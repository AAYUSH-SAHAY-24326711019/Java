/*
* Program 3
* To use the set and get methods in the ArrayList
* set : To replace the object (value) at index with
*       user specified value.
*       -> arrayListObject.set(index,value);
*
* get : To retrive the object (value) at index with
*       user specified value.
*       -> arrayListObject.get(index);
* */
import java.util.Scanner;
import java.util.ArrayList;
public class program3 {
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
        System.out.println("Setting "+value+" at index"+newIndex);
        z.set(newIndex,value);
        System.out.println("==Result after set operation==");
        index=0;
        for(Integer p:z){
            System.out.printf("%d .  "+p+"[Index : %d]\n",(index+1),index);
            index=index+1;
        }
        System.out.println("Total "+(index)+" elements");

        System.out.println("User , for getting , give the index value ->");
        newIndex=s.nextInt();
        System.out.println("You got the value :"+z.get(newIndex));
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
Setting 999 at index0
==Result after set operation==
1 .  999[Index : 0]
2 .  345[Index : 1]
3 .  543[Index : 2]
4 .  367[Index : 3]
Total 4 elements
* User , for getting , give the index value ->0
You got the value :999
* */