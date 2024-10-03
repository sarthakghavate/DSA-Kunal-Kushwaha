package BinarySearchQuestions;

public class LC_1095_FindInMountainArray {
    public static void main(String[] args) {

    }
    public int ans(int []arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        else{
            //search in second half
            return orderAgnosticBS(arr,target,peak+1,arr.length-1);
        }
    }
    public int peakIndexInMountainArray(int[] arr) {
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
    static int orderAgnosticBS(int[]arr,int target,int start,int end){

        //Find whether the array is sorted in ascending or descending.
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end = mid-1;
                }
            } else{
                if(target>arr[mid]){
                    end = mid -1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
