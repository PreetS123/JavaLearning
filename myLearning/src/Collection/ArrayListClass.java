package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> myArr= new ArrayList<>();
        myArr.add(9);
        myArr.add(-9);
        myArr.add(2);
        myArr.add(0);
        myArr.add(19);
        myArr.add(0,7);
        myArr.remove(2);
        Collections.sort(myArr);
        System.out.println(myArr);

    }
}
