package Recursion.Recursion_Subset_Subsequences_String_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6_SubsetDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,2,2};
        List<List<Integer>> list = subsetDuplicate(arr);
        for(List<Integer> ls : list){
            System.out.println(ls);
        }
    }

    private static List<List<Integer>> subsetDuplicate(int [] arr){
        // sort the array
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        // using start and end pointer to keep track of form where to add in the outer list
        // if duplicate elements comes then add from end + 1
        // else add from start

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++){
            // if current and previous elements are same , s = e+1;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size()-1;

            int n = outer.size();
            for(int j = start; j < n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add((arr[i]));
                outer.add(internal);
            }
        }

        return outer;
    }

}
