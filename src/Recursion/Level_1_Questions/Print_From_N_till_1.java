package Recursion.Level_1_Questions;

public class Print_From_N_till_1 {
    public static void main(String[] args) {
        int N = 10;
        print(N);
    }
    static void print(int n){
        // base case
        if(n == 0){
            return;
        }
        // function body
        System.out.println(n);
        // recursive call
        // Note : here we are not returning the recursive call because the return type of the function is void.
        print(n-1);
    }
}
