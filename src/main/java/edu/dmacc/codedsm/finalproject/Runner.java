package edu.dmacc.codedsm.finalproject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        GeneralService generalService = new GeneralService();
        DefaultDataLoaderService dataLoaderService = new DefaultDataLoaderService();
        DefaultEmployeeRepository defaultEmployeeRepository = new DefaultEmployeeRepository();
        DefaultPayrollService payrollService = new DefaultPayrollService();
        DefaultDataLoaderController dataLoaderController = new DefaultDataLoaderController();
        DefaultEmployeeController employeeController = new DefaultEmployeeController();
        Scanner input = new Scanner(System.in);

        dataLoaderController.loadData();
        Boolean programRunning = true;
        while (programRunning) {
            System.out.println("Please enter:" + "\n" + "1 to list all employees" + "\n" + "2 to update an employee's hours"
                    + "\n" + "3 to process payroll and exit" + "\n" + "4 to exit");
            String userInput = input.next();
            if (userInput.equals("1")) {
                employeeController.getAllEmployees().forEach((key, value) -> System.out.println(key + " : " + value));
            } else if (userInput.equals("2")){
                System.out.println("Please enter the employee's ID to update their hours.");
                String enteredId = input.next();
                if (generalService.inputContainsValidId(enteredId)) {
                    int enteredIdInt = Integer.parseInt(enteredId);
                    Employee employeeToUpdate = defaultEmployeeRepository.getEmployeeById(enteredIdInt);
                    HashMap<Integer,Employee> updatingEmployee = new HashMap<>();
                    updatingEmployee.put(enteredIdInt, employeeToUpdate);
                    updatingEmployee.forEach((key, value) -> System.out.println(key + " : " + value));
                    System.out.println("Please enter the amount of hours you would like to add.");
                    double addedHours = input.nextDouble();
                    employeeToUpdate.setHoursWorked(addedHours);
                    employeeController.updateEmployeeHours(enteredIdInt, addedHours);
                    updatingEmployee.forEach((key, value) -> System.out.println("Employee updated to:" + "\n" + key + " : " + value));
                } else {
                    System.out.println("Employee not found.");
                }
            } else if (userInput.equals("3")) {
                payrollService.calculatePayroll((dataLoaderService.getEmployeeList()));
                programRunning = false;
            } else {
                System.out.println("I'm sorry, that is not a valid input.");
            }
        }
    }
}
