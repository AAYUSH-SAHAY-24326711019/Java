/*
* Date : 09-07-2025
* Program 2 :
* To use the for loop to print 1 to 10
* use the Thread.sleep method
* use the throws keyword to get InterruptedException
* handled by the the calling main method.
* */

import java.lang.*;
public class program2 {
    public static void main(String[] args) throws InterruptedException {

        for(int i=0; i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
/*output
* 0
1
2
3
4
5
6
7
8
9
10

Process finished with exit code 0
*/