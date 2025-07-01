/*
* Date:01-07-2025
* Purpose:To use the Enumeration as a class
* and use its constructor to initialise the
* values of the object (The object of the enum)
*
* */
enum Laptop{
    //variable in the enum
    macbook(10000),xps(4000),surface(2000),thinkpad;
    int price;
    //making the default constructor of the enum
    Laptop(){
        price=500;
    }
    //making the parametrised constructor of the enum
    Laptop(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
}

public class program4 {
    public static void main(String[] args) {
        System.out.println("Show fof particular");
        Laptop lap = Laptop.macbook;
        System.out.println(lap+" : "+lap.getPrice());
        System.out.println("Now , showing for all");
        for(Laptop l  : Laptop.values()){
            System.out.println( l+" : "+l.getPrice());
        }
    }
}
//Output
//Show fof particular
//macbook : 10000
//Now , showing for all
//macbook : 10000
//xps : 4000
//surface : 2000
//thinkpad : 500 // this due to the default constructor
