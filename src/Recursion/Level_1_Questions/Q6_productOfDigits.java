package Recursion.Level_1_Questions;

public class Q6_productOfDigits {
    public static void main(String[] args) {
        int ans = productOfDigits(34);
        System.out.println(ans);
    }
    static int productOfDigits(int n){
        // base case
        if(n == 0){
            return 1;
        }
        return (n%10) * productOfDigits(n/10);
    }
}
