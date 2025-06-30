/*
* Date : 30/06/2025
* Topic : Method Overriding in Class
* Also to call the parent class method
* */



class Shape{
    void draw(){

        System.out.println("Cannot say shape type");
    }
}

class Square extends Shape{

    void draw(){
        super.draw();
        System.out.println("This is square type");
    }
}

class program1{
    public static void main(String[] args) {
        Shape r = new Square();
        r.draw();
    }
}