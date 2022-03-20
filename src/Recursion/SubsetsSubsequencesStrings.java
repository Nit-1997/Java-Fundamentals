package Recursion;

import AbstractClasses.Parent;

import java.util.ArrayList;

public class SubsetsSubsequencesStrings {
   public static void main(String[] args) {
      String s = "appleorange";
      s = s.substring(1);
      Boolean a = s.startsWith("oran");
      System.out.println(findSubsets("abc"));

   }
   public static ArrayList<String> findSubsets(String str){
      ArrayList<String> subsets = findSubsetsHelper(str);
      subsets.remove(subsets.size()-1);
      return subsets;
   }

   //find all the subsets of the string str eg: "abc" => a ,ab ,ac ,bc ,abc
   public static ArrayList<String> findSubsetsHelper(String str){
      if(str.length() == 0){
         ArrayList<String> baseList = new ArrayList<>();
         baseList.add("");
         return baseList;
      }
      char initChar = str.charAt(0);
      ArrayList<String> smallAns = findSubsetsHelper(str.substring(1));
      ArrayList<String> ans = new ArrayList<>();
      ans.addAll(smallAns);
      for(int i=0;i<ans.size();i++){
         ans.set(i,initChar+ans.get(i));
      }
      ans.addAll(smallAns);
      return ans;
   }
}
