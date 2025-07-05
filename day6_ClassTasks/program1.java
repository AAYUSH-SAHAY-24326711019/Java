/*
* Date 04-07-2025
* Program 1 for the Vector Class in Java
* it is a dynamic list that stores hetrogeneous datatypes
* as items. There are its main functions also included.
*
* it is the part of the Java.util package
* we also need the scanner class for the standard input
*
* Program1 : To create the vector in different ways.
*vector is dynamic nature , size will grow.
* */
import java.util.*;
public class program1 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        // one-by one size allocation
        //slow to make runtime
        //better when memory to utilise in a limit.
        Vector v1 = new Vector();
        //will allocate 5 spaces at once.
        //when new item added.
        //may lead to wastage of memory.
        int size = 5;
        Vector v2 = new Vector(size);
    }
}
