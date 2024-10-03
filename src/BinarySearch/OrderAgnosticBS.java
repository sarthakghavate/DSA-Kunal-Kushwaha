package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,88,99};
        int [] arr1 = {99,87,78,67,56,43,12,0};
        int target = 67;
        int ans = orderAgnosticBS(arr1,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
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
