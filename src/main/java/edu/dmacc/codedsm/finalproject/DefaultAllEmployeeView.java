package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;

public class DefaultAllEmployeeView implements AllEmployeeView{

    @Override
    public void viewAllEmployees(HashMap<Integer, Employee> employeeList){
         employeeList.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
