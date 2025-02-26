package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

class FilterJson {
    public static void main(String[] args) {
        String parseJSON = "[{\"name\":\"Anuj\",\"age\":26},{\"name\":\"Bhagyodaya\",\"age\":22}]";
        JSONArray jsonArray = new JSONArray(parseJSON);
        JSONArray filteredJSONArray = new JSONArray();

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            if (jsonObject.getInt("age") > 25) {
                filteredJSONArray.put(jsonObject);
            }
        }
        System.out.println(filteredJSONArray);
    }
}
