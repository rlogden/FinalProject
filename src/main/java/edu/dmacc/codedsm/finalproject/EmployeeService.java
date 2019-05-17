package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;

public interface EmployeeService {
    HashMap<Integer, Employee> getAllEmployees();
    Employee getEmployeeById(Integer id);
    void updateEmployeeHours(Integer id, Double hours);
}
