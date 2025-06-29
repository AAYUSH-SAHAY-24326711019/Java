/*
* Program date 2906/2025
* To test this.methodName();
* */

public class program2 {
    void display(){
        System.out.println("Msg is displayed");
    }
    void m1(){
        this.display();
        // obj calls the m1 method , that calls the
        // display method using the reference of calling obj.
    }
    public static void main(String[] args) {
        program2 obj=new program2();
        obj.m1();
    }
}
/*
* output:
* Msg is displayed
* */