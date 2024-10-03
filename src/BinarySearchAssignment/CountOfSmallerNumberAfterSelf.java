package BinarySearchAssignment;

import java.util.ArrayList;
import java.util.Arrays;

//
public class CountOfSmallerNumberAfterSelf {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int [] arr = {5,2,6,1};
        for(int i=0;i<arr.length;i++){
           list.add(binarySearch(arr,arr[i],i));
        }
        System.out.println(list);
    }
    static int binarySearch(int[]arr,int target,int start){
        Arrays.sort(arr);
        //int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end - start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if (target>arr[mid]){
                //count++;
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1; //element not found so return -1;
    }
}
