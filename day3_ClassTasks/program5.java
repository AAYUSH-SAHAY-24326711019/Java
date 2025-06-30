/*
* Date : 30/06/2025
* Purpose :  To print the no. of days in the month
* 1st take input the year and decide whether it is
* leap year or not
* To make using the switch case method.
* */
import java.util.Scanner;
public class program5 {
    public static void main(String[] args) {
        int year , month;
        Scanner z = new Scanner(System.in);
        System.out.println("Enter the year ->");
        year=z.nextInt();
        System.out.println("Enter the month number ->");
        month=z.nextInt();
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31-days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30-days");
                break;
            case 2:
                if(year%4==0 && year%100!=0||(year%400==0)){
                    System.out.println("29-days");
            }
                else{
                    System.out.println("28-days");
                }
                break;
            default:
                System.out.println("Invalid Month");



        }

    }
}
//output:
//Enter the year ->
//2024
//Enter the month number ->
//2
//29-days

//Enter the year ->
//2025
//Enter the month number ->
//2
//28-days