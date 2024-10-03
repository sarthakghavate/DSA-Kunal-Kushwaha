package LeetCodeQuestions;

import java.util.*;

public class LargestDivisibleSubset {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(largestDivisibleSubset(arr));

    }
    public static List<Integer> largestDivisibleSubset(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i<arr.length-1;i++){
            for(int j = i+1 ; j< arr.length;j++){
                if(arr[i] % arr[j] == 0 || arr[j] % arr[i] == 0){
                    set.add(arr[i]);
                    set.add(arr[j]);
                }
            }
        }
        return new ArrayList<>(set);
    }
}
