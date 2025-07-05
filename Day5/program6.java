/*
* Date :4-7-2025
* Program to show single try and multiple catch block
* */


public class program6 {
    public static void main(String[] args) {
        //divide by 0 and Array index out of bounds
        //exception both in the single try block
        //.Added String null pointer exception
        try{
            //Arith.Exc. for Div by 0
            int a =10;
            System.out.println(a/0);

            //array index out of bounds exception
            int aa [] = {10,20};
            System.out.println(aa[2]);

            //string null ptr exception
            String aaa=null ;
            System.out.println(aaa.toUpperCase());
        }
        catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException aib){
            System.out.println(aib.getMessage());
        }
        catch (NullPointerException npe){
            System.out.println(npe.getMessage());
        }
        //last catch is for all the kinds of exception
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

//output.
//Only one of many catch block will run
