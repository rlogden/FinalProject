package edu.dmacc.codedsm.finalproject;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertNull;

public class EmployeeServiceTest {

    DefaultEmployeeRepository repositoryStub = new DefaultEmployeeRepository();
    private DefaultEmployeeService classUnderTest;

    {

    }
    @Before
    public void setUp() throws Exception {
        DefaultEmployeeService classUnderTest = new DefaultEmployeeService(repositoryStub);
    }

    @Test
    public void getAllEmployees() {
        HashMap<Integer, Employee> testHashMap = new HashMap<>();
        repositoryStub.setRepEmployeeList(testHashMap);
        classUnderTest.getAllEmployees();
        assertNull(classUnderTest.getAllEmployees());
    }
}
