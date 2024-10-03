package MathsForDSA;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;    // for binary b = 2 (base)  , for decimal b = 10,
        System.out.println(numberOfDigits(n,b));
    }
    private static int numberOfDigits(int n , int b){
        return (int)(Math.log(n) / Math.log(b)) + 1;     // log n = log n / log b    (log property)
                                                     //    b
    }
}
