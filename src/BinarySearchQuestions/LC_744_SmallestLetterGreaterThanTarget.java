package BinarySearchQuestions;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class LC_744_SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char [] letters = {'c','f','j'};
        char target = 'c';  //ans = 'f'
        char ch = nextGreatestLetter(letters,target);
        System.out.println(ch);
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<letters[mid]){
                end=mid-1;

            }
            else{
                start=mid+1;
            }

        }
        return letters[start % letters.length];
    }
}
