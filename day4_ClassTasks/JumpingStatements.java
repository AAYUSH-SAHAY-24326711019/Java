public class JumpingStatements {
    //break and continue
    //our work is finite nature so loop run in the finite manner
    //to make the loop 10 run , it stop after 10 times
    //break does the premature completion of the loop.
    //or to end before the loop completes at the end.

    //continue will skip the current iteration and
    //go to the next iteration.

    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println("Hello");
            if(i==3)
                //break;// 1st uncomment it
                continue;
            System.out.println("Bye");
        }
    }
}
//output of break
//Hello
//        Bye
//Hello
//        Bye
//Hello

//output of Continue
//Hello
//Bye
//Hello
//Bye
//Hello
//Hello
//Bye
//Hello
//Bye

//next class labelled for loop , array and enhanced for loop , array list,
//collectors and vectors