package BinarySearchAssignment;

public class ArrangeCoins {
    public static void main(String[] args) {
        int n =1804289383;
        System.out.println(arrangeCoins(n));
    }
    static int arrangeCoins(int n) {
        int start = 1;
        int end = n;
        int ans=0;
        while(start<=end){
            int mid = start+(end-start)/2;
            long sum = ((long) mid * (mid+1))/2;
            if(sum == n){
                return mid;
            }
            if(sum < n){
                ans = mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;

    }
}
