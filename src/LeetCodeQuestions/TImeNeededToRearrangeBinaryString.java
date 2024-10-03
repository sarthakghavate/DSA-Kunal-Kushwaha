package LeetCodeQuestions;

public class TImeNeededToRearrangeBinaryString {
    public static void main(String[] args) {
        String s = "001011";
        // 010011
        // 010101
        System.out.println(secondsToRemoveOccurrences(s));
    }

    private static int secondsToRemoveOccurrences(String s) {
        char [] arr = s.toCharArray();
        int l = s.length();
        int i = 0,count = 0;

        while(i < l-1){
            while (arr[i] != '0' && arr[i+1] != '1'){
                i++;
            }
            if(arr[i] == '0' && arr[i+1] == '1'){
                // swap and inc count
                char temp = arr[i];
                arr[i]  = arr[i+1];
                arr[i+1] = temp;
                count++;
                if(i > 0){
                    i = i - 2;
                }
            }
            i++;
        }

        return count;

    }
}
