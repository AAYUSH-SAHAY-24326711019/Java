import java.util.Scanner;

/*
* Date : 12-07-2025
* Program 1
* Task : Make Integer Wrapper class and take input.
* Task :Take the name and input it into string and display
* */
public class program1 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        Integer a,b;
        System.out.println("Give values for a and b ->");
        a=Integer.parseInt(z.nextLine());
        b=Integer.parseInt(z.nextLine());
        System.out.println("The sum = "+(a+b));
        String s;
        System.out.println("Enter your name->");
        s=z.nextLine();
        System.out.println("Your name is : "+s);

    }
}
/*
* Give values for a and b ->
20
15
The sum = 35
Enter your name->
Aayush Sahay
Your name is : Aayush Sahay

Process finished with exit code 0*/