/*
* Date 01-07-2025
* Purpose to print the floyds triangle
* */
import java.util.Scanner;
public class FloydTriangle {
    public static void main(String[] args) {
        int i,j;
        //for row there is an outer loop
        for(i=1; i<=5; i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
//output
//*
//**
//***
//****
//*****