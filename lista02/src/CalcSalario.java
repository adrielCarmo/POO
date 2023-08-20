// Exercício 08 - Lista 02 - POO

import java.util.Scanner;
public class CalcSalario {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        double salario, ppReajuste;

        System.out.print("Informe o salário atual do funcionário: ");
        salario = r.nextDouble();

        System.out.print("Insira o percentual de reajuste: ");
        ppReajuste = r.nextDouble();

        ppReajuste = ppReajuste / 100;
        salario = salario + (salario * ppReajuste);

        System.out.printf("\nSalário com Reajuste: R$%.2f" ,salario);
    }
}
