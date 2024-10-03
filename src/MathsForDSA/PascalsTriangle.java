package MathsForDSA;
/*
    Pascal's Triangle
    1                       n = 1     sum = 1
    1  1                    n = 2     sum = 2
    1  2  1                 n = 3     sum = 4
    1  3  3  1              n = 4     sum = 8
    1  4  6  4  1           n = 5     sum = 16
    1  5  10  10  5  1      n = 6     sum = 32
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(nthRowSumInPascalsTriangle(n));
    }
    private static int nthRowSumInPascalsTriangle(int n){
        return  1 << (n-1);
    }
}
