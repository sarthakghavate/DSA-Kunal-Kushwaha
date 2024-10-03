package Recursion.Level_1_Questions;

public class Q7_Reverse_A_Number {

    static int sum = 0;
    static void reverse1(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n/10);
    }

    static int reverse2(int n){
        // sometimes you might need some additional variables in the argument, in that case
        // make another function. (helper function)
        int no_of_digit = (int)(Math.log10(n) + 1);
        return helper(n,no_of_digit);
    }
    private static int helper(int n , int digits){
        if(n%10 == 0){
            return n;
        }
        int rem = n%10;
        return rem * (int) (Math.pow(10,digits-1)) + helper( n/10 , digits - 1);
    }
    public static void main(String[] args) {
//        reverse1(1824);
//        System.out.println(sum); // sum == 4281

        int ans = reverse2(1824);
        System.out.println(ans); // ans == 4281
    }
}
