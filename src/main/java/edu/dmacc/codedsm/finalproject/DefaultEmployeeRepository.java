package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;

public class DefaultEmployeeRepository implements EmployeeRepository {
    HashMap<Integer, Employee> repEmployeeList;


    @Override
    public Employee getEmployeeById(Integer id){
        return repEmployeeList.get(id);
    }

    @Override
    public void saveEmployee(HashMap<Integer, Employee> employeeList){
        setRepEmployeeList(employeeList);
    }

    public HashMap<Integer, Employee> getRepEmployeeList() {
        return repEmployeeList;
    }

    public void setRepEmployeeList(HashMap<Integer, Employee> repEmployeeList) {
        this.repEmployeeList = repEmployeeList;
    }
}
