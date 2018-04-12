package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> mp = new HashMap<String, Integer>();
        List<String> temp = new ArrayList<String>();
        List<String> arry = new ArrayList<String>();
        for(String str:collectionA){
            if(mp.containsKey(str)){
                mp.put(str,mp.get(str).intValue()+1);
            }
            else{
                mp.put(str,1);
            }
        }
        Set<String> set = object.keySet();
        for(String key:set) {
            arry = object.get(key);
            for (String sttr : arry) {
                temp.add(sttr);
            }
        }
        Iterator<Map.Entry<String,Integer>> iterator = mp.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            if(temp.contains(entry.getKey())){
                int discount = entry.getValue()/3;
                mp.put(entry.getKey(),entry.getValue()-discount);
            }
        }
        return mp;
    }
}
