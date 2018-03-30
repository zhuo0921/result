package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> value = object.get("value");
        for (String key: value) {
            updateValue(collectionA, key);
        }
        return collectionA;
    }

    private void updateValue(Map<String, Integer> collectionA, String key) {
        collectionA.put(key, collectionA.get(key) - 1);
    }
}
