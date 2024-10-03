package Recursion.Recursion_Patterns;

public class Pattern1 {
    public static void main(String[] args) {
//        triangle(4,0);
        triangle2(3,0);
    }

    static void triangle(int r , int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("* ");
            triangle(r,c+1);
        }else{
            System.out.println();
            triangle(r-1,0);
        }
    }
    /*
           0 1 2 3 4
           *               r=4     c = 0
           * *               3
           * * *             2
           * * * *           1
     */
    static void triangle2(int r , int c){
        if(r == 0){
            return;
        }
        if(c < r){
            triangle2(r,c+1);
            System.out.print("* ");
        }else{
            triangle2(r-1,0);
            System.out.println();

        }
    }
}
