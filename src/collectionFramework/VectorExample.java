package collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {

    // List<Integer> v = new Vector<>();

    enum Week{
        Monday,Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        //these are enum constants
        // public, static and final
        // you can create child enums
        // type is week
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for(Week day : Week.values()){
            System.out.println(day);
            System.out.println(day.ordinal());
        }

        int [] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        for(int i=0;i<arr.length;i++){

        }
    }
}
