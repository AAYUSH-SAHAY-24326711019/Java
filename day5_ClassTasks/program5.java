/*
* Date 02-07-2025
* Program to make a matrix by dynamic declaration.
* Take input and show the output
* */
import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        int rows, columns;
        System.out.print("User Specify the rows->");
        rows=z.nextInt();
        System.out.print("\nUser Specify the Columns->");
        columns=z.nextInt();
        int matrix[][];
        matrix=new int[rows][columns];

        System.out.printf("\nUser you get a matrix \nof(%d x %d) order\n",rows,columns);
        //begin input
        for(int r=0;r<rows;r++){
            for(int c=0; c<columns;c++){
                System.out.println("Row no. "+(r+1)+" column no."+(c+1));

                matrix[r][c]=z.nextInt();
            }
            System.out.println();
        }

        //show the output
        for(int r=0;r<rows;r++){
            for(int c=0; c<columns;c++){
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
    }
}
/*output
* User Specify the rows->3

User Specify the Columns->3

User you get a matrix
of(3 x 3) order
Row no. 1 column no.1
1
Row no. 1 column no.2
0
Row no. 1 column no.3
0

Row no. 2 column no.1
0
Row no. 2 column no.2
1
Row no. 2 column no.3
0

Row no. 3 column no.1
0
Row no. 3 column no.2
0
Row no. 3 column no.3
1

1 0 0
0 1 0 
0 0 1 */
