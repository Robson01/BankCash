package KontoBankowe;


import java.util.Scanner;

public class Konto {

    private double accountBalance = 12;
    private double payment;
    private double payOff;
    private double amount;


    public double getPayment(double amount) {
        payment = (accountBalance + amount);
        System.out.println("Yours account balance is " + payment);
        return payment;
    }

    public double getPayOff(double amount) {
        payOff = (accountBalance - amount);
        System.out.println("Yours account balance is " + payOff);
        return payOff;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
