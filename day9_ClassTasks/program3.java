/*
* Date : 12-07-2025
* Program 3
* Task : to make an n digit argument summation
* program , program takes n , no of arguments
* and returns the sum
* */
public class program3 {
    public static void main(String[] args) {
        if(args.length<=0){
            System.out.println("sum =0");
            return;
        }
        else if (args.length==1){
            System.out.println("sum ="+Integer.parseInt(args[0]));
            return;
        }
        else{
            int sum=0;
            for (int i =0; i< args.length;i++){
                sum =sum+Integer.parseInt(args[i]);
            }
            System.out.println("sum ="+sum);
        }
    }
}
/*
* output
* PS C:\Users\Dell\Desktop\CodesOfJava\good> java program3
sum =0
* PS C:\Users\Dell\Desktop\CodesOfJava\good> javac program3.java
sum =10
PS C:\Users\Dell\Desktop\CodesOfJava\good> java program3 10 20
sum =30
PS C:\Users\Dell\Desktop\CodesOfJava\good> java program3 10 20 30
sum =60

*/