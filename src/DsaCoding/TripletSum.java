package DsaCoding;

import java.awt.datatransfer.StringSelection;
import java.util.Arrays;

public class TripletSum {
    //O(n^2)
    public static int[] tripletSum(int[] arr,int target){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int l = i+1;
            int r = arr.length - 1;
            while(r>l){
                if(arr[l]+arr[r]+arr[i] == target) {
                    return new int[]{arr[l], arr[r], arr[i]};
                }else if(arr[l]+arr[r]+arr[i] > target){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return new int[]{};
    }

    public static String replaceString(String param) {
            String[] splitArr = param.split("\\.");
            System.out.println(splitArr.length);
            for(int i=0;i<splitArr.length;i++){
                System.out.println(splitArr[i]);
            }
            int l = 0;
            int r = splitArr.length;
            while(r>l){
                String temp = splitArr[r];
                splitArr[r] = splitArr[l];
                splitArr[l] = temp;
                r--;
                l++;
            }
            return String.join(".",splitArr);

    }

    public static String CountingSort(String input) {


        return "";
    }

    public static void main(String[] args) {
        System.out.println(replaceString("nitinbhat"));

//        int [] arr = {3,2,3,4,5,6,2};
//        int targetSum = 12;
//        int [] ans = tripletSum(arr,targetSum);
//        if(ans.length > 0){
//            for(int i=0;i<ans.length;i++){
//                System.out.println(ans[i]);
//            }
//        }
    }

}
