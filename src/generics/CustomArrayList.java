package generics;

import java.util.ArrayList;

public class CustomArrayList<T> {


    private Object[] data;

    public void add(T num){
        data[0] = num;
    }

    public T remove(){
        T removed  = (T)(data[0]);
        return removed;
    }


    public static void main(String[] args) {
        //genrics <Integer> <String>
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        System.out.println(list.get(0));
    }
}
