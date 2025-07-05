/** Date : 04-07-2025
* To handle the string to integer conversion exception
*/
import java.util.Scanner;
public class program3 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        String input = "Hello";
        System.out.println("String contains :" + input);
        try {
            System.out.println(Integer.parseInt(input));
        } catch (Exception e) {
            System.out.println("String to Int conv. exception" + e.getMessage());
        }
    }
}
//output
//String contains :Hello
//String to Int conv. exceptionFor input string: "Hello"
