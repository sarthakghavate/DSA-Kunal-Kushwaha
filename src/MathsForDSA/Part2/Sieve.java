package MathsForDSA.Part2;
// space complexity : Auxiliary space is O(n)
// Time complexity : n / 2 + n/3 + n/5 + n/7 + .... n/p    => p = highest prime no less than n
//  n *( 1/2 + 1/3 + 1/5 + 1/7 + .. +1/p )  => harmonic progression for primes    == log(log(n))
// TC : O(N * log(log(N)))  

public class Sieve {
    public static void main(String[] args) {
        int n = 2;
        boolean [] primes = new boolean[n+1];
        sieve(n,primes);
    }
    private static void sieve(int n , boolean [] primes){
        // initially boolean array is false , like int array is 0
        // false in array means number is prime
        // true means not prime

        for (int i = 2 ; i*i <= n ; i++) {     // same logic (repetition after a point sqrt) that is why 2 to sqrt n
            if(!primes[i]){                    // if primes[i] == false
                for (int j = 2*i; j <= n ; j+=i) {  // j started from 2*i because we are setting multiples of 1 to true and j+= i to increment by factor
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
