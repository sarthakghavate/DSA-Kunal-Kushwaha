import java.util.Arrays;
public class MostFreqEvenElem {
    static boolean binarySearch(int[] nums,int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static int findMaxK(int[] nums) {

        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0){
                int searchKey = nums[i] * -1;
                if(binarySearch(nums,searchKey)){
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {-10,8,6,7,-2,-3};
        Arrays.sort(nums);
        System.out.println(findMaxK(nums));
    }
}