package org.example;

import org.json.JSONArray;
import org.json.JSONObject;
import java.sql.*;

public class DBToJson{
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/bridgelabz";
        String user = "root";
        String pass = "Bhagy@1234";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {

            JSONArray jsonArray = new JSONArray();

            while (rs.next()) {
                JSONObject obj = new JSONObject();
                obj.put("id", rs.getInt("id"));
                obj.put("name", rs.getString("name"));
                obj.put("department", rs.getString("department"));
                obj.put("salary", rs.getInt("salary"));
                jsonArray.put(obj);
            }

            System.out.println(jsonArray);
        }
    }
}
