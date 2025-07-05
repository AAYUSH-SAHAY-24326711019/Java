/*
* Date 05-07-2025
* Program 7
* To remove all the elements of the vector
* */

import java.util.Scanner;
import java.util.Vector;

public class program7 {
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        Vector v = new Vector();
        v.addElement("Ravi");//type:string
        v.addElement(128.46); //type double
        v.addElement(true); //type bool
        v.addElement(156); //type int

        //show all the elements before deleting element
        System.out.println("See the list and chose what to delete");
        int index=0;
        for(Object o:v){
            System.out.printf("%d.  "+o+"[index: %d]\n",(index+1),index);
            index=index+1;
        }
        System.out.println("Total "+index+" elements in vector");
        //Code to remove
        System.out.println("You sure ? to delete{1/y/Y} ->");
        String confirm; confirm=z.next();
        if(confirm.equals("1")||confirm.equals("y")||confirm.equals("Y")){
            v.removeAllElements();
        }
        index=0;
        for(Object o:v){
            System.out.printf("%d.  "+o+"[index: %d]\n",(index+1),index);
            index=index+1;
        }
        System.out.println("Total "+index+" elements in vector");

    }
}
/*output*/
//See the list and chose what to delete
//1.  Ravi[index: 0]
//2.  128.46[index: 1]
//3.  true[index: 2]
//4.  156[index: 3]
//Total 4 elements in vector
//You sure ? to delete{1/y/Y} ->
//1
//Total 0 elements in vector