/*
* Date 29/06/2025
* Program to use this keyword as an argument to the method call
* */

class ThisDemo1{
    void m1(ThisDemo1 obj){
        System.out.println("in m1 method");
    }
    void m2(){
        m1(this);
    }
}

class program4{
    public static void main(String[] args) {
        ThisDemo1 td = new ThisDemo1();
        td.m2();
    }
}

//outputs:
//in m1 method