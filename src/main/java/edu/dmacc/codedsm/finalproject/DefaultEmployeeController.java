package edu.dmacc.codedsm.finalproject;

import java.io.IOException;
import java.util.HashMap;

public class DefaultEmployeeController implements EmployeeController {
    DefaultDataLoaderService service = new DefaultDataLoaderService();

    HashMap<Integer, Employee> controllerEmployeeList = service.getEmployeeList();

    @Override
    public HashMap<Integer, Employee> getAllEmployees() {
        return controllerEmployeeList;
    }

    @Override
    public void updateEmployeeHours(Integer id, Double hours) {
        Employee employeeToUpdate = controllerEmployeeList.get(id);
        employeeToUpdate.setHoursWorked(hours);
        controllerEmployeeList.replace(id, employeeToUpdate);
    }
}
