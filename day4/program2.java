/*
* Date : 01-07-2025
* Purpose : to show the use of the var args.
*
* */

class Calculator{
    public int add(int...n) {
        //arguments are store in an array of int type n[]
        if (n.length > 0) {
            int sum = 0;
            for (int i : n) {
                sum = sum + i;
            }
            return sum;
        }
        else {
            return 0;
        }
    }
}

public class program2 {
    public static void main(String[] args) {
            Calculator c = new Calculator();
            int result = c.add();
        System.out.println("Result when no parameters ->"+result);
        result=c.add(10,20);
        System.out.println("Result when 2 parameters ->"+result);
    }
}
// output
//Result when no parameters ->0
//Result when 2 parameters ->30