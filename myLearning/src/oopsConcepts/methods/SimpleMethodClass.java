package oopsConcepts.methods;

import java.util.HashMap;
import java.util.Map;

public class SimpleMethodClass {
    public static void main(String[] args) {
//        SimpleMethodClass.getName("Preeti");
            SimpleMethodClass newObj= new SimpleMethodClass();
            newObj.getName("Preeti");
//        Map<String, String> obj = new HashMap<>();
//        obj.put("name","preeti");
//        obj.put("age","28");
//        System.out.println(obj);
    }

    public void getName(String name){
       System.out.println(name);
    }
    public String age(int a){
        return String.valueOf(a);
    }
}
