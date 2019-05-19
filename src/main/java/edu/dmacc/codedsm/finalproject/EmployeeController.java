package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;

public interface EmployeeController {
    HashMap<Integer, Employee> getAllEmployees();
    void updateEmployeeHours(Integer id, Double hours);
    Employee getSingleEmployee(Integer id);
}
