package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;

public class DefaultEmployeeController implements EmployeeController {
    DefaultEmployeeService service = new DefaultEmployeeService();

    @Override
    public HashMap<Integer, Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @Override
    public void updateEmployeeHours(Integer id, Double hours) {
        service.updateEmployeeHours(id, hours);
    }
}
