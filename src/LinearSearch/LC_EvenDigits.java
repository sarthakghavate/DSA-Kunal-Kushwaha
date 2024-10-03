package LinearSearch;
//1295. https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class LC_EvenDigits {
    public static void main(String[] args) {
        int []  nums = {12,345,21,6,7896};
        //System.out.println(findNumbers(nums));
        System.out.println(digits2(-100));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static int digits (int num){

        if(num<0){            //for negative numbers
            num = num*-1;
        }
        if(num==0){          // if num = 0 then digit = 1;
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count ;
    }
    static int digits2(int num){
        if(num<0){
            num = num*-1;
        }
        return (int)(Math.log10(num)) + 1;
    }
    static boolean even (int num){
        int noOfDigits = digits(num);
        return noOfDigits%2==0;
    }
}
