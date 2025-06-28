import org.w3c.dom.ls.LSOutput;

class A{
    int x=10;
    void show(){
        System.out.println("inside A show");
    }
    static class B{
       static void config(){
            System.out.println("inside B config");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B.config();

    }
}
