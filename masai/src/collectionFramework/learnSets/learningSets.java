package collectionFramework.learnSets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class learningSets {
    public static void main(String[] args) {

        Set<Students> studentSet= new HashSet<>();

        studentSet.add(new Students("preeti",12));
        studentSet.add(new Students("priya",21));
        studentSet.add(new Students("manoj",13));
        studentSet.add(new Students("kunal",12));
        System.out.println(studentSet);

//        Set<Integer> set= new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
//        Set<Integer> set = new TreeSet<>(); // log(n) since it internally works on binary tree
//
//        set.add(2);
//        set.add(0);
//        set.add(-1);
//        set.add(8);
//        System.out.println(set);
    }
}

