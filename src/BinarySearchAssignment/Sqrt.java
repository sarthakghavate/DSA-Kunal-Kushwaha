package BinarySearchAssignment;

public class Sqrt {
    public static void main(String[] args) {
        int x=2147395599;
        System.out.println(findSqrt(x));
    }
    static int findSqrt(int x){
        if(x==0){
            return 0;
        }
        int start = 1;
        int end = x;
        int ans =0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(x/mid == mid){
                return mid;
            }
            else if(mid>x/mid){
                end = mid-1;
            }
            else {
                start=mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
/*
class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int low = 1,high = x,ans =0;
        while(low<=high){
            int mid =low + (high-low)/2;
            if(x/mid==mid)  return mid;
            else if(x/mid<mid)   high=mid-1;
            else {low = mid+1; ans = mid;}
        }
        return ans;
    }
}
 */