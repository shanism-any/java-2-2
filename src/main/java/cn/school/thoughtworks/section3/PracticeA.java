package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeA {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {

        List<String> temp = new ArrayList<String>();
        List<String> arry = new ArrayList<String>();
        Set<String> set = object.keySet();
        for(String key:set) {
            arry = object.get(key);
            for (String sttr : arry) {
                temp.add(sttr);
            }
        }
        Iterator<Map.Entry<String,Integer>> iterator = collectionA.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            if(temp.contains(entry.getKey())){
                collectionA.put(entry.getKey(),entry.getValue()-1);
            }
        }
        return collectionA;
    }
}
