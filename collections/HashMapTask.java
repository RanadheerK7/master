package org.stackmybiz.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTask {
    public static void main(String[] args) {
        HashMap<String, String> capitalMap = new HashMap<String, String>();
        capitalMap.put("Telangana", "Hyderabad");
        capitalMap.put("AndhraPradesh", "Amaravathi");
        capitalMap.put("Jharkhand", "Ranchi");
        capitalMap.put("Karnataka", "Bangolore");
        capitalMap.put("Tamilnadu", "Chennai");
        capitalMap.put("Tamilnadu","Thiruvananthapuram");
        capitalMap.put(null, "Kolkata");
        capitalMap.put(null, "Delhi");
        capitalMap.put("Maharashtra", null);
        capitalMap.put("Odisha", null);


        Iterator<String> keys = capitalMap.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            String value = capitalMap.get(key);
            System.out.println("Key: " + key + " Value: " + value);
        }

        Iterator<Entry<String, String>> set = capitalMap.entrySet().iterator();
        while (set.hasNext()) {
            Entry<String, String> entry = set.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(1, "A");
        map2.put(2, "B");
        map2.put(3, "C");
        map2.put(4, "D");

        //Comparison of maps
        System.out.println(map1.equals(map2));

        //Comparison of keys
        System.out.println(map1.keySet().equals(map2.keySet()));

        //Identify the extra keys
        HashSet<Integer> combineKeys = new HashSet<Integer>(map1.keySet());
        combineKeys.addAll(map2.keySet());
        combineKeys.removeAll(map1.keySet());
        System.out.println(combineKeys);

    }
}
