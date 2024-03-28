package com.perscholas.java_basics.interface_task;

public interface CashBackable {
    boolean isCashBackSupported();
    default double getCashBackPercent(){
        return 0.0;
    }
    default double calculateCashBack(double transactionAmount){
        if(isCashBackSupported()) {
            return transactionAmount*getCashBackPercent();
        }
        return 0.0;
    }
}
