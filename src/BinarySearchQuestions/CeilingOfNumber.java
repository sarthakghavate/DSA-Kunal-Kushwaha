package BinarySearchQuestions;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceilingOfNumber(arr,target);
        //int ans = findCeil(arr,arr.length,target);
        System.out.println(ans);
    }
    static int ceilingOfNumber(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if(target>arr[arr.length-1]){
            return -1;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }

        }
        return start;
    }
    static int findCeil(int arr[], int n, int x)
    {
        int start = 0;
        int end = n-1;
        int ans = -1;
        while(start<= end){
            int mid = start +(end - start)/2;
            if(arr[mid] >= x){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
}
