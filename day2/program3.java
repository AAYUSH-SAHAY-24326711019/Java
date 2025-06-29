/*
 * Date 29/06/2025
 * Program using this keyword to do the chaining of
 * constructors
 *
 * */


class ThisDemo{
    ThisDemo(){
        //to call the parametrised constructor we added:
        //this(10); //uncomment inorder to run
        System.out.println("No arguments constructor is called");
    }
    ThisDemo(int a){
        //to call the non parametrised constructor we added:
        //this(); //uncomment inorder to run


        System.out.println("Parametrised constructor is called");
    }
}
class program3{
    public static void main(String[] args) {

        ThisDemo td = new ThisDemo();


    }
}

//For ThisDemo td = new ThisDemo(5);
// No arguments constructor is called
//Parametrised constructor is called

//For ThisDemo td = new ThisDemo();
// when Parametrised constructor is called
//No arguments constructor is called