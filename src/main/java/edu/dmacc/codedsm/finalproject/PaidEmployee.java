package edu.dmacc.codedsm.finalproject;

public class PaidEmployee {
    private String employeeName;
    private String netPay;

    public PaidEmployee(String employeeName, String netPay) {
        this.employeeName = employeeName;
        this.netPay = netPay;
    }

    @Override
    public String toString() {
        return "Name: " + employeeName + "\r\n" +
                "Net pay: " + netPay + "\r\n";
    }
}
