// Exercício 02 - Lista 02 - POO

import java.util.Scanner;
public class CalculaProd {
    public static int multiplicar(int a, int b) {
        return (a * b);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner r = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        a = r.nextInt();
        System.out.print("Insira o segundo número: ");
        b = r.nextInt();

        System.out.println("O produto dos números informados é " + multiplicar(a, b) + ".");
    }
}
