package BinarySearchQuestions;

public class NoOfRotations {
    public static void main(String[] args) {
        int [] arr ={5,6,7,1,2,3};
        System.out.println(countRotations(arr));
    }
    static int countRotations(int []arr){
        int pivot = findPivotWithDuplicates(arr);
        return pivot+1;
    }
    static int findPivotWithDuplicates(int []arr){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            // 4 cases
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            //if elements at start,end,middle are equal just skip the duplicate
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates
                //NOTE: what if the elements at start and end were the pivot??
                //check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //check if end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // left side is sorted , so pivot should be in right
            else if(arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

}
