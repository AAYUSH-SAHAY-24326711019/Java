public class overloading {

    void add(){
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }
    void add(int x,int y){
        int c;
        c=x+y;
        System.out.println(c);
    }

    int add(int x1,int y1,int z1){
       return (x1+y1+z1);
    }

    public static void main(String[] args) {
        overloading o = new overloading();
        o. add();
        o. add(10,20);
        System.out.println("The result is ="+o.add(10,20,30));
    }
}
