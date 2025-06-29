/*
* Program Date 29/06/25
* program for testing this keyword
* */

class program1{
    int i;
    void setVal(int i){
        this.i=i;
    }
    void show(){
        System.out.println("The value of i="+i);
    }

    public static void main(String[] args) {
        program1 obj =new program1();
        obj.setVal(100);
        obj.show();
    }
}

/*test and output:
* The value of i=100
* */