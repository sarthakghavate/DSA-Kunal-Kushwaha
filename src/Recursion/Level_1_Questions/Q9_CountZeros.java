package Recursion.Level_1_Questions;

public class Q9_CountZeros {
    public static void main(String[] args) {
        int num = 230440;
        System.out.println(countZeros(num));
        System.out.println(countZeros2(num));
    }

    // Approach 1 : Using external counter
    static int counter = 0;
    static int countZeros(int n){
        // find rem check if its 0 or not if yes increment counter
        // and reduce number by n/10
        if(n == 0){
            return counter;
        }
        int rem = n % 10;
        if(rem == 0){
            counter++;
        }
        return countZeros(n/10);
    }

    // Approach 2 : Passing count as argument

    static int countZeros2(int n){
        return helper(n,0);
    }
    // special pattern , how to pass a value to above calls
    private static int helper(int n , int c){
        // base case
        // if number reduces to single digit then return the count of zeros.
        if(n / 10 == 0){
            return c;
        }
        int rem = n % 10;
        if(rem == 0){
            return helper(n/10,c+1);
        }
        else{
            return helper(n/10,c);
        }
    }
}
