package Recursion.SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        int n = arr.length;
        System.out.println("Before Sorting : "+ Arrays.toString(arr));
        selectionSortUsingRecursion(arr,n,0,0);
        System.out.println("After Selection Sorting : "+Arrays.toString(arr));
    }

    private static void selectionSortUsingRecursion(int[] arr, int r, int c,int maxIdx) {
        // base case
        if(r == 0){
            return;
        }

        if(r > c){
            if(arr[c] > arr[maxIdx]){
                maxIdx = c;
            }
            selectionSortUsingRecursion(arr,r,c+1,maxIdx);
        }
        else{
            // swap arr[maxIdx] and arr[r-1]
            int temp = arr[r-1];
            arr[r-1] = arr[maxIdx];
            arr[maxIdx] = temp;
            selectionSortUsingRecursion(arr,r-1,0,0);
        }
    }
}
