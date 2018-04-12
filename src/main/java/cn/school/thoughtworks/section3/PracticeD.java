package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        List<String> ltemp = new ArrayList<String>();
        List<String> arry = new ArrayList<String>();
        Map<String,Integer> mp = new HashMap<String, Integer>();

        for (String str :collectionA){
            if(str.length()==1){
                if(mp.containsKey(str)){
                    mp.put(str,mp.get(str).intValue()+1);
                }
                else {
                    mp.put(str,1);
                }
            }
            else {
                String temp = str.replaceAll("[^0-9]","");
                String stemp = str.replaceAll("[^a-z]","");
                if(mp.containsKey(stemp)){
                    mp.put(stemp,mp.get(stemp).intValue()+Integer.parseInt(temp));
                }
                else {
                    mp.put(stemp,Integer.parseInt(temp));
                }
            }
        }
        Set<String> set = object.keySet();
        for(String key:set) {
            arry = object.get(key);
            for (String sttr : arry) {
                ltemp.add(sttr);
            }
        }
        Iterator<Map.Entry<String,Integer>> iterator = mp.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            if(ltemp.contains(entry.getKey())){
                int discount = entry.getValue()/3;
                mp.put(entry.getKey(),entry.getValue()-discount);
            }
        }
        return mp;
    }
}
