package Recursion.Introduction;

public class FibonacciSeries {
    // 0th 1st 2nd 3rd 4th 5th 6th 7th 8th .....
    // 0    1   1   2   3   5   8  13   21 .....
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    static int fibo(int n) {
        if(n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
