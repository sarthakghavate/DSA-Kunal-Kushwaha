package Recursion.Assignment_Easy;
// https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
public class MaxAndMinInArray {
    public static void main(String[] args) {
        int [] arr = {1, 4, 3, -5, -4, 8, 6};
        int min = minInArray(arr,arr[0],1);
        System.out.println(min);

        int max = maxInArray(arr,arr[0],1);
        System.out.println(max);
    }

    private static int maxInArray(int[] arr, int max, int index) {
        if(index >= arr.length ){
            return max;
        }
        if(arr[index] > max){
            return maxInArray(arr,arr[index],++index);
        }
        else{
            return maxInArray(arr,max,++index);
        }
    }

    private static int minInArray(int [] arr , int min, int index){
        // base case
        if(index >= arr.length){
            return min;
        }
        if(arr[index] < min){
            return minInArray(arr,arr[index],++index);
        }
        else{
            return minInArray(arr,min,++index);
        }
    }
}
