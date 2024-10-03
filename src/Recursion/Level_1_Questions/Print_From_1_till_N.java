package Recursion.Level_1_Questions;

public class Print_From_1_till_N {
    public static void main(String[] args) {
        int n = 4;
        print(n);
//        printBoth(n);
    }
    static void print(int n){
        if(n == 0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    static void printBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
}
