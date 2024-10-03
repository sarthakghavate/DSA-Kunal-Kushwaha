package Recursion.SortingAlgorithms;

import java.util.Arrays;

public class MergeSortInplace {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSortInPlace(int [] arr, int s , int e){

        // base case
        if(e-s == 1){
            return;
        }
        int mid = s + (e-s) / 2;

        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);

        mergeInPlace(arr,s,mid,e);
    }
    private static void mergeInPlace(int [] arr, int s , int mid , int e){
        int [] mix = new int[e-s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the arrays is not complete.
        // copy the remaining elements
        while(j < e){
            mix[k] = arr[j];
            k++;
            j++;
        }

        while (i < mid) {
            mix[k] = arr[i];
            k++;
            i++;
        }

        // answer is in mix , copy that to original array.

        for(int l = 0; l < mix.length; l++){
            arr[s+l] = mix[l];
        }
    }
}
