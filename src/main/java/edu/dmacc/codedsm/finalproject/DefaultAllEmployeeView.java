package edu.dmacc.codedsm.finalproject;

public class DefaultAllEmployeeView implements AllEmployeeView{

    DefaultEmployeeController controller = new DefaultEmployeeController();

    public void viewAllEmployees(){
         controller.getAllEmployees().forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
