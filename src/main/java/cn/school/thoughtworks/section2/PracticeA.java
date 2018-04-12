package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        try{
            if(null!=collection1&&collection1.size()>0){
                for(String item: collection1){
                    if(result.containsKey(item)){
                        result.put(item, result.get(item).intValue() + 1);
                    }else{
                        result.put(item, new Integer(1));
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
