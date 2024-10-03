public class test {
    public static void main(String[] args){
        int l = -97;
        int r = 50;

        double a = Math.pow(10,9);
        System.out.println(a);

        System.out.println(sumOfPrimes(l,r)); //-50
    }

    private static int sumOfPrimes(int l, int r) {
        int smallestPrime = Integer.MIN_VALUE;
        int largestPrime = Integer.MIN_VALUE;
        for(int i = l; i <= r; i++){
            if(isPrime(i)){
                if(smallestPrime == Integer.MIN_VALUE){
                    smallestPrime = i;
                }
                largestPrime = i;
            }
        }
        if(smallestPrime == Integer.MIN_VALUE){
            return 0;
        }
        return smallestPrime + largestPrime;
    }

    private static boolean isPrime(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num <= 1){
            return false;
        }

        for(int i = 2; i*i <= num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}


