package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;

public class DefaultEmployeeRepository implements EmployeeRepository {
    DefaultDataLoaderService service = new DefaultDataLoaderService();
    HashMap<Integer, Employee> repEmployeeList = service.getEmployeeList();

    @Override
    public Employee getEmployeeById(Integer id){
        return repEmployeeList.get(id);
    }

    @Override
    public void saveEmployee(Employee employee) {
        repEmployeeList.put((repEmployeeList.size() + 1), employee);
    }

    public HashMap<Integer, Employee> getRepEmployeeList() {
        return repEmployeeList;
    }
}
