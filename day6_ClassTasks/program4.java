/*
* Date : 05-07-2025
* Program 4
*  To add elements in the vector,
* we use the vectorObject.insertElementAt(item,index);
* it will add the element at the index and push all the
* elements to the next index
* */
import java.util.*;
import java.lang.Object;
public class program4 {
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        Vector v = new Vector();
        v.addElement("Ravi");//type:string
        v.addElement(128.46); //type double
        v.addElement(true); //type bool
        v.addElement(156); //type int

        //show all the elements before adding new element
        int index=0;
        for(Object o:v){
            System.out.printf("%d.  "+o+"[index: %d]\n",(index+1),index);
            index=index+1;
        }
        System.out.println("Total "+index+" elements in vector");
        int age, newIndex;
        System.out.print("User, Enter your age->"); age=z.nextInt();
        System.out.println();
        System.out.print("User, Enter index to add->"); newIndex=z.nextInt();
        v.insertElementAt(age,newIndex);
        System.out.println();
        System.out.println("Showing the new list of elements");
        index=0;
        for(Object o:v){
            System.out.printf("%d.  "+o+"[index: %d]\n",(index+1),index);
            index=index+1;
        }
        System.out.println("Total "+index+" elements in vector");

    }
}
//output
//1.  Ravi[index: 0]
//2.  128.46[index: 1]
//3.  true[index: 2]
//4.  156[index: 3]
//Total 4 elements in vector
//User, Enter your age->21
//
//User, Enter index to add->0
//
//Showing the new list of elements
//1.  21[index: 0]
//2.  Ravi[index: 1]
//3.  128.46[index: 2]
//4.  true[index: 3]
//5.  156[index: 4]
//Total 5 elements in vector