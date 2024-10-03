package Recursion.Assignment_Easy;
// https://www.geeksforgeeks.org/sum-triangle-from-array/
public class SumOfTriangle {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int s = 0;
        int e = arr.length;
        sumOfTriangle(arr,s,e);
    }
    private static void printArrayAndModify(int [] arr, int s, int e){
        // print
        for(int i = s; i < e; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // modify
        for(int i = s; i < e-1 ; i++){
            arr[i] = arr[i]+arr[i+1];
        }
    }
    public static void sumOfTriangle(int [] arr,int s, int e){
        if(e == 0){
            return;
        }
        printArrayAndModify(arr,s,e);
        sumOfTriangle(arr,s,e-1);
    }
}
