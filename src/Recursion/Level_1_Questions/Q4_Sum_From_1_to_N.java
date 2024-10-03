package Recursion.Level_1_Questions;

public class Q4_Sum_From_1_to_N {
    public static void main(String[] args) {
        // Let n = 4
        // -> sum till 4 = 4 + sum till 3
        //               = 4 + 3 + sum till 2
        // can you see the recursion ?
        // Yes !!
        // sum (n) = n + sum(n-1)
        // And what about the base case ?
        // sum till 1 is 1 itself so if(n<=1)return 1 ; will be our base case
        int ans = sum(-5);
        System.out.println(ans);
    }
    static int sum(int n){
        // base case
        if(n <= 1){
            return 1;
        }
        // body and recursion
        return n + sum(n-1);
    }
}
