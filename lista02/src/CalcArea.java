// Exercício 07 - Lista 02 - POO

import java.util.Scanner;
public class CalcArea {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        double b, h;

        System.out.print("Insira a base do retângulo: ");
        b = r.nextDouble();

        System.out.print("Insira a altura do retângulo: ");
        h = r.nextDouble();

        System.out.println("\nÁrea do Retângulo: " + (b * h));
        System.out.println("Perímetro do Retângulo: " + (2 * (b + h)));
    }
}
