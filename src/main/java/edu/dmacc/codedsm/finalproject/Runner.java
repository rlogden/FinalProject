package edu.dmacc.codedsm.finalproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Runner {

    public static void main(String[] args) throws IOException {
        readTxt();
    }

    public static void readTxt() throws IOException {
        String filePath = "initial_load.txt";

        Map<Integer, Employee> employeeList = new HashMap<>();
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String employeeNumber = parts[0];
            String employeeName = parts[1];
            String hourlyRate = parts[2];
            Employee storeEmployee = new Employee(employeeName, Double.parseDouble(hourlyRate));
            storeEmployee.setId(Integer.parseInt(employeeNumber));
            employeeList.put(Integer.parseInt(employeeNumber), storeEmployee);
        }
        employeeList.forEach((key, value) -> System.out.println(key + " : " + value));
    }

            }
