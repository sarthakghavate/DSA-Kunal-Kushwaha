package BinarySearchQuestions;

public class LC_33_RotatedBinarySearch {
    public static void main(String[] args) {
        //int [] arr = {4,5,6,7,0,1,2};
        //System.out.println(findPivot(arr));
    }
    static int search(int []arr,int target){
        int pivot = findPivot(arr);
        //if pivot = -1 , means array is not rotated so apply simple binary search
        if(pivot==-1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        //if pivot is found ,you have found 2 asc sorted array
        //now 3 cases
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }else{
            return binarySearch(arr,target,pivot+1,arr.length-1);
        }
    }
    static int binarySearch(int[]arr,int target,int start,int end){
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
    static int findPivot(int []arr){
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
            if(arr[start]>=arr[mid]){
                end = mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
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
