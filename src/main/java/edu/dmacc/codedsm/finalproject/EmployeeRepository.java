package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;

public interface EmployeeRepository {
    Employee getEmployeeById(Integer id);
    void saveEmployee (Integer id, Employee employee);
    HashMap<Integer, Employee> getRepEmployeeList();
}
