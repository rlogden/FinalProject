package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;

public class DefaultEmployeeView implements EmployeeView {

    @Override
    public void viewSingleEmployee(Integer id, Employee employee) {
        HashMap<Integer,Employee> empToBeViewed = new HashMap<>();
        empToBeViewed.put(id, employee);
        empToBeViewed.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
