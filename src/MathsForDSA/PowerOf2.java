package MathsForDSA;

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(isPowerOfTwo1(n));
        System.out.println(isPowerOfTwo2(n));
    }
    private static boolean isPowerOfTwo1(int n){
        // here we used  &  and >>(right shift)
        int count = 0;
        while(n > 0){
            int last = n & 1;
            n = n >> 1;
            if(last == 1){
                count++;
            }
        }
        return count == 1 ;
    }
    private static boolean isPowerOfTwo2(int n){
        if(n == 0){        // n == 0 is special case here
            return false;
        }
        int res = n & (n-1);
        return res == 0;
    }
}
