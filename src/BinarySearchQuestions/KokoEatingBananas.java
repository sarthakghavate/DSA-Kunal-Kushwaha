package BinarySearchQuestions;

import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int [] piles = {805306368,805306368,805306368};
        int h = 1000000000;
        Arrays.sort(piles);
        // if(piles.lenght==1){

        // }
        int temp  = 0;
        int start = 1;
        int end = piles[piles.length-1];
        while(start<=end){
            int mid = start + (end - start)/2;
            int hours = noOfHours(piles,mid,h);
            if(hours <= h){
                temp = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        System.out.println(temp);
    }
    public static int noOfHours(int[]piles,int mid,int h){
        int hours = 0;
        for(int i=0;i<piles.length;i++) {
            if (piles[i] <= mid) {
                hours++;
            }
            else {
                int quotient = piles[i] / mid;
                int remainder = piles[i] % mid;
                if (remainder == 0) {
                    hours += quotient;
                } else {
                    hours = hours + quotient + 1;
                }
            }
            if(hours > h){
                break;
            }
        }
        return hours;

    }
}
