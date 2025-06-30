/*
* Date : 30/06/2025
*
* Dynamic method dispatch
 */
class A{
    public void show(){
        System.out.println("Inside A. show();");
    }
}

class B extends A{

    public void show(){
        System.out.println("Inside B. show();");
    }
}

class C extends A {

    public void show(){
        System.out.println("Inside C. show();");
    }
}

public class program2 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}

//Outputs:
//Inside A. show();
////Inside B. show();
////Inside C. show();
