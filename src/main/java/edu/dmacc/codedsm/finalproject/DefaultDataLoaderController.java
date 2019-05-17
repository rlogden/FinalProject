package edu.dmacc.codedsm.finalproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class DefaultDataLoaderController implements DataLoaderController {
    private HashMap<Integer, Employee> employeeList = new HashMap<>();

    @Override
    public HashMap<Integer, Employee> loadData() {
        String filePath = "initial_load.txt";
        String line;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String employeeNumber = parts[0];
                String employeeName = parts[1];
                String hourlyRate = parts[2];
                Employee storeEmployee = new Employee(employeeName, Double.parseDouble(hourlyRate));
                storeEmployee.setId(Integer.parseInt(employeeNumber));
                employeeList.put(Integer.parseInt(employeeNumber), storeEmployee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return employeeList;
        }
    }
}
