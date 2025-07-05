/*
* Date 4-7-2025
* Program on the nested Catch Block
* */

public class program8 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (Exception e){
            try{
                String aa=null ;
                System.out.println(aa.toLowerCase());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Finally the program ends");
    }
}
//output
//Cannot invoke "String.toLowerCase()" because "aa" is null
//Finally the program ends
