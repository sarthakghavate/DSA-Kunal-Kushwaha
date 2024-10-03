package LeetCodeQuestions;
// https://leetcode.com/problems/string-to-integer-atoi/description/
public class StringToInteger {
    public static void main(String[] args) {
       String s = "9223372036854775808";
       int ans = myAtoi(s);
       System.out.println(ans);
    }
    public static int myAtoi(String s) {
        // dealing with null string
        if(s == null){
            return 0;
        }
        // dealing with leading whitespaces.
        s = s.trim();

        // initializations
        long ans = 0;
        long sign = 1;
        long MAX = Integer.MAX_VALUE;
        long MIN = Integer.MIN_VALUE;

        // set sign to -1 if number is negative
        if(s.length() > 0 && s.charAt(0) == '-'){
            sign = -1;
        }

        for(int i = 0; i < s.length(); i++){
            // if number exceeds ,break.
            if(ans > MAX){
                break;
            }
            // if number is negative skip first character i.e '-'
            if(i == 0 && (s.charAt(0) == '-' || s.charAt(0) == '+')){
                continue;
            }
            char ch = s.charAt(i);
            // if ch is not a digit break.
            if(ch - '0' < 0 || ch - '0' > 9){
                break;
            }
            else{
                ans = ans*10 + (ch -'0'); // making number
            }
        }

        // handling sign (+/-)
        ans = ans*sign;

        // rounding
        if(ans < MIN){
            return Integer.MIN_VALUE;
        }
        if(ans > MAX){
            return Integer.MAX_VALUE;
        }
        // typecast
        return (int)ans;
    }

}
