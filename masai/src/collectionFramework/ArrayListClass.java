package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList();
        list.add(7);
        list.add(9);
        list.add(-1);
        list.add(0);
        list.add(3);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.add(0,-7); // used to add new element
        System.out.println(list);

        // for each loop
        for(Integer ele:list){
            System.out.println("looping "+ele);
        }

        Iterator<Integer> it= list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
