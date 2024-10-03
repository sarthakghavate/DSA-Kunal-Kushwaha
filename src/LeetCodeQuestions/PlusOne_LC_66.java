package LeetCodeQuestions;
// https://leetcode.com/problems/plus-one/
import java.util.Arrays;

public class PlusOne_LC_66 {
    public static void main(String[] args) {
        int [] digits = {8,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {

        int n = digits.length;
        // check if last digit is 9 , if no then just add 1 to it ad return digits
        if (digits[n - 1] != 9) {
            digits[n - 1] += 1;
            return digits;
        }

        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        // if there is still a carry , make res of n+1 and carry to 0th index and rest set 0
        if (carry > 0) {
            int[] res = new int[n + 1];
            res[0] = carry;
            for (int k = 1; k < digits.length; k++) {
                res[k] = 0;
            }
            return res;
        }

        return digits;
    }
}