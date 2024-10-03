package CountSort;

import java.util.Arrays;

public class CountSortUsingArray {
    static void countSort(int [] arr){
        // check
        if(arr == null || arr.length <= 1){
            return;
        }
        // find max
        int max = Integer.MIN_VALUE;
        for(int el : arr){
            if(el > max){
                max = el;
            }
        }
        // create new array of size max+1
        int [] freq = new int[max+1];
        for(int el : arr){
            freq[el]++;
        }

        // put elements according to freq in arr itself
        int index = 0;
        for(int i = 0; i < freq.length; i++){
            while(freq[i] > 0){
                arr[index] = i;
                index++;
                freq[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {6, 3, 10, 9, 2, 4, 9, 7};
        System.out.println("Before sorting : "+Arrays.toString(arr));
        countSort(arr);
        System.out.println("After sorting : "+Arrays.toString(arr));
    }
}
