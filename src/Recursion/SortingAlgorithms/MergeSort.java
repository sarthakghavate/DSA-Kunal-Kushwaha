package Recursion.SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {8,3,4,12,5,6};
        mergeSort(arr);
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    private static int [] mergeSort(int [] arr){

        // base case
        if(arr.length == 1){
            return  arr;
        }
        int mid = arr.length / 2;

        int [] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);

    }
    private static int [] merge(int [] first, int [] second){
        int [] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the arrays is not complete.
        // copy the remaining elements
        while(j < second.length){
            mix[k] = second[j];
            k++;
            j++;
        }

        while (i < first.length) {
            mix[k] = first[i];
            k++;
            i++;
        }

        return mix;
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
