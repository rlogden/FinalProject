package edu.dmacc.codedsm.finalproject;

import java.util.HashMap;

public interface DataLoaderService {

    HashMap<Integer, Employee> readFile();
    void saveEmployeeList(HashMap<Integer, Employee> repository);

}
