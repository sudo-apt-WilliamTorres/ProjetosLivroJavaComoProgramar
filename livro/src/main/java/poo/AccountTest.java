package poo;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       Account account1 = new Account("William Torres", 50.00);
       Account account2 = new Account("Warlen Torres", -7.50);

        System.out.printf("Conta: %s Saldo: %.2f\n", account1.getName(), account1.getBalance());
        System.out.println();
        System.out.printf("Conta: %s Saldo: %.2f\n", account2.getName(), account2.getBalance());
        System.out.println();

        System.out.println("Digite o valor do depósito para account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("Depositando %.2f para account\n", depositAmount);
        account1.deposit(depositAmount);
        System.out.println();

        System.out.printf("Conta: %s Saldo: %.2f \n", account1.getName(), account1.getBalance());
        System.out.println();
        System.out.printf("Conta: %s Saldo: %.2f\n", account2.getName(), account2.getBalance());
        System.out.println();

        System.out.println("Digite o valor do depósito para account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("Depositando %.2f em account2...\n", depositAmount);
        account2.deposit(depositAmount);
        System.out.println();

        System.out.printf("Conta: %s Saldo: %.2f \n", account1.getName(), account1.getBalance());
        System.out.println();
        System.out.printf("Conta: %s Saldo: %.2f\n", account2.getName(), account2.getBalance());
        System.out.println();

    }
}