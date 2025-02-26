package org.example;

import org.json.*;

public class JsonObject {
    public static void main(String[] args) {
        JSONObject students = new JSONObject();
        students.put("name","Bhagyodaya");
        students.put("age",22);
        students.put("subjects",new JSONArray().put("Java").put(".net"));

        System.out.println(students);
    }
}
