import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
//        int [] weights = {1,2,3,1,1};
//        int days = 4;
//        System.out.println(shipWithinDays(weights,days));
        HashSet<Integer> set = new HashSet<>();
        System.out.println(set.add(3));
        System.out.println(set.add(3));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int start = weights[0];
        int end = 0;
        for(int num : weights){
            start = Math.max(start,num);
            end += num;
        }
        while(start < end){
            int mid = start + (end - start)/2;
            int sum =0;
            int pieces =1;

            for(int num : weights){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }
            if(pieces > days){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}