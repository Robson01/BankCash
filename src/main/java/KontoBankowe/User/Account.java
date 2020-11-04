package KontoBankowe.User;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Scanner;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double id;
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
