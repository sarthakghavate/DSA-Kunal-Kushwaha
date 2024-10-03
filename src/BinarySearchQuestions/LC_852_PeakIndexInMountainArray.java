package BinarySearchQuestions;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class LC_852_PeakIndexInMountainArray {
    public static void main(String[] args) {
        int [] arr ={1,2,3};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start) / 2;
            if(arr[mid]>arr[mid+1]){
               // we are in descending part of the array
                //this may be the ans but look in left
                end = mid;
            }
            else{
                // we are in ascending part of the array
                start = mid+1; // mid+1 because we know mid+1 element > mid element
            }
            // in the end , start == end and pointing to the largest element because of the 2 checks.
            //start and end are always trying to find max element in above 2 checks,
            //hence when they are pointing to just 1 element ,that is the max one because that is what the check says
        }
        return start; // or end bcz both will be same (point at maximum element)
    }
}
