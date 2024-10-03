package MathsForDSA;

public class EvenOrOddUsingBitWiseAND {
    public static void main(String[] args) {
        int n = 1234561;
        System.out.println(isOdd(n));
    }
    private static boolean isOdd(int n) {
        return (n & 1) == 1 ;
        // NOTE:
        // Bitwise AND(&) of any number with 1 is the number itself (digits does not change)
        // Bitwise AND(&) of any number with 0 is 0.
    }

}
