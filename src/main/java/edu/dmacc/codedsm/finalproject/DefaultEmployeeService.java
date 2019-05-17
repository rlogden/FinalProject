package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;

public class DefaultEmployeeService implements EmployeeService {

    DefaultEmployeeRepository repository = new DefaultEmployeeRepository();

    @Override
    public HashMap<Integer, Employee> getAllEmployees() {
        return repository.getRepEmployeeList();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return repository.getEmployeeById(id);
    }

    @Override
    public void updateEmployeeHours(Integer id, Double hours) {
        Employee employeeToUpdate = getAllEmployees().get(id);
        employeeToUpdate.setHoursWorked(hours);
        getAllEmployees().replace(id, employeeToUpdate);
    }
}
