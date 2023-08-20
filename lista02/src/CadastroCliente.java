// Exercício 05 - Lista 05 - POO

import java.util.Scanner;
public class CadastroCliente {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String nome, endereco, telefone;

        System.out.print("Informe o seu nome: ");
        nome = r.nextLine();

        System.out.print("Informe o seu endereço: ");
        endereco = r.nextLine();

        System.out.print("Informe o seu telefone: ");
        telefone = r.nextLine();

        System.out.println("\nNome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}
