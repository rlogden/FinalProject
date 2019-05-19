package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;

public class DefaultEmployeeService implements EmployeeService {

    EmployeeRepository repository;

    public DefaultEmployeeService(EmployeeRepository repository) {

        this.repository = repository;
    }

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
        getEmployeeById(id).setHoursWorked(getEmployeeById(id).getHoursWorked() + hours); }
}
