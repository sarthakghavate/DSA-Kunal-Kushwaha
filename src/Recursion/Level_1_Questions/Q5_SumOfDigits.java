package Recursion.Level_1_Questions;

public class Q5_SumOfDigits {
    public static void main(String[] args) {
        int ans = sumOfDigits1(1342);
        System.out.println(ans);
    }
    static int sumOfDigits(int n){
        // base case
        if(n == 0){
            return 0;
        }
        // body and recursion
        return (n%10) + sumOfDigits (n/10);
    }
    static int sumOfDigits1(int n){
        if(n == 0){
            return 0;
        }
        return n % 10 + sumOfDigits1(n/10);
    }
}
