package KontoBankowe;


import KontoBankowe.User.Account;
import KontoBankowe.User.AccountRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DataJpaConfiguration.class);
        AccountRepository accountRepository = context.getBean(AccountRepository.class);
        menu2();

    }

    private static void menu2() {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        int menuOption1;

        System.out.println("Welcome in BankCash");
        System.out.println("Yours account balance is " + account.getAccountBalance());
        System.out.println("What would you do?");
        System.out.println("1.Payment");
        System.out.println("2.PayOff");
        System.out.println("3.Exit");

        menuOption1 = scanner.nextInt();

        switch (menuOption1) {
            case 1:
                System.out.println("How much you payment?");
                account.getPayment(scanner.nextDouble());
                break;
            case 2:
                System.out.println("How much you payoff?");
                account.getPayOff(scanner.nextDouble());
                break;
            case 3:
                System.out.println("Good bay");
                break;
            default:
                System.out.println("Error");

        }
    }
}
