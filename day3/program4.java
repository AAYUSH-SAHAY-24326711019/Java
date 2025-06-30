/*
 * Date : 30/06/2025
 * Topic : Super keyword , call default super class Constructor
 * */
class A2{
    A2(){
        System.out.println("Default constructor of A class");
    }
}

class B2 extends A2{
     B2(){
        super();// to call the method of super class.
        System.out.println("Default constructor of B class");
    }
}

public class program4 {
    public static void main(String[] args) {
        B2 obj= new B2();
    }
}

//output
//Default constructor of A class
//Default constructor of B class
