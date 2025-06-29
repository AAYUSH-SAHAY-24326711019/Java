/*
* Date 29/06/2025
* Purpose : to implement the instance block and to show that
* the both the static as well as non static is accessed
* */


public class program8 {
    int a=10; static int b=20;
    {//instance block
        System.out.println("The values of a,b="+a+", "+b);
    }

    public static void main(String[] args) {
        //when main method is left blank.
        // we get no output. we get on object creation.

        program8 obj = new program8();

        //sequence is :
        //static block -> instance block -> constructors
    }
}

//outputs:
//The values of a,b=10, 20
