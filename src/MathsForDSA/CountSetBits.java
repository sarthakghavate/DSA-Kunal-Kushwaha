package MathsForDSA;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(countSetBits(n));
        System.out.println(countSetBitsMethod2(n));

    }
    private static int countSetBits(int n){
        int count = 0;
        while( n > 0){
            count++;
            n = n - (n & (-n));
        }
        return count;
    }
    private static int countSetBitsMethod2(int n){
        int count = 0;
        while( n > 0){
            count++;
            System.out.println(count);
            n = n & (n-1);
            System.out.println(n);
        }
        return count;
    }
}
