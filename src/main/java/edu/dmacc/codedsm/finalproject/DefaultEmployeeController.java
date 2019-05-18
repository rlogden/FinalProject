package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;

public class DefaultEmployeeController implements EmployeeController {

    private EmployeeService employeeService;

    public DefaultEmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @Override
    public HashMap<Integer, Employee> getAllEmployees() {

        return employeeService.getAllEmployees();
    }

    @Override
    public void updateEmployeeHours(Integer id, Double hours) {

        employeeService.updateEmployeeHours(id, hours);
    }

    @Override
    public Employee getSingleEmployee(Integer id){
        return employeeService.getEmployeeById(id);
    }

}
