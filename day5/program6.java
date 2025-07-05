/** Date : 4-7-2025
* Program to show the use of the nested try block
*/
public class program6 {
    public static void main(String[] args) {
        try {
            try {
                int a[] = {10, 20, 30};
                System.out.println(a[3]);
            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println(ae.getMessage());
            }
        } catch (ArithmeticException aee) {
            System.out.println(aee.getMessage());
        }
        System.out.println("Program finally over");
    }
}
//output
//Index 3 out of bounds for length 3
//Program finally over
