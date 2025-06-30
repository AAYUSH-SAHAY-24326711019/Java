/*
* Date :30/06/2025
* purpose : declaring a variable as final
* this makes it to not be able to re-initialised with a
* new value.
* Final variables always begin with capital letter.
* */


import org.w3c.dom.ls.LSOutput;

public class program6 {


    public static void main(String[] args) {
        final int A=10;
        System.out.println(" Value of A = "+A);
        //commented lines are erroneous.
        //A=20;
        //System.out.println(" Value of A = "+A);
    }
}
//Value of A = 10
