package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;

public class DefaultEmployeeRepository implements EmployeeRepository {

    HashMap<Integer, Employee> repEmployeeList = new HashMap<>();

    @Override
    public Employee getEmployeeById(Integer id){
        return repEmployeeList.get(id);
    }

    @Override
    public void saveEmployee(Integer id, Employee employee){

        repEmployeeList.put(id, employee);
    }

    public HashMap<Integer, Employee> getRepEmployeeList() {
        return repEmployeeList;
    }


    @Override
    public void setRepEmployeeList(HashMap<Integer, Employee> repEmployeeList) {
        this.repEmployeeList = repEmployeeList;
    }
}
