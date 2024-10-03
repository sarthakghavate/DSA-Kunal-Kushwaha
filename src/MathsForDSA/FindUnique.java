package MathsForDSA;

public class FindUnique {
    public static void main(String[] args) {
        int [] arr = {2,3,3,5,7,5,6,4,2,6,4};
        int res = uniqueEle(arr);
        System.out.println(res);
    }
    private static int uniqueEle(int [] arr){
        int unique = 0;
        for(int num : arr){            // XOR method gives answer in O(N) TC.
            unique = unique ^ num;     // NOTE: Order does not matter , answer will be the same. 
        }
        return unique;
    }
}
