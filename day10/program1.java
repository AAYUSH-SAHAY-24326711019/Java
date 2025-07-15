/*
Date : 15-07-2025

Problem definition
Given an array int arr[]={15,2,4,8,9,5,10,23};
go and find the target 23.
sum of the elements in range must be 23
also cannot add to self to obtain target

use the loops and arrays.
 */
import java.util.Scanner;

public class program1{
    public static void oneByOne(int a[],int l,int tar){
        //a[] is array, l is length and tar is target no.
        int sum=0;
        for(int i=0; i< l;i++){
            for (int j=0;j<l;j++){
                //check for index not same
                if(i==j){
                    continue;
                }
                //do the sum
                sum = a[i]+a[j];
                //check the sum =23
                if(sum ==tar){
                    System.out.println("Target ar ("+i+","+j+")");
                    System.out.println("->"+a[i]+"+"+a[j]+"="+tar);
                }
            }
        }
    }
    public static void inASequence(int a[],int l,int tar){
        //a[] is array, l is length and tar is target no.
        int sum=0,count=1;
        //loops go in sequentially
        a1:
        for(int i=0;i<l;i++){

            for(int j=0;j<l;j++){
                //check if both index equal
                if(i==j){
                    continue;
                }
                if(i>j){
                    continue;
                }
                //find the sum
                while(count ==1) {
                    sum = sum+a[i];
                    count=0;
                }
                sum=sum+a[j];
                //check if sum >target
                if(sum>tar){
                    sum=0;
                    count=1;
                    break;
                }
                if(sum==tar){
                    System.out.println("->range in "+i+" to "+j+"\n->");
                    for(int z=i;z<=j;z++){
                        System.out.print(a[z]+"+");
                    }
                    System.out.print("="+tar);
                }
                //found at last
                if(sum==a[a.length-1])
                    System.out.println("\nfound at the end");


            }
        }
    }
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int usrInp;
        int arr[]={15,2,4,8,9,5,10,23};
        int rev[]=new int[arr.length];
        for(int m=0;m<rev.length;m++){
            rev[m]=arr[arr.length-1-m];
        }
        int target =23;
        int key=1;
        while(key==1){
            System.out.println("\t\t==Menu of Program==\t\t");
            System.out.println("1. To search for the target ="+target+"(Input 1 and enter)\n\tin Linear manner");
            System.out.println("2. To search in a range (input 2 and enter)");
            System.out.println("3. Press 3 for Exit");
            System.out.println("\tUser , can I know your choice ->");
            usrInp=z.nextInt();
            switch (usrInp){
                case 1:
                    //one by one checking;
                    program1.oneByOne(
                            arr,
                            arr.length,
                            target
                    );
                    break;
                case 2:
                    // in a sequence checking;
                    program1.inASequence(
                            arr,
                            arr.length,
                            target
                    );
                    System.out.println("in the reverse mode:");
                    program1.inASequence(
                            rev,
                            rev.length,
                            target
                    );
                    break;
                default:
                    usrInp=3;

            }
            if(usrInp==3){
                System.out.println("Exiting Program");
                System.out.println("=======End of Output ========");
                key=0;
            }

        }
    }
}

/*
* ==Menu of Program==
1. To search for the target =23(Input 1 and enter)
	in Linear manner
2. To search in a range (input 2 and enter)
3. Press 3 for Exit
	User , can I know your choice ->
1
Target ar (0,3)
->15+8=23
Target ar (3,0)
->8+15=23
		==Menu of Program==
1. To search for the target =23(Input 1 and enter)
	in Linear manner
2. To search in a range (input 2 and enter)
3. Press 3 for Exit
	User , can I know your choice ->
2
->range in 1 to 4
->
2+4+8+9+=23
found at the end
in the reverse mode:

found at the end
->range in 3 to 6
->
9+8+4+2+=23		==Menu of Program==
1. To search for the target =23(Input 1 and enter)
	in Linear manner
2. To search in a range (input 2 and enter)
3. Press 3 for Exit
	User , can I know your choice ->
10
Exiting Program
=======End of Output ========*/