/*
 * Date : 30/06/2025
 * Topic : Super keyword , call Param. super class Constructor
 * */
class A3{
    A3(int a){
        System.out.println("Default constructor of A class Recieved ="+a);
    }
}

class B3 extends A3{
    B3(){
        super(100);// to call the method of super class.
        System.out.println("Default constructor of B class");
    }
}

public class program5 {
    public static void main(String[] args) {
        B3 obj= new B3();
    }
}

//output
//Default constructor of A class Recieved =100
//Default constructor of B class
