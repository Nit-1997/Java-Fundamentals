package Recursion;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubsets {

    public static void generateSubsets(int index,int[] nums,List<Integer> currentSubset, List<List<Integer>> output){
//        output.add(new ArrayList<>(currentSubset));
//        for(int i=index;i<nums.length;i++){
//            currentSubset.add(nums[i]);
//            generateSubsets(i+1,nums,currentSubset,output);
//            currentSubset.remove(currentSubset.size()-1);
//        }

        //base case


        generateSubsets(index+1,nums,new ArrayList<>(),output);
    }
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> output = new ArrayList<>();
        generateSubsets(0,nums,new ArrayList<>(),output);
        return output;
    }

    public static void main(String args[]){
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}
