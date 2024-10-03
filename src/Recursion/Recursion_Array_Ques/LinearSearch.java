package Recursion.Recursion_Array_Ques;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,3,1,7,1,145};
        int target = 1;
//        // we have assumed that min array length is 1.
//        System.out.println(search(arr,target,0));
//        // search from last
//        System.out.println(searchIndexFromLast(arr,target,arr.length-1));
//        // find all occurrences
//        findIdxOfAllOcc(arr,target,0);
//        System.out.println(list);
        // find all occurrences and return ArrayList
//        System.out.println(findAllOccAL(arr,target,0,new ArrayList<>()));

        // find all occurrences without passing al as an argument
        ArrayList<Integer> ans = findAllOccWithOutAL(arr,target,0);
        System.out.println(ans);
    }
    static boolean search(int [] arr , int target, int idx){
        // for each element check if it is equal to target or not

        // base case
        // if our index goes out of the bound then element not found
        if(idx == arr.length){
            return false;
        }
        return arr[idx] == target || search(arr,target,idx+1);   // OR because if element found it should return true in end
    }
    static int searchIndexFromLast(int [] arr , int target, int idx){
        // base case
        // if our index goes out of the bound then element not found
        if(idx == -1){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }
        return searchIndexFromLast(arr,target,idx-1);   // OR because if element found it should return true in end
    }

    // what if we have to find index of all the occurrences.
    // Create ArrayList whenever element equals target add the index into list.
    static ArrayList<Integer> list = new ArrayList<>();
    static void findIdxOfAllOcc(int [] arr,int target, int idx){
        // base case
        if(idx == arr.length){
            return;
        }
        if(arr[idx] == target){
            list.add(idx);
        }
        findIdxOfAllOcc(arr,target,idx+1);
    }


    // Return the ArrayList
    // 1) Passing list as an argument to the function
    static ArrayList<Integer> findAllOccAL(int [] arr , int target,int idx,ArrayList<Integer> list){
        if(idx == arr.length){
            return list;
        }
        if(arr[idx] == target){
            list.add(idx);
        }
        return findAllOccAL(arr,target,idx+1,list);
        /* How the list is working :
         We have created an object of ArrayList in main when we call this function. So whenever we call list all
         those list are reference variables of the same object in main. Because of all the reference variables
         pointing to the same object the same object is getting modified . So when we return the list it is
         returning the same modified object to all the recursive functions called before.
         This is ho w we are getting our final arraylist.
         */
    }

    // 2) Without passing list as an argument

    static ArrayList<Integer> findAllOccWithOutAL(int [] arr , int target, int idx){
        ArrayList<Integer> list = new ArrayList<>();
        if(idx == arr.length){
            // add check condition here
            return list;
        }
        // this will contain answer for that function call only
        if(arr[idx] == target){
            list.add(idx);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllOccWithOutAL(arr,target,idx+1); // stores ans list of each call in ansFromBelowCalls list
        list.addAll(ansFromBelowCalls); // add the list to the to be returned list
        return list; // return list to the above function call
    }

}
