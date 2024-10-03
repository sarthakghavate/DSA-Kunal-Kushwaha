package Recursion.SortingAlgorithms;
/* there is a lot of similarity in triangle1 pattern and bubble sort
    pattern :
    * * * *
    * * *
    * *
    *
 */

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        int n = arr.length;
        System.out.println("Before Sorting : "+Arrays.toString(arr));

        bubbleSortUsingRecursion(arr,n-1,0);
        System.out.println("After Bubble Sorting : "+Arrays.toString(arr));
    }

    private static void bubbleSortUsingRecursion(int [] arr, int r, int c){
        // base case
        if(r == 0){
            return;
        }
        if(r > c){
            // check if current element is greater than the next element
            if(arr[c] > arr[c+1]){
                // swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
                // recursive call
                bubbleSortUsingRecursion(arr,r,c+1);
            }
        }
        else{
            bubbleSortUsingRecursion(arr,r-1,0);
        }
    }
}
