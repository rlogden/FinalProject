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
        HashMap<Integer, Employee> updaterMap = getAllEmployees();
        Employee employeeToUpdate = updaterMap.get(id);
        employeeToUpdate.setHoursWorked(hours);
        updaterMap.replace(id, employeeToUpdate);
        System.out.println(updaterMap);
        repository.setRepEmployeeList(updaterMap);
    }
}
