/** Date : 04-07-2025
* Purpose : To use the string for the handling of the
* Null pointer Exception.
*/
public class program2 {
    public static void main(String[] args) {
        String str = null;
        System.out.println("the string contains :" + str);
        try {
            System.out.println(str.toUpperCase());
        } catch (Exception e) {
            System.out.println("Null string cannot be upper case");
        }
    }
    //output
    //the string contains :null
    //Null string cannot be upper case
}
