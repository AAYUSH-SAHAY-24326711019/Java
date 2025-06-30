/*
* Date : 30/06/2025
* Purpose: Program to show the use of the right and left
* shift operators
*
* Right-Shift : Does the Rt.To Lt. shift of bits.
* it is like the divide by 2 nature
*
* Left Shift: Does the Lt. to Rt. shift of bits
* it is like the multiply by 2 nature.
* */
public class program3 {
    public static void main(String[] args) {
            int x=10;
        System.out.println(x>>1);
        System.out.println(x<<1);
        System.out.println(x>>2);
        System.out.println(x<<2);
    }
}

//output
// 5
//20
//2
//40