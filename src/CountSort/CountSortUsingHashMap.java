package CountSort;

import java.util.Arrays;
import java.util.HashMap;

public class CountSortUsingHashMap {
    public static void countSort(int [] arr){
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
        // create hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int el : arr){
            map.put(el,map.getOrDefault(el,0)+1);
        }

        // modify original array.
        int index = 0;
        for(int i = 0; i <= max ; i++){
            if(map.containsKey(i)){
                int freq = map.get(i);
                while (freq > 0){
                    arr[index] = i;
                    index++;
                    freq--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {6, 3, 10, 9, 2, 4, 9, 7};
        System.out.println("Before sorting : "+ Arrays.toString(arr));
        countSort(arr);
        System.out.println("After sorting : "+Arrays.toString(arr));
    }
}
