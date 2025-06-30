/*
* Using the if-else ladder make the grading system
* use the scanner class to take the input from the
* user the marks out of 500
*
* */
import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks out of 500 ->");
        marks = z.nextInt();
        if(marks>=300 && marks<=500)
            System.out.println("First");
        else if(marks>=225 && marks<300)
            System.out.println("Second");
        else if(marks>=150 && marks<225)
            System.out.println("Third");
        else if(marks>=0 && marks<150)
            System.out.println("Fail");
        else
            System.out.println("Invalid !");
    }
}
//output
//Enter the marks out of 500 ->
//456
//First
//Enter the marks out of 500 ->
//236
//Second
//Enter the marks out of 500 ->
//120
//Fail
//Enter the marks out of 500 ->
//-20
//Invalid !