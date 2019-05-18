package edu.dmacc.codedsm.finalproject;

import java.util.Scanner;

public class FinalProjectRunner {

    public static void main(String[] args) {
        GeneralService generalService = new GeneralService();
        EmployeeRepository repository = new DefaultEmployeeRepository();
        DataLoaderService dataLoaderService = new DefaultDataLoaderService(repository);
        DataLoaderController dataLoaderController = new DefaultDataLoaderController(dataLoaderService);
        EmployeeService employeeService = new DefaultEmployeeService(repository);
        EmployeeController employeeController = new DefaultEmployeeController(employeeService);
        EmployeeView employeeView = new DefaultEmployeeView();
        AllEmployeeView allEmployeeView = new DefaultAllEmployeeView();
        Scanner input = new Scanner(System.in);

        dataLoaderController.loadData();
        Boolean programRunning = true;
        while (programRunning) {
            System.out.println("Please enter:" + "\n" + "1 to list all employees" + "\n" + "2 to update an employee's hours"
                    + "\n" + "3 to process payroll and exit" + "\n" + "4 to exit");
            String userInput = input.next();
            if (userInput.equals("1")) {
                allEmployeeView.viewAllEmployees(employeeController.getAllEmployees());
            } else if (userInput.equals("2")){
                System.out.println("Please enter the employee's ID to update their hours.");
                String enteredId = input.next();
                if (generalService.inputContainsValidId(enteredId)) {
                    int enteredIdInt = Integer.parseInt(enteredId);
                    employeeView.viewSingleEmployee(enteredIdInt, employeeController.getSingleEmployee(enteredIdInt));
                    System.out.println("Please enter the amount of hours you would like to add.");
                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input.\nPlease enter the amount of hours you would like to add.");
                        input.next();
                    }
                    double addedHours = input.nextDouble();
                    employeeController.updateEmployeeHours(enteredIdInt, addedHours);
                    System.out.println("Employee updated to:");
                    employeeView.viewSingleEmployee(enteredIdInt, employeeController.getSingleEmployee(enteredIdInt));
                } else {
                    System.out.println("Employee not found.");
                }
            } else if (userInput.equals("3")) {
                programRunning = false;
            } else {
                System.out.println("I'm sorry, that is not a valid input.");
            }
        }
    }
}
