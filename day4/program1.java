/*
* Date : 01-07-2025
* Purpose : Command Line Arguments
* To take the command line arguments and find their sum
* */

public class program1 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0; i< args.length;i++){
            sum=sum+Integer.parseInt(args[i]);
        }
        System.out.println("The sum ="+sum);
    }
}
//PS C:\Users\Dell\Desktop\JavaMCA> java program1.java 10 20
//The sum =30