/*
* Date : 29/06/2025
* Purpose : to use this keyword to pass the argument in the
* constructor
* */
class Test{
    Test(program5 obj){
        System.out.println("Constructor of Test class");
    }
}

public class program5 {
    void m1(){
        Test t = new Test(this);
    }

    public static void main(String[] args) {
        program5 obj = new program5();
        obj.m1();
        // make the object of the class,
        //call the m1 function that passes the
        //reference to the constructor of the Test Class
    }

}

//outputs
//Constructor of Test class
