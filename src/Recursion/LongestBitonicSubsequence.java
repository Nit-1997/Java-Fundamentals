package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class LongestBitonicSubsequence {

    public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> nums){
        if(nums.size() == 0){
           ArrayList<ArrayList<Integer>> baseArray = new ArrayList<ArrayList<Integer>>();
           return baseArray;
        }
        int firstIndex = nums.get(0);
        nums.remove(0);
        ArrayList<ArrayList<Integer>> smallAns = getSubsets(nums);
        ArrayList<ArrayList<Integer>> mainAns = new ArrayList<>();
        if(smallAns.size() == 0){
            ArrayList<Integer> firstArray = new ArrayList<>(1);
            firstArray.add(firstIndex);
            mainAns.add(firstArray);
        }else{
            for(ArrayList<Integer> innerList : smallAns){
               mainAns.add((ArrayList<Integer>) innerList.clone());
            }
            for(ArrayList<Integer> innerList : mainAns){
                innerList.add(0,firstIndex);
            }
            for(ArrayList<Integer> innerList : smallAns){
                mainAns.add((ArrayList<Integer>) innerList.clone());
            }
            ArrayList<Integer> firstArray = new ArrayList<>(1);
            firstArray.add(firstIndex);
            mainAns.add(firstArray);

        }
        return mainAns;
    }

//    public static Boolean isSubsetBitonic(ArrayList<Integer> nums) {
//        int start = nums.get(0);
//        int end = nums.get(nums.size()-1);
//        while(end > start){
//
//        }
//    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(getSubsets(arr));


    }


}
