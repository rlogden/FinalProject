package edu.dmacc.codedsm.finalproject;

public class DefaultPayrollController implements PayrollController {

    private PayrollService service;

    public DefaultPayrollController(PayrollService service) {
        this.service = service;
    }

    @Override
    public void processPayroll() {
        service.calculatePayroll();
    }
}
