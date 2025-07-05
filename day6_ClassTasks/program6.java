/*
* Date : 05-07-2025
* Program6
* To remove the element at an index
* we use vectorObject.removeElementAt(index);
* */

import java.util.Scanner;
import java.util.Vector;

public class program6 {
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
        int newIndex;
        System.out.println("User Enter the index you need to delete->");
        newIndex=z.nextInt();
        System.out.println("Now removing index :"+newIndex+" value "+ v.elementAt(newIndex));
        v.removeElementAt(newIndex);
        System.out.println("List after removal");
        //print all after removal
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
//User Enter the index you need to delete->
//3
//Now removing index :3 value 156
//List after removal
//1.  Ravi[index: 0]
//2.  128.46[index: 1]
//3.  true[index: 2]
//Total 3 elements in vector