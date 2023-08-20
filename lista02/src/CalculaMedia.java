// Exercício 03 - Lista 02 - POO

import java.util.Scanner;
public class CalculaMedia {
    public static float media(float a, float b, float c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        float n1, n2, n3;

        System.out.print("Insira o primeiro número: ");
        n1 = r.nextFloat();
        System.out.print("Insira o segundo número: ");
        n2 = r.nextFloat();
        System.out.print("Insira o terceiro número: ");
        n3 = r.nextFloat();

        System.out.println("\nA soma dos números é: " + (n1 + n2 + n3));
        System.out.printf("A média aritmética dos números é: %.2f" ,media(n1, n2, n3));
    }
}
