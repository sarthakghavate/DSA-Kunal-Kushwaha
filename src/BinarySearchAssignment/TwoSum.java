package BinarySearchAssignment;
import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,3,4};
        int target=6;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] arr, int target) {
            int start = 0;
            int end = arr.length-1;
            int [] ans = {0,0};
            while(start<=end){
                int mid = start+(end-start)/2;
                if(arr[mid-1]+arr[mid+1]==target){
                    ans[0] = mid ;
                    ans[1] = mid+2;
                    return ans;
                }
                if(mid<end && arr[mid]+arr[mid+1]==target){
                    ans[0] = mid +1;
                    ans[1] = mid+2;
                    return ans;
                }
                else if(mid>start && arr[mid]+arr[mid-1]==target){
                    ans[0] = mid;
                    ans[1] = mid+1;
                    return ans;
                }
                else if(arr[start] + arr[mid] > target){
                    end = mid-1;
                }
                // else if(arr[start] + arr[mid] <= target){
                //     start=mid;
                // }
                else{
                    start=mid;
                }
            }
            return ans;
        }

    }
