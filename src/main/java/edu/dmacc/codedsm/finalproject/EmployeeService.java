package edu.dmacc.codedsm.finalproject;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById();
    public void updateEmployeeHours();
}
