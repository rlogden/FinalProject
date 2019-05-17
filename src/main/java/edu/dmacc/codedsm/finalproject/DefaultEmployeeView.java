package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;

public class DefaultEmployeeView implements EmployeeView {

    DefaultEmployeeService service = new DefaultEmployeeService();

    @Override
    public void viewSingleEmployee(Integer id) {
        HashMap<Integer,Employee> empToBeViewed = new HashMap<>();
        empToBeViewed.put(id, service.getEmployeeById(id));
        empToBeViewed.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
