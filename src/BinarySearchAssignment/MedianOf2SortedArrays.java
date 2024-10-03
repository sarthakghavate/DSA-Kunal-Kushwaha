package BinarySearchAssignment;

import java.util.Arrays;

// https://leetcode.com/problems/median-of-two-sorted-arrays/description/
public class MedianOf2SortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
        //op : 2.00000
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums1.length) {
                nums[i] = nums1[i];
            } else {
                nums[i] = nums2[j];
                j++;
            }
        }
        Arrays.sort(nums);
        return binarySearch(nums);
        //return 0;
    }

    static double binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        double ans =0;
        if (arr.length % 2 == 0) {
            ans = ((double) arr[mid] + arr[mid + 1]) / 2;
        }
        else {
            ans = arr[mid];
        }
        return ans;
    }
}