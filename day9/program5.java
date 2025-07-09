/*
 * Date : 09-07-2025
 * Program5
 * to use the throws keyword to resolve the exception
 * */
class Test{
    void divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("value of b is 0");
        }
        else{
            int c = a/b;
            System.out.println(c);
        }
    }
}

public class program5 {
    public static void main(String[] args) {
        Test t = new Test();
        try{
            t.divide(20,0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
//output
//t.divide(20,2); Output : 10

//output
//value of b is 0
//
//Process finished with exit code 0
