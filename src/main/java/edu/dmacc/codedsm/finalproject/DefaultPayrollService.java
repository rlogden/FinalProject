package edu.dmacc.codedsm.finalproject;

import java.io.*;
import java.text.NumberFormat;
import java.util.HashMap;

public class DefaultPayrollService implements PayrollService {

    private EmployeeRepository repository;

    public DefaultPayrollService(EmployeeRepository repository) {

        this.repository = repository;
    }

    @Override
    public void calculatePayroll() {
        HashMap<Integer, PaidEmployee> paidEmployees = new HashMap<>();
        PrintStream out = null;

        for (Employee employee : repository.getRepEmployeeList().values()) {
            Double amountPaid;
            amountPaid = employee.getHoursWorked() * employee.getHourlyRate() / 1.2;
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            PaidEmployee storeEmployee = new PaidEmployee(employee.getName(), formatter.format(amountPaid));
            paidEmployees.put(employee.getId(), storeEmployee);
        }

        try {
            out = new PrintStream(new File("payroll_results.txt"));
            for (HashMap.Entry<Integer, PaidEmployee> entry : paidEmployees.entrySet()) {
                Integer key = entry.getKey();
                Object value = entry.getValue();
                out.print("ID: " + key.toString() + "\n" + value.toString() + "\n");
            }
        } catch(IOException e) {
            System.out.println("IOException : " + e);
        } finally {
            if (out != null) {
                        out.close();
            }
        }
    }
}