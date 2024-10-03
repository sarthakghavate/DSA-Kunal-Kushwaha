package LeetCodeQuestions;

import java.util.HashMap;

/*

https://leetcode.com/problems/make-sum-divisible-by-p/description/?envType=daily-question&envId=2024-10-03

Given an array of positive integers nums, remove the smallest subarray (possibly empty) such
that the sum of the remaining elements is divisible by p. It is not allowed to remove the whole array.
Return the length of the smallest subarray that you need to remove, or -1 if it's impossible.

Input: nums = [3,1,4,2], p = 6
Output: 1
Explanation: The sum of the elements in nums is 10, which is not divisible by 6.
We can remove the subarray [4], and the sum of the remaining elements is 6,
which is divisible by 6.

TOPICS : Array, HashTable, Prefix Sum.
 */
public class MakeSumDivisibleByP {
    public static void main(String[] args) {
        // prefix sum
        int [] nums = {1000000000,1000000000,1000000000};
        int p = 3;
        System.out.println(makeSumDivisibleByP(nums,p));
    }

    private static int makeSumDivisibleByP(int [] nums, int p){
        int min = Integer.MAX_VALUE;

        int rem = 0;
        for(int i : nums){
            rem = (rem + i) % p;
        }

        if(rem == 0){
            return 0;
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1); // sum , index
        int currRem = 0;
        for(int i = 0; i < nums.length; i++){
            currRem = (currRem + nums[i]) % p;
            int target = (currRem - rem + p) % p;
            if(map.containsKey(target)){
                min = Math.min(i - map.get(target),min);
            }
            map.put(currRem,i);
        }
        return min < nums.length ? min : -1;
    }
}
