package StringAndStringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(); // it is mutable
        for (int i =0; i < 26; i++) {
            char ch = (char)('a'+i);
            //System.out.println(ch);
            builder.append(ch); // series += ch;
        }
        System.out.println(builder.toString());

        // Various StringBuilder methods:

        // builder.deleteCharAt(0);
        //System.out.println(builder);

        //builder.delete(0,3);     // [start , end)
        //System.out.println(builder);

        //builder.reverse();
        //System.out.println(builder);

    }
}
