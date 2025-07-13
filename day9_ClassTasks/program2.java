/*
* Date : 12-07-2025
* Program 2 :
* Task : make a program that takes 2 arguments
* from the cmd line.
* Then produce the sum.
* Remember , less than 2 or more than 2 must
* terminate the program using the return keyword.
* */

public class program2 {
    public static void main(String[] args) {
        if(args.length<2||args.length>2){
            System.out.println("insufficient arguments");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("The sum = "+(a+b));
    }
}
/*
* PS C:\Users\Dell\Desktop\CodesOfJava> javac program2.java
PS C:\Users\Dell\Desktop\CodesOfJava> java program2 10 20
The sum = 30

* PS C:\Users\Dell\Desktop\CodesOfJava> java program2 10 20 30
insufficient arguments

* */