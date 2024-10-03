package Recursion.Level_1_Questions;

public class Q3_Factorial {
    public static void main(String[] args) {
        int ans = factorial(-3);
        System.out.println(ans);
    }
    static int factorial(int n){
        // base case
        if(n <= 1){  // <= 1 because we are not considering negative numbers factorial so if we put n == 1 and ip as -3 then infinite calls will happen!!
            return 1;
        }
        // body and recursion
        return n * factorial(n-1);  // we have to return the function because return type of the factorial function is int.


    }
}
