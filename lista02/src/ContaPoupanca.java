// Exercício 06 - Lista 02 - POO

import java.util.Scanner;
public class ContaPoupanca {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        double saldo;

        System.out.print("Insira o saldo de sua conta poupança: ");
        saldo = r.nextDouble();

        saldo = saldo + (saldo * 0.02);

        System.out.printf("Saldo com reajuste: R$%.2f" ,saldo);
    }
}
