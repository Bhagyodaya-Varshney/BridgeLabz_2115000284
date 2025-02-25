package org.example;

import java.io.*;
import java.sql.*;
import com.opencsv.CSVWriter;

public class DatabaseToCSV {
    public static void main(String[] args) throws Exception{
        String jdbcURL = "jdbc:mysql://localhost/BridgeLabz";
        String dbUser = "root";
        String dbPassword = "Bhagy@1234";
        String csvFile = "databaseTocsv.csv";

        try (Connection conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, name, department, salary FROM employees");
             CSVWriter csvWriter = new CSVWriter(new FileWriter(csvFile))) {

            csvWriter.writeNext(new String[]{"Employee ID", "Name", "Department", "Salary"});

            while (rs.next()) {
                String[] row = {
                        String.valueOf(rs.getInt("id")),
                        rs.getString("name"),
                        rs.getString("department"),
                        String.valueOf(rs.getDouble("salary"))
                };
                csvWriter.writeNext(row);
            }
            System.out.println("CSV report generated successfully.");

        }
    }
}
