package edu.dmacc.codedsm.finalproject;

public interface EmployeeRepository {
    Employee getEmployeeById(Integer id);
    void saveEmployee (Employee employee);
}
