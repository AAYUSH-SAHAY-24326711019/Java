/*
* Date 01-07-2025
* Program to show the use of Enums
* Enums are the named constants.
* In object orientation of Java , enums are
* class and the constants are the objects
* of a defined value
* */

enum Status{
    running , failed , pending ,success;
}

public class program3 {
    public static void main(String[] args) {
        int i =4;
        Status s = Status.running;
        //we assigned the running constant(obj of enum)'s ref
        //to the s refernce variable.
        System.out.println(s);
        //To see the index of the enum
        System.out.println(s.ordinal());
        //we now assign it with other constant
        s= Status.failed;
        System.out.println(s.ordinal());

        // to print all the values from the Status enum
        Status [] ss =Status.values();
        for(Status s1:ss){
            System.out.println(s1+" :" +s1.ordinal());

        }

    }
}
//output
//
//running
//0
//1
//running :0
//failed :1
//pending :2
//success :3