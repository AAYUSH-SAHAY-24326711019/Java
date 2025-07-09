/*
* Date : 09-07-2025
* Program 1
* for throwing explicitly the exception using the
* throw keyword
* */
import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("user give age:(give -ve no.)");
        int age =z.nextInt();
        if(age<18)
            throw new ArithmeticException("Age cannot be -ve.");
        else
            System.out.println("You are eligible for vote");
    }

}
/*output
* user give age:(give -ve no.)
10
Exception in thread "main" java.lang.ArithmeticException: Age cannot be -ve.
	at program1.main(program1.java:14)

Process finished with exit code 1
*
*user give age:(give -ve no.)
20
You are eligible for vote

Process finished with exit code 0
*
* */