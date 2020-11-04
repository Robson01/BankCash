package KontoBankowe;


import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu2();

    }

    private static void menu2() {
        Scanner scanner = new Scanner(System.in);
        Konto konto = new Konto();
        int menuOption1;

        System.out.println("Welcome in BankCash");
        System.out.println("Yours account balance is " + konto.getAccountBalance());
        System.out.println("What would you do?");
        System.out.println("1.Payment");
        System.out.println("2.PayOff");
        System.out.println("3.Exit");

        menuOption1 = scanner.nextInt();

        switch (menuOption1) {
            case 1:
                System.out.println("How much you payment?");
                konto.getPayment(scanner.nextDouble());
                break;
            case 2:
                System.out.println("How much you payoff?");
                konto.getPayOff(scanner.nextDouble());
                break;
            case 3:
                System.out.println("Good bay");
                break;
            default:
                System.out.println("Error");

        }
    }
}
