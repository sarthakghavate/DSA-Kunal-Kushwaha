package StringAndStringBuilder;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i =0; i < 26; i++) {
            char ch = (char)('a'+i);
            //System.out.println(ch);
            series = series + ch; // series += ch;
        }
        System.out.println(series);
        /* here the problem is we are using extra space for eg.
            after 1 st iteration:   series =  "" + 'a' = "a"
            after 2 nd iteration:   series = "a" + 'b' = "ab"
            after 3 rd iteration:   series = "ab" + 'c' = "abc"
            after 4 th iteration:   series = "abc" + 'd' = "abcd"
            .
            .
            after 25 th iteration:   series = "abcdefghijklmnopqrstvuwx" + 'y' = "abcdefghijklmnopqrstvuwxy"
            after 26 th iteration:   series = "abcdefghijklmnopqrstvuwxy" + 'z' = "abcdefghijklmnopqrstvuwxyz"

            all the string "a","ab","abc",abcd"...."abcdefghijklmnopqrstvuwxy"  , does not have any reference variable so
            that will go take  1+2+3+4+...N = O(N^2) extra space which is not good.

            what will be the solution then ??
            --> A new data type which will allow to add 2 strings without creating a new string object.
            example: series =  "" + 'a' = "a"
            here "a" is not a new string it is the "" (series) string in which character 'a' is added.
            This functionality is given by StingBuilder class
            so let us see in StringBuilderExample Class

        */
    }
}
