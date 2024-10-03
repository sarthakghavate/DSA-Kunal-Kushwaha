package Recursion.Recursion_Array_Ques;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9,1,2,3};
        int target = 2;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int [] arr , int target , int s , int e){
        // edge case for element not found
        if(s > e){
            return -1;
        }

        int m = s + (e-s)/2;

        // case 0 : if middle element is equal to target just return it.
        if(arr[m] == target){
            return m;
        }

        // case 1 : First half is sorted
        if(arr[s] <= arr[m]){
            // 2 cases here : first if key lies in this half and second key doesn't lie in this half
            // lies
            if(target >= arr[s] && target <= arr[m]){
                // Update end
                return search(arr,target,s,m-1);
            }
            else{
                // Update start;
                return search(arr,target,m+1,e);
            }

        }

        // case 2 : If key lies in right half then check in right half
        if(target >= arr[m] && target <= arr[e]){
            // search in right half
            return search(arr,target,m+1,e);
        }

        //case 3 : Only possibility is target is now in left half so check in left half
        return search(arr,target,s,m-1);

    }
}
