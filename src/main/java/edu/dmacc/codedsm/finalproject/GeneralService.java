package edu.dmacc.codedsm.finalproject;

public class GeneralService {
    final String[] ID_NUMS = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public boolean inputContainsValidId(String inputStr) {
        inputStr.replaceAll("\\s+", "");
        boolean test = false;
        for (String element : ID_NUMS) {
            if (element.equals(inputStr)) {
                test = true;
                break;
            }
        }
        return test;
    }
}