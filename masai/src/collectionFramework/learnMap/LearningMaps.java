package collectionFramework.learnMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearningMaps {
    public static void main(String[] args) {
        Map<String, Integer> map= new TreeMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);
        map.put("Six",6);

        map.put("Two",21);
        System.out.println(map);
        for(Map.Entry<String,Integer>e: map.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
