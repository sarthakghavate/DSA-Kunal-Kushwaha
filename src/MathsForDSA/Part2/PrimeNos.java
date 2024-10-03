package MathsForDSA.Part2;

public class PrimeNos {
    public static void main(String[] args) {
        System.out.println(isPrime(93));
    }
    private static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2 ; i*i <= n ; i++){     // i <= Math.sqrt(n)   , square both sides => i^2 <= n
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
