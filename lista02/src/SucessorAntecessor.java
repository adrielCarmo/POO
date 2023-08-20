// Exercício 04 - Lista 04 - POO

import java.util.Scanner;
public class SucessorAntecessor {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int a;

        System.out.print("Informe o número desejado: ");
        a = r.nextInt();

        System.out.println("O antecessor do número informado é o: " + (a-1));
        System.out.println("O sucessor do número informado é o: " + (a+1));
    }
}
