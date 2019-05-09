package edu.dmacc.codedsm.finalproject;

public class Employee {

    private String name;
    private Double hoursWorked = 0.00;
    private Double hourlyRate;
    private Integer id;

    public Employee(String name, Double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public Employee() {
        name = "No name given.";
        hoursWorked = 0.00;
        hourlyRate = 0.00;
        id = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\r\n" +
                "Hourly rate: " + hourlyRate + "\r\n" + "Hours worked: " + hoursWorked +  "\r\n";
    }
}
