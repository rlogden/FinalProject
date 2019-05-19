package edu.dmacc.codedsm.finalproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class DefaultDataLoaderService implements DataLoaderService {

    private EmployeeRepository repository;

    public DefaultDataLoaderService(EmployeeRepository repository) {

        this.repository = repository;
    }

    @Override
    public HashMap<Integer, Employee> readFile() {
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
                repository.saveEmployee(Integer.parseInt(employeeNumber), storeEmployee);
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
            return repository.getRepEmployeeList();
        }
    }
}
