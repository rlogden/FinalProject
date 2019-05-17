package edu.dmacc.codedsm.finalproject;

import java.io.IOException;

public interface EmployeeRepository {
    public Employee getEmployeeById(Integer id) throws IOException;

    public void  saveEmployee (Employee employee);
}
