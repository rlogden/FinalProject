package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;


public class DefaultDataLoaderService implements DataLoaderService{

    DefaultDataLoaderController dataLoaderController = new DefaultDataLoaderController();

    private HashMap<Integer, Employee> employeeList = dataLoaderController.loadData();

    public HashMap<Integer, Employee> getEmployeeList(){
        return employeeList;
    }

}
