package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;

public class DefaultDataLoaderController implements DataLoaderController {
    DefaultDataLoaderService service = new DefaultDataLoaderService();
    private HashMap<Integer, Employee> employeeList = new HashMap<>();
    DefaultEmployeeRepository repository = new DefaultEmployeeRepository();

    @Override
    public HashMap<Integer, Employee> loadData() {
        service.saveEmployeeList(employeeList);
        repository.setRepEmployeeList(employeeList);
        return repository.getRepEmployeeList();
    }
}
