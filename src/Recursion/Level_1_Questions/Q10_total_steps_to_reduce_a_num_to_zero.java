package Recursion.Level_1_Questions;
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
/*
 Given : if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 */
public class Q10_total_steps_to_reduce_a_num_to_zero {
    public static void main(String[] args) {
        int num = 8;
        int ans = noOfStepsToReduceANumberToZero2(num,0);
        System.out.println(ans);
    }

    // Method 1 : using external counter.
    static int counter = 0;
    private static int noOfStepsToReduceANumberToZero(int num) {
        if(num == 0){
            return counter;
        }

        if(num % 2 == 0){
            counter++;
            return noOfStepsToReduceANumberToZero(num/2);
        }
        else{
            counter++;
            return noOfStepsToReduceANumberToZero(num-1);
        }
    }

    // passing counter as a parameter

    private static int noOfStepsToReduceANumberToZero2(int num, int cnt){
        if(num == 0){
            return cnt;
        }
        if(num % 2 == 0){
            return noOfStepsToReduceANumberToZero2(num/2,++cnt);
        }
        else{
            return noOfStepsToReduceANumberToZero2(num-1,++cnt);
        }
    }

}
