package LeetCodeQuestions;

public class LexicographicallySmallestStringAfterOps {
    public static void main(String[] args) {
        String s = "leetcode";
        s = smallestString(s);
        System.out.println(s);
    }
    public static String smallestString(String s) {
        int start = 0;
        while(start < s.length() && s.charAt(start) == 'a'){
            start++;
        }
        // check if start is at last index
        if(start >= s.length()-1){
            // just reverse the last
            return s.substring(0,s.length()-1) + operation(s.length()-1,s.length(),s);
        }

        int end = start + 1;
        while (end < s.length() && s.charAt(end) != 'a'){
            end++;
        }

        if(end < s.length()){
            return s.substring(0,start)+operation(start,end,s) + s.substring(end);
        }
        return s.substring(0,start)+operation(start,end,s);
    }

    private static String operation(int start, int end, String s){
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < end; i++){
            if(s.charAt(i) == 'a'){
                sb.append('z');
            }
            else{
                sb.append((char)(s.charAt(i)-1));
            }
        }
        return sb.toString();
    }
}
