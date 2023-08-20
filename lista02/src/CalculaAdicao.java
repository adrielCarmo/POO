import java.util.Scanner;

public class CalculaAdicao {
    public static int somar(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner r = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        a = r.nextInt();
        System.out.print("Insira o segundo número: ");
        b = r.nextInt();

        System.out.println("A soma dos números informados é " + somar(a, b) + "!");
    }
}
