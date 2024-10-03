package Recursion.SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] nums = {8,4,5,1,6,3};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int [] nums, int low, int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = nums[m];

        // swapping condition
        while(s <= e){
            // also a reason why if its already sorted it won't swap
            while (nums[s] < pivot){
                s++;
            }
            while (nums[e] > pivot){
                e--;
            }
            // now we are at violation
            // swap
            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // now my pivot is at correct index, please sort two halves now
        sort(nums,low,e);
        sort(nums,s,high);
    }
}
