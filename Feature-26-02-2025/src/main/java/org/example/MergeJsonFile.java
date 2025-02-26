package org.example;

import org.json.JSONObject;
import java.util.*;

class MergeJsonFile {
    public static void main(String[] args) {
        JSONObject obj1 = new JSONObject().put("name", "bhagyodaya").put("age", "22");
        JSONObject obj2 = new JSONObject().put("id", "2115");

        Map<String, Object> map1 = obj1.toMap();
        Map<String, Object> map2 = obj2.toMap();

        map1.putAll(map2); // Merge both maps
        JSONObject mergedJson = new JSONObject(map1);

        System.out.println(mergedJson);
    }
}
