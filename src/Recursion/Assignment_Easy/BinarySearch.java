package Recursion.Assignment_Easy;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1, 4, 3, -5, -4, 8, 6};
        int target = -4;
        int start = 0;
        int end = arr.length-1;

        System.out.println(binarySearch(arr,target,start,end));
    }
    private static int binarySearch(int [] nums, int target, int start , int end){
        // find mid
        int mid = start + (end - start)/2;
        // base case : if no element found return -1.
        if(start > end){
            return -1;
        }
        // 3 cases of binary search
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] > target){
            return binarySearch(nums,target,start,mid-1);
        }
        else{
            return binarySearch(nums,target,mid+1,end);
        }
    }
}
