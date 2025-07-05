/** Date : 4-7-2025
* Purpose:Try-catch and finally block example
** */
public class program4 {
    //exception code from program 3
    public static void main(String[] args) {
        String input = "Hello";
        System.out.println("String contains :" + input);
        try {
            System.out.println(Integer.parseInt(input));
        } catch (Exception e) {
            System.out.println("String to Int conv. exception" + e.getMessage());
        } finally {
            System.out.println("Success after exception-handled");
        }
    }
}
//output
//String contains :Hello
//String to Int conv. exceptionFor input string: "Hello"
//Success after exception-handled
