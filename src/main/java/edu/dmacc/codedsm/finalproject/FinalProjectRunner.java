package edu.dmacc.codedsm.finalproject;

import java.util.Scanner;

public class FinalProjectRunner {

    public static void main(String[] args) {
        GeneralService generalService = new GeneralService();
        DefaultDataLoaderService dataLoaderService = new DefaultDataLoaderService();
        DefaultPayrollService payrollService = new DefaultPayrollService();
        DefaultDataLoaderController dataLoaderController = new DefaultDataLoaderController();
        DefaultEmployeeController employeeController = new DefaultEmployeeController();
        DefaultEmployeeView employeeView = new DefaultEmployeeView();
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
                    employeeView.viewSingleEmployee(enteredIdInt);
                    System.out.println("Please enter the amount of hours you would like to add.");
                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input.\nPlease enter the amount of hours you would like to add.");
                        input.next();
                    }
                    double addedHours = input.nextDouble();
                    employeeController.updateEmployeeHours(enteredIdInt, addedHours);
                    System.out.println("Employee updated to:");
                    employeeView.viewSingleEmployee(enteredIdInt);
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
