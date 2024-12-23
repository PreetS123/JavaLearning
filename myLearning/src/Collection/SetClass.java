package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {
        Set<Integer> mySet= new HashSet<>();
        mySet.add(2);
        mySet.add(-1);
        mySet.add(13);
        mySet.add(12);
        System.out.println(mySet);
    }
}
