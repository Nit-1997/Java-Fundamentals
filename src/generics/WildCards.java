package generics;

import java.util.ArrayList;

//T can be either Number or subclasses of Number
public class WildCards <T extends Number>{
    public void getList(ArrayList<? extends Number> list){
         // can pass Number . float . int
    }

}
