/*
* Program1
* Date : 08-07-2025
* To show the use of the int and Integer wrapper class
* */

public class program1 {
    public static void main(String[] args) {
        //int is a datatype , it declares variables.
        int x =10;
        //Integer is a Wrapper Class , it declares objects.
        Integer ob = 10;
        System.out.println("variable "+x+" object "+ob);
        //variable 10 object 10

        // to convert an integer value to string
        String s1 = Integer.toString(x);
        System.out.println("Value inside the S1 :"+s1);
        //Value inside the S1 :10

        // to convert any string to int value
        String s2 ="110";
        int newIntVar=Integer.parseInt(s2);
        System.out.println("After Conversion , new value is :"+newIntVar);
        //After Conversion , new value is :110

        int y = 100;
        Integer ob2 = Integer.valueOf(y);
        System.out.println("Value inside the ob2 "+ob2);
        //Value inside the ob2 100

        // Since s2 has 110 value
        Integer ob3 = Integer.valueOf(s2);
        System.out.println("Value inside the ob3 "+ob3);
        //Value inside the ob3 110

//Conclusion :
        // Integer class gives us functions to convert
        // to object of Integer Wrapper Class
        // from taking the values from int variables and
        // from String objects.
    }
}
//Process finished with exit code 0