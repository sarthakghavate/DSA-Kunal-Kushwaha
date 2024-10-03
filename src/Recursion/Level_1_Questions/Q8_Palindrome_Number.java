package Recursion.Level_1_Questions;

public class Q8_Palindrome_Number {
    public static void main(String[] args) {
        int num = 1234321;
        int numRev = reverse(num);
        System.out.println(isPalindromeNumber(num,numRev));
    }
    public static int reverse(int n){
        int pow = (int)(Math.log10(n)+1);
        return helper(n,pow);
    }
    private static int helper(int n , int pow){
        // base case  -> if we are remaining with single digit number then no need to reverse, so we will return number
        // itself so that will be our base case
        if(n % 10 == 0){
            return n;
        }

        int rem = n%10;
        return rem * (int) Math.pow(10,pow-1) + helper(n/10,pow-1);
    }

    private static boolean isPalindromeNumber(int first , int second){
        return first == second;
    }
}
