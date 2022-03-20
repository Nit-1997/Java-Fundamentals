import java.lang.reflect.Array;
import java.util.HashMap;

public class DSA {
    public static int binarySearch(int[] arr, int val){
        int start = 0;
        int end = arr.length;
        while(end>start){
            int mid = (start+end)/2;
            if(arr[mid] == val){
                return mid;
            }else if(arr[mid]>val){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        //create an array
        int[] arr = new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i] = i+i;
        }
        int res = binarySearch(arr,6);
        if(res == -1){
            System.out.println("not found");
        }else{
            System.out.println("Found at index "+res);
        }

        int max = max(arr);
        System.out.println(max);
        //linear search
        //binary search

        System.out.println(arr.length);
        System.out.println(" ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }



        //create string
        //concatinate 2 strings
        //search within the string for a substring match


        //Arrays.copyOfRange(arr,st,end)


        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,1);

        // System is a final class cannot be changed, out is a final static reference variable of class PrintStream which uses println method to print to the console.
        System.out.println("print to console in new line");


        for(int val : map.values()){
            System.out.println(val);
        }

        for(int key : map.keySet()){
            System.out.println(key);
        }

        String s = "nitin";
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }

    }
}
