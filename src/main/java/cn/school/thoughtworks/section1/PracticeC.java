package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String, List<String>> collection2) {
        List<String> result = new ArrayList<>();
        try{
            if(null!=collection1&&collection1.size()>0&&null!=collection2&&collection2.size()>0){
                List<String> list = collection2.get("value");
                for(int i =0;i<collection1.size();i++){
                    if(list.contains(collection1.get(i))){
                        result.add(collection1.get(i));
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
