package Recursion.Assignment_Easy;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};
        int start = 0;
        int end = s.length-1;
//        reverseString(s,start,end);
        System.out.println("Original : "+Arrays.toString(s));
        System.out.println("Reverse : "+Arrays.toString(reverseString(s,start,end)));
    }
    private static char [] reverseString(char [] s, int start, int end){
        if(start >= end){
            return s;
        }

        char temp = s[start];
        s[start]  = s[end];
        s[end] = temp;

        return reverseString(s,++start,--end);
    }
}
