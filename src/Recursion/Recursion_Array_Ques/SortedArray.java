package Recursion.Recursion_Array_Ques;
// Check if given array is sorted or not
public class SortedArray {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,8,9,11,12,24,56,90,78};
//        System.out.println(isSorted(arr));
        System.out.println(sorted(arr));
    }

    // My Approach :
//    static boolean isSorted(int [] arr){
//        return  helper(arr,0,1);
//    }
//    private static boolean helper(int [] arr , int s , int e){
//
//        if(arr[s] > arr[e]){
//            return false;
//        }
//        if(s == arr.length - 2){
//            return true;
//        }
//        return helper(arr,s+1 , e+1);
//    }

    // Kunal's Approach
    static boolean sorted(int [] arr){
        return helper2(arr,0);
    }
    private static boolean helper2(int [] arr , int idx){
        // base condition : if index reaches to last index then return true
        if(idx == arr.length-1){
            return true;
        }
        return arr[idx]  < arr[idx+1] && helper2(arr,idx+1);
    }
}
