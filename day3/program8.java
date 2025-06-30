/*
* Date : 30/06/2025
* Purpose : To Declare a method as final to prevent it
* from being overridden in the sub class
*
* */
class Test{
    void mNum(){
        System.out.println("Mob No. ->12345-12345");
    }
    // we don't want that child class does not get
    // access as well as ability to override it.
    final void mCvv(){
        System.out.println("CVV No. ->544");
    }
}

class Thief extends Test{
   @Override
    void mNum(){
        System.out.println("Mob No. ->12345-12345 hacked");
    }
    // we don't want that child class does not get
    // access as well as ability to override it.
    // (Commented Lines Show Errors)-Uncomment them to run
//  @Override
//     void mCvv(){
//      System.out.println("CVV No. ->544 Hacked");
//    }
    //'mCvv()' cannot override 'mCvv()'
    // in 'Test'; overridden method is final
}

public class program8 {
    public static void main(String[] args) {
       Test T = new Thief();
        T.mNum();
        T.mCvv();
    }
}
//output:
//java: mCvv() in Thief cannot override mCvv() in Test
//overridden method is final