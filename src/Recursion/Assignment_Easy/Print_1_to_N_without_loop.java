package Recursion.Assignment_Easy;

public class Print_1_to_N_without_loop {
    public static void main(String[] args) {
        int n = 5;
        print1(n);
        System.out.println();
//        print2(n);
    }
    private static void print1(int n){
        // base case
        if(n == 0){
            return ;
        }
        print1(--n);
        System.out.print(n + " ");
    }
    private static void print2(int n){
        // base case
        if(n == 0){
            return ;
        }
        print2(n-1);
        System.out.print(n+" ");
    }
}
