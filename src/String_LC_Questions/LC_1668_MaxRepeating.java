package String_LC_Questions;

public class LC_1668_MaxRepeating {
    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        System.out.println(maxRepeating(sequence,word));

    }
    public static int maxRepeating(String sequence, String word) {
        StringBuilder sb = new StringBuilder(word);
        int count = 0;
        while( sequence.indexOf(sb.toString()) != -1 ){
            count++;
            sb.append(word);
        }
        return count;
    }
}
