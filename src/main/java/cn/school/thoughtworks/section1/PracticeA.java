package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1,List<String> collection2) {
        List<String> result = new ArrayList<>();
        try{
            if(null!=collection1&&collection1.size()>0&&null!=collection2&&collection2.size()>0){
                for (int i = 0;i< collection1.size();i++){
                    if (collection2.contains(collection1.get(i)))
                    {
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
