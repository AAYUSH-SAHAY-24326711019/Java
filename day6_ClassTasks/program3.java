/*
* Date 05-07-2025
* Program : 3
* To use the standard for loop to print the values in
* the vector class
* */
import java.util.*;
import java.lang.Object;
public class program3 {
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        Vector v = new Vector();
        v.addElement("Ravi");//type:string
        v.addElement(128.46); //type double
        v.addElement(true); //type bool
        v.addElement(156); //type int

        //we will need to use the
        // vectorObject.size() to get the size of the
        //vector-list
        //Since, we are using the standard for loop
        //which iterates over the index values,
        //the vectorObject.elementAt(index); is used
        //to fetch the item it stores at the index.
        for (int i = 0; i<v.size();i++){
            System.out.printf("%d.  "+v.elementAt(i)+"[index: %d]\n",(i+1),i);
        }

    }
}
//1.  Ravi[index: 0]
//2.  128.46[index: 1]
//3.  true[index: 2]
//4.  156[index: 3]