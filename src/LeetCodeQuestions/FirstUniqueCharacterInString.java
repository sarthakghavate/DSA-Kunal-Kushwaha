package LeetCodeQuestions;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(firstUniqChar(s));
    }
    static int firstUniqChar(String s){
        int [] freq = new int [26];
        char [] chars = s.toCharArray();
        for(char ch : chars){
            freq[ch - 'a']++;
        }
        for(int i = 0; i < chars.length; i++){
            if(freq[chars[i] - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
