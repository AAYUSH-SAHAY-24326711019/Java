class An{
    void show(){
        System.out.println("in A show");
    }
}




public class anonymousInnerClass {
    public static void main(String[] args) {
        An obj = new An();
        obj.show();
        An newObj = new An(){
            void show(){
                System.out.println("in new A show");
            }
        };
        newObj.show();
    }
}
