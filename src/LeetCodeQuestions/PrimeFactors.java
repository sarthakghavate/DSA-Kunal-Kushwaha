package LeetCodeQuestions;

import java.util.ArrayList;

public class PrimeFactors {
    public static void main(String[] args) {
        int n = 36;
        System.out.println(primeFactors(n));

//        System.out.println(primeFactorsSum(n));
    }
    private static ArrayList<Integer> primeFactors(int n){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 2; i <= Math.sqrt(n); i++){
            while (n % i == 0){
                n = n / i;
                list.add(i);
            }
        }

        if(n > 2){
            list.add(n);
        }

        return list;
    }
    private static int  primeFactorsSum(int n){
        int sum = 0;
        while(n % 2 == 0){
            n /= 2;
            sum += 2;
        }

        for(int i = 3; i <= Math.sqrt(n); i+=2){
            while (n % i == 0){
                n /= i;
               sum += i;
            }
        }

        if(n > 2){
            sum += n;
        }
        return sum;
    }
}
