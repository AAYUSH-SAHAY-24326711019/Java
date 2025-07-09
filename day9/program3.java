/*
* Date : 09-07-2025
* Program3 :
* To handle the exception manually by using the try and catch
* block
* */

public class program3 {
    public static void main(String[] args) {

        for(int i = 0; i<=10;i++){
            try{
                System.out.println(i);//risky code;
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
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