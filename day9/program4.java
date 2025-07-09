/*
* Date : 09-07-2025
* Program4
* to use the throw keyword to resolve the exception
* */
class test{
    void divide(int a,int b){
        if(b==0){
            throw new ArithmeticException("value of b is 0");
        }
        else{
            int c = a/b;
            System.out.println(c);
        }
    }
}

public class program4 {
    public static void main(String[] args) {
        test t = new test();
        t.divide(20,2);
    }
}
//output
//Exception in thread "main"
// java.lang.ArithmeticException: value of b is 0

//t.divide(20,2);
// 10
//
//Process finished with exit code 0