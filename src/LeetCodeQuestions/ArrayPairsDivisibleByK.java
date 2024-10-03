package LeetCodeQuestions;
public class ArrayPairsDivisibleByK {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        int [] arr = {-2,2,-6,-8,4,-2,5,6,93,6,-6,8,5,0,-5,6,99,95,2,-5};
        boolean [] paired = new boolean[arr.length];
        int k = 99;
        int cnt = 0;
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i != j && (arr[i] + arr[j])%k == 0 && paired[i] == false && paired[j] == false){
                    cnt++;
                    arr[i] = 0;
                    paired[i] = true;
                    arr[j] = 0;
                    paired[j] = true;
                    break;
                }
            }
        }
//        return cnt;
        System.out.println(arr.length);
        System.out.println(cnt);
        System.out.println(cnt == arr.length/2);
    }

}
