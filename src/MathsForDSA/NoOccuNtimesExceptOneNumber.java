package MathsForDSA;

import java.util.Arrays;

// Que : You are given an array in which every element appears 3 times except 1 element , find out that element.
// given range of elements -128 to 127
public class NoOccuNtimesExceptOneNumber {
    public static void main(String[] args) {
      int [] arr = {5,6,3,6,3,5,6,4,3,5};
        System.out.println(notOcc3times(arr));
    }
    static int notOcc3times(int [] arr){
        int [] count = new int [8];
        for(int n : arr){
            String binary = Integer.toBinaryString(n);
            System.out.println( n + " to binary is : "+binary);
            for(int i = 0 ; i< binary.length();i++){
                if(binary.charAt(i) == '1'){
                    count[8-binary.length()+i]++;
                }
            }
        }
        System.out.println(Arrays.toString(count));
        int ans = 0;
        for(int i = 7; i>=0 ; i--){
            int rem = count[i]%3 ;
            if(rem != 0){
               // ans = ans + Math.pow(2,rem);
            }
        }
        return 0;
    }
}
