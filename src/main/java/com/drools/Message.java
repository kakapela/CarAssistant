package com.drools;

public class Message {
    private String printMessage;

    public String getPrintMessage() {
        return printMessage;
    }
    public void setPrintMessage(String printMessage) {
        this.printMessage = printMessage;
    }
    public void showMessage() {
        System.out.print(printMessage);
    }
}
