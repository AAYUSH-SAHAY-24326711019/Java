/*
* Date 29/06/2025
* Purpose : to implement the recursion.
* To find the sum of the 1st n natural numbers
* */


public class program6 {

    int sum(int b){
        if(b>0){
            return (b+sum(b-1));
        }
        else
            return 0;
    }

    public static void main(String[] args) {
        program6 obj=new program6();
        int inp=10;
        int result=obj.sum(inp);
        System.out.println("The result is: "+result);
    }
}

//outputs:
// result is: 55