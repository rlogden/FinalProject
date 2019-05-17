package edu.dmacc.codedsm.finalproject;

public class DefaultEmployeeRepository implements EmployeeRepository {
    DefaultEmployeeController controller = new DefaultEmployeeController();

    @Override
    public Employee getEmployeeById(Integer id){
        return controller.getAllEmployees().get(id);
    }

    @Override
    public void saveEmployee(Employee employee) {

    }
}
