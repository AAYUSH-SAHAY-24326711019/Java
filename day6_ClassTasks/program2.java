/*
* Date : 04-07-2025
* Program 2 : to use the addElement method to add the items
* of different data types in the vector.
*
* Syntax : vectorObject.addElement(item);
* item is a variable , we will take the input to it by
* scanner class according to the datatype suitable.
* */
import java.util.*;
import java.lang.Object;
public class program2 {
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        Vector v = new Vector();
        v.addElement("Ravi");//type:string
        v.addElement(128.46); //type double
        v.addElement(true); //type bool
        v.addElement(156); //type int

        //function to show all the values using the
        // for each loop.
        //object class is the java class that's instance
        //will store any kind / datatype value.
        int index=0;
        for(Object o:v){
            System.out.printf("%d.  "+o+"[index: %d]\n",(index+1),index);
            index=index+1;
        }
    }
}
//        1.  Ravi[index: 0]
//        2.  128.46[index: 1]
//        3.  true[index: 2]
//        4.  156[index: 3]
