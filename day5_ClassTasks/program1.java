/*
*Date : 2/7/2025
*
Program on the Labelled For Loop*/


class program1{
    public static void main(String[] args) {
        int i,j;
        A1:
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                System.out.print(j);
                if(j==3)
                    break A1;
            }
        }
    }
}
//output : 123
