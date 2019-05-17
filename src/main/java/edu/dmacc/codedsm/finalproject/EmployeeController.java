package edu.dmacc.codedsm.finalproject;

import java.io.IOException;
import java.util.HashMap;

public interface EmployeeController {
    public HashMap<Integer, Employee> getAllEmployees();
    public void updateEmployeeHours(Integer id, Double hours);
}
