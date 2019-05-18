package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;

public class DefaultDataLoaderController implements DataLoaderController {

    EmployeeRepository repository = new DefaultEmployeeRepository();
    DataLoaderService service;

    public DefaultDataLoaderController(DataLoaderService service) {
        this.service = service;
    }

    @Override
    public HashMap<Integer, Employee> loadData() {
        service.saveEmployeeList(repository.getRepEmployeeList());
        return repository.getRepEmployeeList();
    }
}
