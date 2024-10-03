package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr ={-18,-10,-4,0,1,2,3,4,5,6,7,9,34,67,89,99};
        int target = 89 ;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            //find the middle element
            //int mid = (start+end)/2;    //might be possible (start+end) exceed the range of integer
            int mid = start +(end - start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                // answer found
                return mid;
            }
        }
        return -1; //element not found so return -1;
    }
}
