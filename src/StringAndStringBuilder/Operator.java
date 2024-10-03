package StringAndStringBuilder;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a'+'b');        // 97+98 = 195
        System.out.println("a"+"b");        // ab
        System.out.println('a'+3);          // 100
        System.out.println((char)('a'+3));  //d

        System.out.println("a"+1);
        // this is same as after a few steps : "a" + "1"
        // integer will be converted to Integer (wrapper class) that will call toString().

        System.out.println("a" + new ArrayList<>());

        //System.out.println("a" + new Integer(56));

        //System.out.println( new ArrayList<>() + new Integer(56));
        // throws error
        //NOTE: (V.V.V.V IMP)
        // + operator works on primitive or at least one string should be there .

        //String ans = new ArrayList<>() + "" + new Integer(56);
        //System.out.println(ans);

    }
}
