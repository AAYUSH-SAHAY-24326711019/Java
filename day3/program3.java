/*
* Date : 30/06/2025
* Topic : Super keyword , call the super class method
* */
class A1{
    void sh(){
        System.out.println("Class A sh();");
    }
}

class B1 extends A1{
    void sh(){
        super.sh();// to call the method of super class.
        System.out.println("Class B sh();");
    }
}

public class program3 {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.sh();
    }

}

//outputs:
//Class A sh();
//Class B sh();