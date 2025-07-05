/*
* Date : 08-07-2025
* Program 5
* To remove the element from the index,
* we use the below :
* vectorObject.removeElement(item);
* it does the search and removal and Not on basis of index.
* */
import java.util.*;
import java.lang.Object;
public class program5 {
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
        String s=null;
        System.out.print("User, Specify what you require to delete ->");
        s=z.next();
        System.out.println("Removing "+s);
        v.removeElement(s);
        //print all after removal
        index=0;
        for(Object o:v){
            System.out.printf("%d.  "+o+"[index: %d]\n",(index+1),index);
            index=index+1;
        }
        System.out.println("Total "+index+" elements in vector");


    }
}
//output : The vectorObject.removeElement(item);
//works only on string values:
//See the list and chose what to delete
//1.  Ravi[index: 0]
//2.  128.46[index: 1]
//3.  true[index: 2]
//4.  156[index: 3]
//Total 4 elements in vector
//User, Specify what you require to delete ->Ravi
//Removing Ravi
//1.  128.46[index: 0]
//2.  true[index: 1]
//3.  156[index: 2]
//Total 3 elements in vector
//does leftward shifiting of the index of the elements inside
//vector